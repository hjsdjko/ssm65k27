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
 * 奖励机制
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-04-07 20:21:56
 */
@TableName("jianglijizhi")
public class JianglijizhiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JianglijizhiEntity() {
		
	}
	
	public JianglijizhiEntity(T t) {
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
	 * 奖励编号
	 */
					
	private String jianglibianhao;
	
	/**
	 * 奖励标题
	 */
					
	private String jianglibiaoti;
	
	/**
	 * 封面
	 */
					
	private String fengmian;
	
	/**
	 * 发布时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date fabushijian;
	
	/**
	 * 奖励机制
	 */
					
	private String jianglijizhi;
	
	
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
	 * 设置：奖励编号
	 */
	public void setJianglibianhao(String jianglibianhao) {
		this.jianglibianhao = jianglibianhao;
	}
	/**
	 * 获取：奖励编号
	 */
	public String getJianglibianhao() {
		return jianglibianhao;
	}
	/**
	 * 设置：奖励标题
	 */
	public void setJianglibiaoti(String jianglibiaoti) {
		this.jianglibiaoti = jianglibiaoti;
	}
	/**
	 * 获取：奖励标题
	 */
	public String getJianglibiaoti() {
		return jianglibiaoti;
	}
	/**
	 * 设置：封面
	 */
	public void setFengmian(String fengmian) {
		this.fengmian = fengmian;
	}
	/**
	 * 获取：封面
	 */
	public String getFengmian() {
		return fengmian;
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
	 * 设置：奖励机制
	 */
	public void setJianglijizhi(String jianglijizhi) {
		this.jianglijizhi = jianglijizhi;
	}
	/**
	 * 获取：奖励机制
	 */
	public String getJianglijizhi() {
		return jianglijizhi;
	}

}
