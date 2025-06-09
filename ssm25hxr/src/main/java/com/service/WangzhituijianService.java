package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WangzhituijianEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WangzhituijianVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WangzhituijianView;


/**
 * 网址推荐
 *
 * @author 
 * @email 
 * @date 2021-03-18 21:57:52
 */
public interface WangzhituijianService extends IService<WangzhituijianEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WangzhituijianVO> selectListVO(Wrapper<WangzhituijianEntity> wrapper);
   	
   	WangzhituijianVO selectVO(@Param("ew") Wrapper<WangzhituijianEntity> wrapper);
   	
   	List<WangzhituijianView> selectListView(Wrapper<WangzhituijianEntity> wrapper);
   	
   	WangzhituijianView selectView(@Param("ew") Wrapper<WangzhituijianEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WangzhituijianEntity> wrapper);
   	
}

