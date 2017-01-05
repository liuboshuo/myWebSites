package com.liushuo.dev.first.service;

import java.util.ArrayList;

import com.liushuo.dev.first.pojo.Novel;
import com.liushuo.dev.first.qo.NovelQo;

public interface NovelService {

	public ArrayList<Novel> testAllNovels();
	
	public ArrayList<Novel> getAllNovels(NovelQo qo);
	
	public int getAllNovelsCount(NovelQo qo);
}
