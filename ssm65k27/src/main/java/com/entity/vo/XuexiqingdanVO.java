package com.entity.vo;

import com.entity.XuexiqingdanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 学习清单
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-04-07 20:21:55
 */
public class XuexiqingdanVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 单词名称
	 */
	
	private String dancimingcheng;
		
	/**
	 * 单词分类
	 */
	
	private String dancifenlei;
		
	/**
	 * 译文
	 */
	
	private String yiwen;
		
	/**
	 * 单词图片
	 */
	
	private String dancitupian;
		
	/**
	 * 单词解析
	 */
	
	private String dancijiexi;
		
	/**
	 * 应用场景
	 */
	
	private String yingyongchangjing;
		
	/**
	 * 添加时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date tianjiashijian;
		
	/**
	 * 备注
	 */
	
	private String beizhu;
		
	/**
	 * 账号
	 */
	
	private String zhanghao;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
				
	
	/**
	 * 设置：单词名称
	 */
	 
	public void setDancimingcheng(String dancimingcheng) {
		this.dancimingcheng = dancimingcheng;
	}
	
	/**
	 * 获取：单词名称
	 */
	public String getDancimingcheng() {
		return dancimingcheng;
	}
				
	
	/**
	 * 设置：单词分类
	 */
	 
	public void setDancifenlei(String dancifenlei) {
		this.dancifenlei = dancifenlei;
	}
	
	/**
	 * 获取：单词分类
	 */
	public String getDancifenlei() {
		return dancifenlei;
	}
				
	
	/**
	 * 设置：译文
	 */
	 
	public void setYiwen(String yiwen) {
		this.yiwen = yiwen;
	}
	
	/**
	 * 获取：译文
	 */
	public String getYiwen() {
		return yiwen;
	}
				
	
	/**
	 * 设置：单词图片
	 */
	 
	public void setDancitupian(String dancitupian) {
		this.dancitupian = dancitupian;
	}
	
	/**
	 * 获取：单词图片
	 */
	public String getDancitupian() {
		return dancitupian;
	}
				
	
	/**
	 * 设置：单词解析
	 */
	 
	public void setDancijiexi(String dancijiexi) {
		this.dancijiexi = dancijiexi;
	}
	
	/**
	 * 获取：单词解析
	 */
	public String getDancijiexi() {
		return dancijiexi;
	}
				
	
	/**
	 * 设置：应用场景
	 */
	 
	public void setYingyongchangjing(String yingyongchangjing) {
		this.yingyongchangjing = yingyongchangjing;
	}
	
	/**
	 * 获取：应用场景
	 */
	public String getYingyongchangjing() {
		return yingyongchangjing;
	}
				
	
	/**
	 * 设置：添加时间
	 */
	 
	public void setTianjiashijian(Date tianjiashijian) {
		this.tianjiashijian = tianjiashijian;
	}
	
	/**
	 * 获取：添加时间
	 */
	public Date getTianjiashijian() {
		return tianjiashijian;
	}
				
	
	/**
	 * 设置：备注
	 */
	 
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
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
			
}
