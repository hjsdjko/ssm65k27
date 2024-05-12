package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JianglijizhiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JianglijizhiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JianglijizhiView;


/**
 * 奖励机制
 *
 * @author 
 * @email 
 * @date 2022-04-07 20:21:56
 */
public interface JianglijizhiService extends IService<JianglijizhiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JianglijizhiVO> selectListVO(Wrapper<JianglijizhiEntity> wrapper);
   	
   	JianglijizhiVO selectVO(@Param("ew") Wrapper<JianglijizhiEntity> wrapper);
   	
   	List<JianglijizhiView> selectListView(Wrapper<JianglijizhiEntity> wrapper);
   	
   	JianglijizhiView selectView(@Param("ew") Wrapper<JianglijizhiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JianglijizhiEntity> wrapper);
   	

}

