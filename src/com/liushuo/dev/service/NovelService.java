package com.liushuo.dev.service;

import java.util.ArrayList;

import com.liushuo.dev.pojo.Novel;
import com.liushuo.dev.qo.NovelQo;
import com.liushuo.dev.vo.CommonListVo;

public interface NovelService {

	public ArrayList<Novel> testAllNovels();
	
	public ArrayList<Novel> getAllNovels(NovelQo qo);
	
	public int getAllNovelsCount(NovelQo qo);
}
