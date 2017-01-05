package com.liushuo.common;

public class BasePageQo {

	
	public int pageSize = 10;
	public int pageNo = 1;
	public int pageStart = (pageNo - 1) * pageSize;
	
	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
		this.pageStart = (pageNo - 1) * pageSize;
	}

	public int getPageNo() {
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
		this.pageStart = (pageNo - 1) * pageSize;
	}
	
	public int getPageStart() {
		return pageStart;
	}

	public void setPageStart(int pageStart) {
		this.pageStart = pageStart;
	}
}
