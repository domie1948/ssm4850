package com.entity.view;

import com.entity.DiscusswangzhituijianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 网址推荐评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-18 21:57:52
 */
@TableName("discusswangzhituijian")
public class DiscusswangzhituijianView  extends DiscusswangzhituijianEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscusswangzhituijianView(){
	}
 
 	public DiscusswangzhituijianView(DiscusswangzhituijianEntity discusswangzhituijianEntity){
 	try {
			BeanUtils.copyProperties(this, discusswangzhituijianEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
