package com.dao;

import com.entity.JianglijizhiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JianglijizhiVO;
import com.entity.view.JianglijizhiView;


/**
 * 奖励机制
 * 
 * @author 
 * @email 
 * @date 2022-04-07 20:21:56
 */
public interface JianglijizhiDao extends BaseMapper<JianglijizhiEntity> {
	
	List<JianglijizhiVO> selectListVO(@Param("ew") Wrapper<JianglijizhiEntity> wrapper);
	
	JianglijizhiVO selectVO(@Param("ew") Wrapper<JianglijizhiEntity> wrapper);
	
	List<JianglijizhiView> selectListView(@Param("ew") Wrapper<JianglijizhiEntity> wrapper);

	List<JianglijizhiView> selectListView(Pagination page,@Param("ew") Wrapper<JianglijizhiEntity> wrapper);
	
	JianglijizhiView selectView(@Param("ew") Wrapper<JianglijizhiEntity> wrapper);
	

}
