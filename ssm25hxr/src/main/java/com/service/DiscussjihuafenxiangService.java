package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussjihuafenxiangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussjihuafenxiangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussjihuafenxiangView;


/**
 * 计划分享评论表
 *
 * @author 
 * @email 
 * @date 2021-03-18 21:57:52
 */
public interface DiscussjihuafenxiangService extends IService<DiscussjihuafenxiangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussjihuafenxiangVO> selectListVO(Wrapper<DiscussjihuafenxiangEntity> wrapper);
   	
   	DiscussjihuafenxiangVO selectVO(@Param("ew") Wrapper<DiscussjihuafenxiangEntity> wrapper);
   	
   	List<DiscussjihuafenxiangView> selectListView(Wrapper<DiscussjihuafenxiangEntity> wrapper);
   	
   	DiscussjihuafenxiangView selectView(@Param("ew") Wrapper<DiscussjihuafenxiangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussjihuafenxiangEntity> wrapper);
   	
}

