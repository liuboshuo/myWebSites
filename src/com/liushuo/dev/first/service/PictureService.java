package com.liushuo.dev.first.service;

import java.util.ArrayList;

import com.liushuo.dev.first.pojo.Directory;
import com.liushuo.dev.first.pojo.Picture;
import com.liushuo.dev.first.qo.PictureQo;

public interface PictureService {
	
	
	public ArrayList<Directory> getDirectoryByLevel(int id);
	
	public ArrayList<Picture> getAllPictureByCateId(int id);
	
	public ArrayList<Picture> getAllPicture();
	
	public ArrayList<Picture> getPictureAtDir(PictureQo qo);
	public int getPictureCountAtDir(PictureQo qo);
	
	
}
