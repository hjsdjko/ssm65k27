package com.dao;

import com.entity.DancibenEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DancibenVO;
import com.entity.view.DancibenView;


/**
 * 单词本
 * 
 * @author 
 * @email 
 * @date 2022-04-07 20:21:55
 */
public interface DancibenDao extends BaseMapper<DancibenEntity> {
	
	List<DancibenVO> selectListVO(@Param("ew") Wrapper<DancibenEntity> wrapper);
	
	DancibenVO selectVO(@Param("ew") Wrapper<DancibenEntity> wrapper);
	
	List<DancibenView> selectListView(@Param("ew") Wrapper<DancibenEntity> wrapper);

	List<DancibenView> selectListView(Pagination page,@Param("ew") Wrapper<DancibenEntity> wrapper);
	
	DancibenView selectView(@Param("ew") Wrapper<DancibenEntity> wrapper);
	

}
