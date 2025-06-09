package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.RuanjiantuijianEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.RuanjiantuijianVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.RuanjiantuijianView;


/**
 * 软件推荐
 *
 * @author 
 * @email 
 * @date 2021-03-18 21:57:52
 */
public interface RuanjiantuijianService extends IService<RuanjiantuijianEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<RuanjiantuijianVO> selectListVO(Wrapper<RuanjiantuijianEntity> wrapper);
   	
   	RuanjiantuijianVO selectVO(@Param("ew") Wrapper<RuanjiantuijianEntity> wrapper);
   	
   	List<RuanjiantuijianView> selectListView(Wrapper<RuanjiantuijianEntity> wrapper);
   	
   	RuanjiantuijianView selectView(@Param("ew") Wrapper<RuanjiantuijianEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<RuanjiantuijianEntity> wrapper);
   	
}

