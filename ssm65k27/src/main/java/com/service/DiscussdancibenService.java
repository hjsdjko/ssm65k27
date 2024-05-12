package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussdancibenEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussdancibenVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussdancibenView;


/**
 * 单词本评论表
 *
 * @author 
 * @email 
 * @date 2022-04-07 20:21:56
 */
public interface DiscussdancibenService extends IService<DiscussdancibenEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussdancibenVO> selectListVO(Wrapper<DiscussdancibenEntity> wrapper);
   	
   	DiscussdancibenVO selectVO(@Param("ew") Wrapper<DiscussdancibenEntity> wrapper);
   	
   	List<DiscussdancibenView> selectListView(Wrapper<DiscussdancibenEntity> wrapper);
   	
   	DiscussdancibenView selectView(@Param("ew") Wrapper<DiscussdancibenEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussdancibenEntity> wrapper);
   	

}

