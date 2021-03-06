package com.liushuo.dev.first.service.impl;

import java.util.ArrayList;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.liushuo.dev.first.mapper.PictureMapper;
import com.liushuo.dev.first.pojo.Directory;
import com.liushuo.dev.first.pojo.Picture;
import com.liushuo.dev.first.qo.PictureQo;
import com.liushuo.dev.first.service.PictureService;

@Service
public class PictrueServiceImpl implements PictureService{
	@Resource
	private PictureMapper pictureMapper;
	
	@Override
	public ArrayList<Picture> getAllPicture() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public ArrayList<Picture> getAllPictureByCateId(int id) {
		// TODO Auto-generated method stub
		return pictureMapper.getAllPicturesAtDir(id);
	}

	@Override
	public ArrayList<Picture> getPictureAtDir(PictureQo qo) {
		// TODO Auto-generated method stub
		ArrayList<Picture> pictures = pictureMapper.getPicturesByLevel(qo);
		return pictures;
	}

	@Override
	public ArrayList<Directory> getDirectoryByLevel(int id) {
		// TODO Auto-generated method stub
		return pictureMapper.getDirectoryByLevel(id);
	}
	@Override
	public int getPictureCountAtDir(PictureQo qo) {
		// TODO Auto-generated method stub
		int count=pictureMapper.getPicturesCountByLevel(qo);
		return count;
	}
}
