package com.dao;

import com.entity.XuexiqingdanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XuexiqingdanVO;
import com.entity.view.XuexiqingdanView;


/**
 * 学习清单
 * 
 * @author 
 * @email 
 * @date 2022-04-07 20:21:55
 */
public interface XuexiqingdanDao extends BaseMapper<XuexiqingdanEntity> {
	
	List<XuexiqingdanVO> selectListVO(@Param("ew") Wrapper<XuexiqingdanEntity> wrapper);
	
	XuexiqingdanVO selectVO(@Param("ew") Wrapper<XuexiqingdanEntity> wrapper);
	
	List<XuexiqingdanView> selectListView(@Param("ew") Wrapper<XuexiqingdanEntity> wrapper);

	List<XuexiqingdanView> selectListView(Pagination page,@Param("ew") Wrapper<XuexiqingdanEntity> wrapper);
	
	XuexiqingdanView selectView(@Param("ew") Wrapper<XuexiqingdanEntity> wrapper);
	

}
