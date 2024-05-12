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


import com.dao.JianglijizhiDao;
import com.entity.JianglijizhiEntity;
import com.service.JianglijizhiService;
import com.entity.vo.JianglijizhiVO;
import com.entity.view.JianglijizhiView;

@Service("jianglijizhiService")
public class JianglijizhiServiceImpl extends ServiceImpl<JianglijizhiDao, JianglijizhiEntity> implements JianglijizhiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JianglijizhiEntity> page = this.selectPage(
                new Query<JianglijizhiEntity>(params).getPage(),
                new EntityWrapper<JianglijizhiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JianglijizhiEntity> wrapper) {
		  Page<JianglijizhiView> page =new Query<JianglijizhiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JianglijizhiVO> selectListVO(Wrapper<JianglijizhiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JianglijizhiVO selectVO(Wrapper<JianglijizhiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JianglijizhiView> selectListView(Wrapper<JianglijizhiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JianglijizhiView selectView(Wrapper<JianglijizhiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
