package com.entity.vo;

import com.entity.RuanjiantuijianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 软件推荐
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-03-18 21:57:52
 */
public class RuanjiantuijianVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
