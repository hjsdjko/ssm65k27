package com.entity.view;

import com.entity.DancifenleiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 单词分类
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-07 20:21:55
 */
@TableName("dancifenlei")
public class DancifenleiView  extends DancifenleiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DancifenleiView(){
	}
 
 	public DancifenleiView(DancifenleiEntity dancifenleiEntity){
 	try {
			BeanUtils.copyProperties(this, dancifenleiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
