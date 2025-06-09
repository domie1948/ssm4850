package com.dao;

import com.entity.WangzhituijianEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WangzhituijianVO;
import com.entity.view.WangzhituijianView;


/**
 * 网址推荐
 * 
 * @author 
 * @email 
 * @date 2021-03-18 21:57:52
 */
public interface WangzhituijianDao extends BaseMapper<WangzhituijianEntity> {
	
	List<WangzhituijianVO> selectListVO(@Param("ew") Wrapper<WangzhituijianEntity> wrapper);
	
	WangzhituijianVO selectVO(@Param("ew") Wrapper<WangzhituijianEntity> wrapper);
	
	List<WangzhituijianView> selectListView(@Param("ew") Wrapper<WangzhituijianEntity> wrapper);

	List<WangzhituijianView> selectListView(Pagination page,@Param("ew") Wrapper<WangzhituijianEntity> wrapper);
	
	WangzhituijianView selectView(@Param("ew") Wrapper<WangzhituijianEntity> wrapper);
	
}
