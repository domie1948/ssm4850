package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussruanjiantuijianEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussruanjiantuijianVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussruanjiantuijianView;


/**
 * 软件推荐评论表
 *
 * @author 
 * @email 
 * @date 2021-03-18 21:57:52
 */
public interface DiscussruanjiantuijianService extends IService<DiscussruanjiantuijianEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussruanjiantuijianVO> selectListVO(Wrapper<DiscussruanjiantuijianEntity> wrapper);
   	
   	DiscussruanjiantuijianVO selectVO(@Param("ew") Wrapper<DiscussruanjiantuijianEntity> wrapper);
   	
   	List<DiscussruanjiantuijianView> selectListView(Wrapper<DiscussruanjiantuijianEntity> wrapper);
   	
   	DiscussruanjiantuijianView selectView(@Param("ew") Wrapper<DiscussruanjiantuijianEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussruanjiantuijianEntity> wrapper);
   	
}

