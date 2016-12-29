package com.liushuo.dev.service.impl;

import java.awt.List;
import java.util.ArrayList;

import javax.annotation.Resource;
import javax.swing.event.ListSelectionEvent;

import org.springframework.stereotype.Service;

import com.liushuo.dev.mapper.NovelMapper;
import com.liushuo.dev.pojo.Novel;
import com.liushuo.dev.qo.NovelQo;
import com.liushuo.dev.service.NovelService;
import com.liushuo.dev.vo.CommonListVo;

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
