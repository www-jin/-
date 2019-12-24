package com.galaxy.springboot.base.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.galaxy.springboot.base.IBaseService;
import com.galaxy.springboot.mapper.IBaseMapper;
import com.galaxy.springboot.support.PageInfo;



/**
 * ����BaseServiceImpl<T> implements IBaseService<T>
 * service��Ҫ����dao�㣬Ҳ����mapper
 * @author Lenovo
 *
 * @param <T>
 */
@Service
@Transactional
public class BaseServiceImpl<T> implements IBaseService<T> {

	//private IBaseMapper<T> baseMapper = new CstCustomerMapperImpl()//��mybatis���ɵĴ������
	//private IBaseMapper<T> baseMapper = new BaseMapperImpl()
	
	private IBaseMapper<T> baseMapper;
	
	@Override
	public void saveEntity(T entity) {
		// TODO Auto-generated method stub
		baseMapper.insertSelective(entity);
	}

	@Override
	public void updateEntity(T entity) {
		// TODO Auto-generated method stub
		baseMapper.updateByPrimaryKeySelective(entity);
	}

	@Override
	public void deleteByPrimaryKey(Object id) {
		// TODO Auto-generated method stub
		baseMapper.deleteByPrimaryKey(id);
	}

	@Override
	public T findEntityById(Object id) {
		// TODO Auto-generated method stub
		return baseMapper.selectByPrimaryKey(id);
	}

	@Override
	public PageInfo<T> findListByPageInfo(PageInfo<T> pageInfo) {
		//��ѯ��Ŀ��ʱ��start �� pageSize������Ĭ��ֵ��
		List<T> lists = baseMapper.selectListsByPageInfo(pageInfo);
		//��������
		int count = baseMapper.selectCountByPageInfo(pageInfo);
		//����ҳ�� = > ������/ÿҳ������
		int totalPage = count%pageInfo.getPageSize()>0?count/pageInfo.getPageSize()+1:count/pageInfo.getPageSize();
		pageInfo.setLists(lists);
		pageInfo.setTotalCount(count);
		pageInfo.setTotalPage(totalPage);
		return pageInfo;
	}

	public IBaseMapper<T> getBaseMapper() {
		return baseMapper;
	}

	public void setBaseMapper(IBaseMapper<T> baseMapper) {
		this.baseMapper = baseMapper;
	}

	
	
	
}
