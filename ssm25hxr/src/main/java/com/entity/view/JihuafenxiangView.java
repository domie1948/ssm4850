package com.entity.view;

import com.entity.JihuafenxiangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 计划分享
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-18 21:57:52
 */
@TableName("jihuafenxiang")
public class JihuafenxiangView  extends JihuafenxiangEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JihuafenxiangView(){
	}
 
 	public JihuafenxiangView(JihuafenxiangEntity jihuafenxiangEntity){
 	try {
			BeanUtils.copyProperties(this, jihuafenxiangEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
