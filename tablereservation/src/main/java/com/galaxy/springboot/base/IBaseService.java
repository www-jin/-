package com.galaxy.springboot.base;

import org.apache.ibatis.annotations.Mapper;

import com.galaxy.springboot.support.PageInfo;




public interface IBaseService<T> {
	
	
	void saveEntity(T entity);
	
	
	void updateEntity(T entity);
	
	
	void deleteByPrimaryKey(Object id);
	
	
	T findEntityById(Object id);
	
	
	PageInfo<T> findListByPageInfo(PageInfo<T> pageInfo);
}
