package com.liushuo.dev.vo.base;

import com.liushuo.dev.qo.PageQo;
import com.liushuo.dev.vo.base.*;

public class ResultData<T> extends PageQo {
	
	private String code = BaseStatus.SUCCESS;
	
	private T data;

	
	
	public ResultData(T data) {
		super();
		this.data = data;
	}

	public ResultData(T data, int totalCount) {
		super();
		this.data = data;
		super.setTotalCount(totalCount);
	}

	
	
	public ResultData(T data,int pageNo, int pageSize, int totalCount) {
		super();
		this.data = data;
		super.setPageNo(pageNo);
		super.setPageSize(pageSize);
		super.setTotalCount(totalCount);
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	
	
	
	
	

}
