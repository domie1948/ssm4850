package com.dao;

import com.entity.DiscussruanjiantuijianEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussruanjiantuijianVO;
import com.entity.view.DiscussruanjiantuijianView;


/**
 * 软件推荐评论表
 * 
 * @author 
 * @email 
 * @date 2021-03-18 21:57:52
 */
public interface DiscussruanjiantuijianDao extends BaseMapper<DiscussruanjiantuijianEntity> {
	
	List<DiscussruanjiantuijianVO> selectListVO(@Param("ew") Wrapper<DiscussruanjiantuijianEntity> wrapper);
	
	DiscussruanjiantuijianVO selectVO(@Param("ew") Wrapper<DiscussruanjiantuijianEntity> wrapper);
	
	List<DiscussruanjiantuijianView> selectListView(@Param("ew") Wrapper<DiscussruanjiantuijianEntity> wrapper);

	List<DiscussruanjiantuijianView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussruanjiantuijianEntity> wrapper);
	
	DiscussruanjiantuijianView selectView(@Param("ew") Wrapper<DiscussruanjiantuijianEntity> wrapper);
	
}
