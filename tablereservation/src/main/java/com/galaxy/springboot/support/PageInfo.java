package com.galaxy.springboot.support;

import java.util.List;

/**
 * �����ҳ����ʹ�õ�����
 * @author Lenovo
 *�Զ�������ɷ�ҳ����

	����ҳ��Ҫ��Щ������
	
	1 ������
	2 ÿҳ������
	3 ��ǰ��ҳ��
	4 ��ҳ��
	
	ҳ����ʾ
	5 ��ҳ��ѯ�󴫵ݵ�ǰ�˽�����ص�չʾ List<T>
	
	��ѯ����
	6 ������� private SalChance salChance;  private T entity;
 */
public class PageInfo<T> {

	//������
	private int totalCount;
	
	//ҳ��������ʼֵ����ָ������5
	private int pageSize = 5;
	
	//��ǰ��ҳ������ʼֵ�� 1
	private int pageNum = 1;
	
	//��ҳ��
	private int totalPage;
	
	//���͵�ʹ�ã���ʵ������ʱ��ָ�����ͣ�
	private List<T> lists; 
	
	//������ԣ���ѯ����
	private T entity;
	
	//��ʼ����
	private int start;

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getPageNum() {
		return pageNum;
	}

	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	public List<T> getLists() {
		return lists;
	}

	public void setLists(List<T> lists) {
		this.lists = lists;
	}

	public T getEntity() {
		return entity;
	}

	public void setEntity(T entity) {
		this.entity = entity;
	}

	public int getStart() {
		//����ָ����ʼ������
		this.start = (pageNum-1)*pageSize;
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}
	
	
	
}
