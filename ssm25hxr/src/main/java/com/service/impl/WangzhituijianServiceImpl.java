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


import com.dao.WangzhituijianDao;
import com.entity.WangzhituijianEntity;
import com.service.WangzhituijianService;
import com.entity.vo.WangzhituijianVO;
import com.entity.view.WangzhituijianView;

@Service("wangzhituijianService")
public class WangzhituijianServiceImpl extends ServiceImpl<WangzhituijianDao, WangzhituijianEntity> implements WangzhituijianService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WangzhituijianEntity> page = this.selectPage(
                new Query<WangzhituijianEntity>(params).getPage(),
                new EntityWrapper<WangzhituijianEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WangzhituijianEntity> wrapper) {
		  Page<WangzhituijianView> page =new Query<WangzhituijianView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<WangzhituijianVO> selectListVO(Wrapper<WangzhituijianEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WangzhituijianVO selectVO(Wrapper<WangzhituijianEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WangzhituijianView> selectListView(Wrapper<WangzhituijianEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WangzhituijianView selectView(Wrapper<WangzhituijianEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
