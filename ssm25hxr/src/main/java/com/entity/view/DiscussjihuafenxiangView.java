package com.entity.view;

import com.entity.DiscussjihuafenxiangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 计划分享评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-18 21:57:52
 */
@TableName("discussjihuafenxiang")
public class DiscussjihuafenxiangView  extends DiscussjihuafenxiangEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussjihuafenxiangView(){
	}
 
 	public DiscussjihuafenxiangView(DiscussjihuafenxiangEntity discussjihuafenxiangEntity){
 	try {
			BeanUtils.copyProperties(this, discussjihuafenxiangEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
