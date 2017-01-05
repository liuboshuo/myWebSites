package com.liushuo.common;

import com.liushuo.dev.first.pojo.Novel;

import java.util.ArrayList;

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


	public static class CommonListVo {

        private int count;

        private ArrayList<Novel> novels;

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }

        public ArrayList<Novel> getNovels() {
            return novels;
        }

        public void setNovels(ArrayList<Novel> novels) {
            this.novels = novels;
        }





    }
}
