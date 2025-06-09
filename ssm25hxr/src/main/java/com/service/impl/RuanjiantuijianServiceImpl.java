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


import com.dao.RuanjiantuijianDao;
import com.entity.RuanjiantuijianEntity;
import com.service.RuanjiantuijianService;
import com.entity.vo.RuanjiantuijianVO;
import com.entity.view.RuanjiantuijianView;

@Service("ruanjiantuijianService")
public class RuanjiantuijianServiceImpl extends ServiceImpl<RuanjiantuijianDao, RuanjiantuijianEntity> implements RuanjiantuijianService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<RuanjiantuijianEntity> page = this.selectPage(
                new Query<RuanjiantuijianEntity>(params).getPage(),
                new EntityWrapper<RuanjiantuijianEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<RuanjiantuijianEntity> wrapper) {
		  Page<RuanjiantuijianView> page =new Query<RuanjiantuijianView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<RuanjiantuijianVO> selectListVO(Wrapper<RuanjiantuijianEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public RuanjiantuijianVO selectVO(Wrapper<RuanjiantuijianEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<RuanjiantuijianView> selectListView(Wrapper<RuanjiantuijianEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public RuanjiantuijianView selectView(Wrapper<RuanjiantuijianEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
