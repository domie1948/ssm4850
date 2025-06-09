package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 软件推荐
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-18 21:57:52
 */
@TableName("ruanjiantuijian")
public class RuanjiantuijianEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public RuanjiantuijianEntity() {
		
	}
	
	public RuanjiantuijianEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 软件名称
	 */
					
	private String ruanjianmingcheng;
	
	/**
	 * 软件介绍
	 */
					
	private String ruanjianjieshao;
	
	/**
	 * 账号
	 */
					
	private String zhanghao;
	
	/**
	 * 姓名
	 */
					
	private String xingming;
	
	/**
	 * 照片
	 */
					
	private String zhaopian;
	
	/**
	 * 软件来源
	 */
					
	private String ruanjianlaiyuan;
	
	/**
	 * 视频分享
	 */
					
	private String shipinfenxiang;
	
	/**
	 * 发布时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date fabushijian;
	
	/**
	 * 软件详情
	 */
					
	private String ruanjianxiangqing;
	
	/**
	 * 封面图片
	 */
					
	private String fengmiantupian;
	
	/**
	 * 赞
	 */
					
	private Integer thumbsupnum;
	
	/**
	 * 踩
	 */
					
	private Integer crazilynum;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：软件名称
	 */
	public void setRuanjianmingcheng(String ruanjianmingcheng) {
		this.ruanjianmingcheng = ruanjianmingcheng;
	}
	/**
	 * 获取：软件名称
	 */
	public String getRuanjianmingcheng() {
		return ruanjianmingcheng;
	}
	/**
	 * 设置：软件介绍
	 */
	public void setRuanjianjieshao(String ruanjianjieshao) {
		this.ruanjianjieshao = ruanjianjieshao;
	}
	/**
	 * 获取：软件介绍
	 */
	public String getRuanjianjieshao() {
		return ruanjianjieshao;
	}
	/**
	 * 设置：账号
	 */
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
	}
	/**
	 * 设置：姓名
	 */
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
	/**
	 * 设置：照片
	 */
	public void setZhaopian(String zhaopian) {
		this.zhaopian = zhaopian;
	}
	/**
	 * 获取：照片
	 */
	public String getZhaopian() {
		return zhaopian;
	}
	/**
	 * 设置：软件来源
	 */
	public void setRuanjianlaiyuan(String ruanjianlaiyuan) {
		this.ruanjianlaiyuan = ruanjianlaiyuan;
	}
	/**
	 * 获取：软件来源
	 */
	public String getRuanjianlaiyuan() {
		return ruanjianlaiyuan;
	}
	/**
	 * 设置：视频分享
	 */
	public void setShipinfenxiang(String shipinfenxiang) {
		this.shipinfenxiang = shipinfenxiang;
	}
	/**
	 * 获取：视频分享
	 */
	public String getShipinfenxiang() {
		return shipinfenxiang;
	}
	/**
	 * 设置：发布时间
	 */
	public void setFabushijian(Date fabushijian) {
		this.fabushijian = fabushijian;
	}
	/**
	 * 获取：发布时间
	 */
	public Date getFabushijian() {
		return fabushijian;
	}
	/**
	 * 设置：软件详情
	 */
	public void setRuanjianxiangqing(String ruanjianxiangqing) {
		this.ruanjianxiangqing = ruanjianxiangqing;
	}
	/**
	 * 获取：软件详情
	 */
	public String getRuanjianxiangqing() {
		return ruanjianxiangqing;
	}
	/**
	 * 设置：封面图片
	 */
	public void setFengmiantupian(String fengmiantupian) {
		this.fengmiantupian = fengmiantupian;
	}
	/**
	 * 获取：封面图片
	 */
	public String getFengmiantupian() {
		return fengmiantupian;
	}
	/**
	 * 设置：赞
	 */
	public void setThumbsupnum(Integer thumbsupnum) {
		this.thumbsupnum = thumbsupnum;
	}
	/**
	 * 获取：赞
	 */
	public Integer getThumbsupnum() {
		return thumbsupnum;
	}
	/**
	 * 设置：踩
	 */
	public void setCrazilynum(Integer crazilynum) {
		this.crazilynum = crazilynum;
	}
	/**
	 * 获取：踩
	 */
	public Integer getCrazilynum() {
		return crazilynum;
	}

}
