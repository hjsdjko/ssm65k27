package com.dao;

import com.entity.DancifenleiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DancifenleiVO;
import com.entity.view.DancifenleiView;


/**
 * 单词分类
 * 
 * @author 
 * @email 
 * @date 2022-04-07 20:21:55
 */
public interface DancifenleiDao extends BaseMapper<DancifenleiEntity> {
	
	List<DancifenleiVO> selectListVO(@Param("ew") Wrapper<DancifenleiEntity> wrapper);
	
	DancifenleiVO selectVO(@Param("ew") Wrapper<DancifenleiEntity> wrapper);
	
	List<DancifenleiView> selectListView(@Param("ew") Wrapper<DancifenleiEntity> wrapper);

	List<DancifenleiView> selectListView(Pagination page,@Param("ew") Wrapper<DancifenleiEntity> wrapper);
	
	DancifenleiView selectView(@Param("ew") Wrapper<DancifenleiEntity> wrapper);
	

}
