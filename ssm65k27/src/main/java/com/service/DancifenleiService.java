package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DancifenleiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DancifenleiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DancifenleiView;


/**
 * 单词分类
 *
 * @author 
 * @email 
 * @date 2022-04-07 20:21:55
 */
public interface DancifenleiService extends IService<DancifenleiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DancifenleiVO> selectListVO(Wrapper<DancifenleiEntity> wrapper);
   	
   	DancifenleiVO selectVO(@Param("ew") Wrapper<DancifenleiEntity> wrapper);
   	
   	List<DancifenleiView> selectListView(Wrapper<DancifenleiEntity> wrapper);
   	
   	DancifenleiView selectView(@Param("ew") Wrapper<DancifenleiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DancifenleiEntity> wrapper);
   	

}

