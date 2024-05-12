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


import com.dao.DancibenDao;
import com.entity.DancibenEntity;
import com.service.DancibenService;
import com.entity.vo.DancibenVO;
import com.entity.view.DancibenView;

@Service("dancibenService")
public class DancibenServiceImpl extends ServiceImpl<DancibenDao, DancibenEntity> implements DancibenService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DancibenEntity> page = this.selectPage(
                new Query<DancibenEntity>(params).getPage(),
                new EntityWrapper<DancibenEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DancibenEntity> wrapper) {
		  Page<DancibenView> page =new Query<DancibenView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DancibenVO> selectListVO(Wrapper<DancibenEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DancibenVO selectVO(Wrapper<DancibenEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DancibenView> selectListView(Wrapper<DancibenEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DancibenView selectView(Wrapper<DancibenEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
