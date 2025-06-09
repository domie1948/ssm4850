package com.dao;

import com.entity.RuanjiantuijianEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.RuanjiantuijianVO;
import com.entity.view.RuanjiantuijianView;


/**
 * 软件推荐
 * 
 * @author 
 * @email 
 * @date 2021-03-18 21:57:52
 */
public interface RuanjiantuijianDao extends BaseMapper<RuanjiantuijianEntity> {
	
	List<RuanjiantuijianVO> selectListVO(@Param("ew") Wrapper<RuanjiantuijianEntity> wrapper);
	
	RuanjiantuijianVO selectVO(@Param("ew") Wrapper<RuanjiantuijianEntity> wrapper);
	
	List<RuanjiantuijianView> selectListView(@Param("ew") Wrapper<RuanjiantuijianEntity> wrapper);

	List<RuanjiantuijianView> selectListView(Pagination page,@Param("ew") Wrapper<RuanjiantuijianEntity> wrapper);
	
	RuanjiantuijianView selectView(@Param("ew") Wrapper<RuanjiantuijianEntity> wrapper);
	
}
