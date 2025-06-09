package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusswangzhituijianEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusswangzhituijianVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusswangzhituijianView;


/**
 * 网址推荐评论表
 *
 * @author 
 * @email 
 * @date 2021-03-18 21:57:52
 */
public interface DiscusswangzhituijianService extends IService<DiscusswangzhituijianEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusswangzhituijianVO> selectListVO(Wrapper<DiscusswangzhituijianEntity> wrapper);
   	
   	DiscusswangzhituijianVO selectVO(@Param("ew") Wrapper<DiscusswangzhituijianEntity> wrapper);
   	
   	List<DiscusswangzhituijianView> selectListView(Wrapper<DiscusswangzhituijianEntity> wrapper);
   	
   	DiscusswangzhituijianView selectView(@Param("ew") Wrapper<DiscusswangzhituijianEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusswangzhituijianEntity> wrapper);
   	
}

