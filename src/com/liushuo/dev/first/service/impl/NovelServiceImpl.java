package com.liushuo.dev.first.service.impl;

import java.util.ArrayList;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.liushuo.dev.first.mapper.NovelMapper;
import com.liushuo.dev.first.pojo.Novel;
import com.liushuo.dev.first.qo.NovelQo;
import com.liushuo.dev.first.service.NovelService;

@Service
public class NovelServiceImpl implements NovelService {

	@Resource
	private NovelMapper noverlMapper;

	@Override
	public ArrayList<Novel> testAllNovels() {
		return noverlMapper.testAllNovels();
	}

	@Override
	public ArrayList<Novel> getAllNovels(NovelQo qo) {
		// TODO Auto-generated method stub

		ArrayList<Novel> lists = noverlMapper.getAllNovels(qo);

		return lists;
	}

	@Override
	public int getAllNovelsCount(NovelQo qo) {
		// TODO Auto-generated method stub
		return noverlMapper.getAllNovelsCount(qo);
	}

}
