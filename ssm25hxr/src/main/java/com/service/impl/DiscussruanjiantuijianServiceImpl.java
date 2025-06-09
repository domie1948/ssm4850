package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.DiscussruanjiantuijianDao;
import com.entity.DiscussruanjiantuijianEntity;
import com.service.DiscussruanjiantuijianService;
import com.entity.vo.DiscussruanjiantuijianVO;
import com.entity.view.DiscussruanjiantuijianView;

@Service("discussruanjiantuijianService")
public class DiscussruanjiantuijianServiceImpl extends ServiceImpl<DiscussruanjiantuijianDao, DiscussruanjiantuijianEntity> implements DiscussruanjiantuijianService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussruanjiantuijianEntity> page = this.selectPage(
                new Query<DiscussruanjiantuijianEntity>(params).getPage(),
                new EntityWrapper<DiscussruanjiantuijianEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussruanjiantuijianEntity> wrapper) {
		  Page<DiscussruanjiantuijianView> page =new Query<DiscussruanjiantuijianView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussruanjiantuijianVO> selectListVO(Wrapper<DiscussruanjiantuijianEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussruanjiantuijianVO selectVO(Wrapper<DiscussruanjiantuijianEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussruanjiantuijianView> selectListView(Wrapper<DiscussruanjiantuijianEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussruanjiantuijianView selectView(Wrapper<DiscussruanjiantuijianEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
