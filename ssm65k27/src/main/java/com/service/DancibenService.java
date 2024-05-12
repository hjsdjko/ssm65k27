package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DancibenEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DancibenVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DancibenView;


/**
 * 单词本
 *
 * @author 
 * @email 
 * @date 2022-04-07 20:21:55
 */
public interface DancibenService extends IService<DancibenEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DancibenVO> selectListVO(Wrapper<DancibenEntity> wrapper);
   	
   	DancibenVO selectVO(@Param("ew") Wrapper<DancibenEntity> wrapper);
   	
   	List<DancibenView> selectListView(Wrapper<DancibenEntity> wrapper);
   	
   	DancibenView selectView(@Param("ew") Wrapper<DancibenEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DancibenEntity> wrapper);
   	

}

