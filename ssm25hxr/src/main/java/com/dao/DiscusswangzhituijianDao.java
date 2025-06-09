package com.dao;

import com.entity.DiscusswangzhituijianEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusswangzhituijianVO;
import com.entity.view.DiscusswangzhituijianView;


/**
 * 网址推荐评论表
 * 
 * @author 
 * @email 
 * @date 2021-03-18 21:57:52
 */
public interface DiscusswangzhituijianDao extends BaseMapper<DiscusswangzhituijianEntity> {
	
	List<DiscusswangzhituijianVO> selectListVO(@Param("ew") Wrapper<DiscusswangzhituijianEntity> wrapper);
	
	DiscusswangzhituijianVO selectVO(@Param("ew") Wrapper<DiscusswangzhituijianEntity> wrapper);
	
	List<DiscusswangzhituijianView> selectListView(@Param("ew") Wrapper<DiscusswangzhituijianEntity> wrapper);

	List<DiscusswangzhituijianView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusswangzhituijianEntity> wrapper);
	
	DiscusswangzhituijianView selectView(@Param("ew") Wrapper<DiscusswangzhituijianEntity> wrapper);
	
}
