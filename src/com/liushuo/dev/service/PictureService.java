package com.liushuo.dev.service;

import java.util.ArrayList;

import com.liushuo.dev.pojo.Directory;
import com.liushuo.dev.pojo.Picture;
import com.liushuo.dev.qo.PictureQo;

public interface PictureService {
	
	
	public ArrayList<Directory> getDirectoryByLevel(int id);
	
	public ArrayList<Picture> getAllPictureByCateId(int id);
	
	public ArrayList<Picture> getAllPicture();
	
	public ArrayList<Picture> getPictureAtDir(PictureQo qo);
	public int getPictureCountAtDir(PictureQo qo);
	
	
}
