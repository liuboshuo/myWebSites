package com.liushuo.dev.first.mapper;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Param;

import com.liushuo.dev.first.pojo.Directory;
import com.liushuo.dev.first.pojo.Picture;
import com.liushuo.dev.first.qo.PictureQo;

public interface PictureMapper {

	public ArrayList<Picture> getPicturesByLevel(PictureQo level);

	public int getPicturesCountByLevel(PictureQo level);
	
	public ArrayList<Picture> getAllPicturesAtDir(@Param(value = "cateId") int level);

	public ArrayList<Directory> getDirectoryByLevel(@Param(value = "level") int level);
}
