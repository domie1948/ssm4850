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


import com.dao.DiscussjihuafenxiangDao;
import com.entity.DiscussjihuafenxiangEntity;
import com.service.DiscussjihuafenxiangService;
import com.entity.vo.DiscussjihuafenxiangVO;
import com.entity.view.DiscussjihuafenxiangView;

@Service("discussjihuafenxiangService")
public class DiscussjihuafenxiangServiceImpl extends ServiceImpl<DiscussjihuafenxiangDao, DiscussjihuafenxiangEntity> implements DiscussjihuafenxiangService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussjihuafenxiangEntity> page = this.selectPage(
                new Query<DiscussjihuafenxiangEntity>(params).getPage(),
                new EntityWrapper<DiscussjihuafenxiangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussjihuafenxiangEntity> wrapper) {
		  Page<DiscussjihuafenxiangView> page =new Query<DiscussjihuafenxiangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussjihuafenxiangVO> selectListVO(Wrapper<DiscussjihuafenxiangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussjihuafenxiangVO selectVO(Wrapper<DiscussjihuafenxiangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussjihuafenxiangView> selectListView(Wrapper<DiscussjihuafenxiangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussjihuafenxiangView selectView(Wrapper<DiscussjihuafenxiangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
