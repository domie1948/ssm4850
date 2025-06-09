package com.dao;

import com.entity.JihuafenxiangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JihuafenxiangVO;
import com.entity.view.JihuafenxiangView;


/**
 * 计划分享
 * 
 * @author 
 * @email 
 * @date 2021-03-18 21:57:52
 */
public interface JihuafenxiangDao extends BaseMapper<JihuafenxiangEntity> {
	
	List<JihuafenxiangVO> selectListVO(@Param("ew") Wrapper<JihuafenxiangEntity> wrapper);
	
	JihuafenxiangVO selectVO(@Param("ew") Wrapper<JihuafenxiangEntity> wrapper);
	
	List<JihuafenxiangView> selectListView(@Param("ew") Wrapper<JihuafenxiangEntity> wrapper);

	List<JihuafenxiangView> selectListView(Pagination page,@Param("ew") Wrapper<JihuafenxiangEntity> wrapper);
	
	JihuafenxiangView selectView(@Param("ew") Wrapper<JihuafenxiangEntity> wrapper);
	
}
