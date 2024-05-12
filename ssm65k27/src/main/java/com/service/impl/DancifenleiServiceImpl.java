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


import com.dao.DancifenleiDao;
import com.entity.DancifenleiEntity;
import com.service.DancifenleiService;
import com.entity.vo.DancifenleiVO;
import com.entity.view.DancifenleiView;

@Service("dancifenleiService")
public class DancifenleiServiceImpl extends ServiceImpl<DancifenleiDao, DancifenleiEntity> implements DancifenleiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DancifenleiEntity> page = this.selectPage(
                new Query<DancifenleiEntity>(params).getPage(),
                new EntityWrapper<DancifenleiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DancifenleiEntity> wrapper) {
		  Page<DancifenleiView> page =new Query<DancifenleiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DancifenleiVO> selectListVO(Wrapper<DancifenleiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DancifenleiVO selectVO(Wrapper<DancifenleiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DancifenleiView> selectListView(Wrapper<DancifenleiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DancifenleiView selectView(Wrapper<DancifenleiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
