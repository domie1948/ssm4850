package com.dao;

import com.entity.DiscussjihuafenxiangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussjihuafenxiangVO;
import com.entity.view.DiscussjihuafenxiangView;


/**
 * 计划分享评论表
 * 
 * @author 
 * @email 
 * @date 2021-03-18 21:57:52
 */
public interface DiscussjihuafenxiangDao extends BaseMapper<DiscussjihuafenxiangEntity> {
	
	List<DiscussjihuafenxiangVO> selectListVO(@Param("ew") Wrapper<DiscussjihuafenxiangEntity> wrapper);
	
	DiscussjihuafenxiangVO selectVO(@Param("ew") Wrapper<DiscussjihuafenxiangEntity> wrapper);
	
	List<DiscussjihuafenxiangView> selectListView(@Param("ew") Wrapper<DiscussjihuafenxiangEntity> wrapper);

	List<DiscussjihuafenxiangView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussjihuafenxiangEntity> wrapper);
	
	DiscussjihuafenxiangView selectView(@Param("ew") Wrapper<DiscussjihuafenxiangEntity> wrapper);
	
}
