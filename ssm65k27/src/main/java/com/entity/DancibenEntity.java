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
 * 单词本
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-04-07 20:21:55
 */
@TableName("danciben")
public class DancibenEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public DancibenEntity() {
		
	}
	
	public DancibenEntity(T t) {
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
	 * 语音播报
	 */
					
	private String yuyinbobao;
	
	/**
	 * 单词解析
	 */
					
	private String dancijiexi;
	
	/**
	 * 应用场景
	 */
					
	private String yingyongchangjing;
	
	
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
	 * 设置：语音播报
	 */
	public void setYuyinbobao(String yuyinbobao) {
		this.yuyinbobao = yuyinbobao;
	}
	/**
	 * 获取：语音播报
	 */
	public String getYuyinbobao() {
		return yuyinbobao;
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

}
