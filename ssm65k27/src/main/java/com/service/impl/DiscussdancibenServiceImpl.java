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


import com.dao.DiscussdancibenDao;
import com.entity.DiscussdancibenEntity;
import com.service.DiscussdancibenService;
import com.entity.vo.DiscussdancibenVO;
import com.entity.view.DiscussdancibenView;

@Service("discussdancibenService")
public class DiscussdancibenServiceImpl extends ServiceImpl<DiscussdancibenDao, DiscussdancibenEntity> implements DiscussdancibenService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussdancibenEntity> page = this.selectPage(
                new Query<DiscussdancibenEntity>(params).getPage(),
                new EntityWrapper<DiscussdancibenEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussdancibenEntity> wrapper) {
		  Page<DiscussdancibenView> page =new Query<DiscussdancibenView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussdancibenVO> selectListVO(Wrapper<DiscussdancibenEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussdancibenVO selectVO(Wrapper<DiscussdancibenEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussdancibenView> selectListView(Wrapper<DiscussdancibenEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussdancibenView selectView(Wrapper<DiscussdancibenEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
