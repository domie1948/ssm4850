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


import com.dao.DiscusswangzhituijianDao;
import com.entity.DiscusswangzhituijianEntity;
import com.service.DiscusswangzhituijianService;
import com.entity.vo.DiscusswangzhituijianVO;
import com.entity.view.DiscusswangzhituijianView;

@Service("discusswangzhituijianService")
public class DiscusswangzhituijianServiceImpl extends ServiceImpl<DiscusswangzhituijianDao, DiscusswangzhituijianEntity> implements DiscusswangzhituijianService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusswangzhituijianEntity> page = this.selectPage(
                new Query<DiscusswangzhituijianEntity>(params).getPage(),
                new EntityWrapper<DiscusswangzhituijianEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusswangzhituijianEntity> wrapper) {
		  Page<DiscusswangzhituijianView> page =new Query<DiscusswangzhituijianView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusswangzhituijianVO> selectListVO(Wrapper<DiscusswangzhituijianEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusswangzhituijianVO selectVO(Wrapper<DiscusswangzhituijianEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusswangzhituijianView> selectListView(Wrapper<DiscusswangzhituijianEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusswangzhituijianView selectView(Wrapper<DiscusswangzhituijianEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
