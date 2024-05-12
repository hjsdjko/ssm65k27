package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XuexiqingdanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XuexiqingdanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XuexiqingdanView;


/**
 * 学习清单
 *
 * @author 
 * @email 
 * @date 2022-04-07 20:21:55
 */
public interface XuexiqingdanService extends IService<XuexiqingdanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XuexiqingdanVO> selectListVO(Wrapper<XuexiqingdanEntity> wrapper);
   	
   	XuexiqingdanVO selectVO(@Param("ew") Wrapper<XuexiqingdanEntity> wrapper);
   	
   	List<XuexiqingdanView> selectListView(Wrapper<XuexiqingdanEntity> wrapper);
   	
   	XuexiqingdanView selectView(@Param("ew") Wrapper<XuexiqingdanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XuexiqingdanEntity> wrapper);
   	

}

