package com.entity.model;

import com.entity.DancibenEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 单词本
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-04-07 20:21:55
 */
public class DancibenModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
