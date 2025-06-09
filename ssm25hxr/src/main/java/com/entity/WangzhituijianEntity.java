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
 * 网址推荐
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-18 21:57:52
 */
@TableName("wangzhituijian")
public class WangzhituijianEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public WangzhituijianEntity() {
		
	}
	
	public WangzhituijianEntity(T t) {
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
	 * 网址名称
	 */
					
	private String wangzhimingcheng;
	
	/**
	 * 网址介绍
	 */
					
	private String wangzhijieshao;
	
	/**
	 * 姓名
	 */
					
	private String xingming;
	
	/**
	 * 账号
	 */
					
	private String zhanghao;
	
	/**
	 * 照片
	 */
					
	private String zhaopian;
	
	/**
	 * 网址来源
	 */
					
	private String wangzhilaiyuan;
	
	/**
	 * 视频分享
	 */
					
	private String shipinfenxiang;
	
	/**
	 * 操作简介
	 */
					
	private String caozuojianjie;
	
	/**
	 * 发布时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date fabushijian;
	
	/**
	 * 封面图片
	 */
					
	private String fengmiantupian;
	
	/**
	 * 网址详情
	 */
					
	private String wangzhixiangqing;
	
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
	 * 设置：网址名称
	 */
	public void setWangzhimingcheng(String wangzhimingcheng) {
		this.wangzhimingcheng = wangzhimingcheng;
	}
	/**
	 * 获取：网址名称
	 */
	public String getWangzhimingcheng() {
		return wangzhimingcheng;
	}
	/**
	 * 设置：网址介绍
	 */
	public void setWangzhijieshao(String wangzhijieshao) {
		this.wangzhijieshao = wangzhijieshao;
	}
	/**
	 * 获取：网址介绍
	 */
	public String getWangzhijieshao() {
		return wangzhijieshao;
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
	 * 设置：网址来源
	 */
	public void setWangzhilaiyuan(String wangzhilaiyuan) {
		this.wangzhilaiyuan = wangzhilaiyuan;
	}
	/**
	 * 获取：网址来源
	 */
	public String getWangzhilaiyuan() {
		return wangzhilaiyuan;
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
	 * 设置：操作简介
	 */
	public void setCaozuojianjie(String caozuojianjie) {
		this.caozuojianjie = caozuojianjie;
	}
	/**
	 * 获取：操作简介
	 */
	public String getCaozuojianjie() {
		return caozuojianjie;
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
	 * 设置：网址详情
	 */
	public void setWangzhixiangqing(String wangzhixiangqing) {
		this.wangzhixiangqing = wangzhixiangqing;
	}
	/**
	 * 获取：网址详情
	 */
	public String getWangzhixiangqing() {
		return wangzhixiangqing;
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
