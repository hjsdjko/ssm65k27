package com.entity.model;

import com.entity.JianglijizhiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 奖励机制
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-04-07 20:21:56
 */
public class JianglijizhiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
