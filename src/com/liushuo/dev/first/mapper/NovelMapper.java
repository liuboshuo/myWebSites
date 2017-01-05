package com.liushuo.dev.first.mapper;

import java.util.ArrayList;

import com.liushuo.dev.first.pojo.Novel;
import com.liushuo.dev.first.qo.NovelQo;

public interface NovelMapper {
	
	public ArrayList<Novel> testAllNovels();
	
	public ArrayList<Novel> getAllNovels(NovelQo qo);

	public int getAllNovelsCount(NovelQo qo);
}
