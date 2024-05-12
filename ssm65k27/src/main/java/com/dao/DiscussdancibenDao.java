package com.dao;

import com.entity.DiscussdancibenEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussdancibenVO;
import com.entity.view.DiscussdancibenView;


/**
 * 单词本评论表
 * 
 * @author 
 * @email 
 * @date 2022-04-07 20:21:56
 */
public interface DiscussdancibenDao extends BaseMapper<DiscussdancibenEntity> {
	
	List<DiscussdancibenVO> selectListVO(@Param("ew") Wrapper<DiscussdancibenEntity> wrapper);
	
	DiscussdancibenVO selectVO(@Param("ew") Wrapper<DiscussdancibenEntity> wrapper);
	
	List<DiscussdancibenView> selectListView(@Param("ew") Wrapper<DiscussdancibenEntity> wrapper);

	List<DiscussdancibenView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussdancibenEntity> wrapper);
	
	DiscussdancibenView selectView(@Param("ew") Wrapper<DiscussdancibenEntity> wrapper);
	

}
