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
 * 学习清单
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-04-07 20:21:55
 */
@TableName("xuexiqingdan")
public class XuexiqingdanEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public XuexiqingdanEntity() {
		
	}
	
	public XuexiqingdanEntity(T t) {
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
	 * 编号
	 */
					
	private String bianhao;
	
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
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
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
	 * 设置：编号
	 */
	public void setBianhao(String bianhao) {
		this.bianhao = bianhao;
	}
	/**
	 * 获取：编号
	 */
	public String getBianhao() {
		return bianhao;
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
