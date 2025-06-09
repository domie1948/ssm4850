package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JihuafenxiangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JihuafenxiangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JihuafenxiangView;


/**
 * 计划分享
 *
 * @author 
 * @email 
 * @date 2021-03-18 21:57:52
 */
public interface JihuafenxiangService extends IService<JihuafenxiangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JihuafenxiangVO> selectListVO(Wrapper<JihuafenxiangEntity> wrapper);
   	
   	JihuafenxiangVO selectVO(@Param("ew") Wrapper<JihuafenxiangEntity> wrapper);
   	
   	List<JihuafenxiangView> selectListView(Wrapper<JihuafenxiangEntity> wrapper);
   	
   	JihuafenxiangView selectView(@Param("ew") Wrapper<JihuafenxiangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JihuafenxiangEntity> wrapper);
   	
}

