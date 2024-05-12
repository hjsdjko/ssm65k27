package com.entity.view;

import com.entity.DancibenEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 单词本
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-07 20:21:55
 */
@TableName("danciben")
public class DancibenView  extends DancibenEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DancibenView(){
	}
 
 	public DancibenView(DancibenEntity dancibenEntity){
 	try {
			BeanUtils.copyProperties(this, dancibenEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
