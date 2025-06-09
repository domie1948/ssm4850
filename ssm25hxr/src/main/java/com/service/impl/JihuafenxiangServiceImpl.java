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


import com.dao.JihuafenxiangDao;
import com.entity.JihuafenxiangEntity;
import com.service.JihuafenxiangService;
import com.entity.vo.JihuafenxiangVO;
import com.entity.view.JihuafenxiangView;

@Service("jihuafenxiangService")
public class JihuafenxiangServiceImpl extends ServiceImpl<JihuafenxiangDao, JihuafenxiangEntity> implements JihuafenxiangService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JihuafenxiangEntity> page = this.selectPage(
                new Query<JihuafenxiangEntity>(params).getPage(),
                new EntityWrapper<JihuafenxiangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JihuafenxiangEntity> wrapper) {
		  Page<JihuafenxiangView> page =new Query<JihuafenxiangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JihuafenxiangVO> selectListVO(Wrapper<JihuafenxiangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JihuafenxiangVO selectVO(Wrapper<JihuafenxiangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JihuafenxiangView> selectListView(Wrapper<JihuafenxiangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JihuafenxiangView selectView(Wrapper<JihuafenxiangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
