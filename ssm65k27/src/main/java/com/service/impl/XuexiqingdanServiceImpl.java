package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.XuexiqingdanDao;
import com.entity.XuexiqingdanEntity;
import com.service.XuexiqingdanService;
import com.entity.vo.XuexiqingdanVO;
import com.entity.view.XuexiqingdanView;

@Service("xuexiqingdanService")
public class XuexiqingdanServiceImpl extends ServiceImpl<XuexiqingdanDao, XuexiqingdanEntity> implements XuexiqingdanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XuexiqingdanEntity> page = this.selectPage(
                new Query<XuexiqingdanEntity>(params).getPage(),
                new EntityWrapper<XuexiqingdanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XuexiqingdanEntity> wrapper) {
		  Page<XuexiqingdanView> page =new Query<XuexiqingdanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XuexiqingdanVO> selectListVO(Wrapper<XuexiqingdanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XuexiqingdanVO selectVO(Wrapper<XuexiqingdanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XuexiqingdanView> selectListView(Wrapper<XuexiqingdanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XuexiqingdanView selectView(Wrapper<XuexiqingdanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
