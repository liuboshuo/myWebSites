package com.liushuo.dev.mapper;

import java.util.ArrayList;

import com.liushuo.dev.pojo.Directory;
import com.liushuo.dev.pojo.Novel;
import com.liushuo.dev.qo.NovelQo;

public interface NovelMapper {
	
	public ArrayList<Novel> testAllNovels();
	
	public ArrayList<Novel> getAllNovels(NovelQo qo);

	public int getAllNovelsCount(NovelQo qo);
}
