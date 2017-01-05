package com.liushuo.dev.first.controller;

import java.util.ArrayList;

import javax.annotation.Resource;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.liushuo.dev.first.pojo.Directory;
import com.liushuo.dev.first.pojo.Picture;
import com.liushuo.dev.first.qo.PictureQo;
import com.liushuo.dev.first.service.PictureService;
import com.liushuo.common.Base;
import com.liushuo.common.BaseStatus;
import com.liushuo.common.ResultData;

@Controller
@RequestMapping("/ls")
public class PictureController {

	@Resource
	PictureService pictureService;
	

	@RequestMapping(value = "/getDirectory", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<?> getDirectoryByLevel(@RequestParam int level) {
		ArrayList<Directory> directorys = null;
		try {
			directorys = pictureService.getDirectoryByLevel(level);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return new ResponseEntity<Base>(new Base(BaseStatus.ERROR, "error"), HttpStatus.OK);
		}
		return new ResponseEntity<ResultData<ArrayList<Directory>>>(new ResultData<ArrayList<Directory>>(directorys),
				HttpStatus.OK);
	}

	@RequestMapping(value = "/getPictureAtLevel", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<?> getPictureAtLevel(PictureQo qo) {
		ArrayList<Picture> pics = null;
		int totalC = 0;
		try {
			pics = pictureService.getPictureAtDir(qo);
			totalC = pictureService.getPictureCountAtDir(qo);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return new ResponseEntity<Base>(new Base(BaseStatus.ERROR, "error"), HttpStatus.OK);
		}
		return new ResponseEntity<ResultData<ArrayList<Picture>>>(new ResultData<ArrayList<Picture>>(pics, qo.getPageNo(), qo.getPageSize(), totalC),
				HttpStatus.OK);
	}
	
	@RequestMapping(value = "/getPictureAtDir", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<?> getPictureAtDir(@RequestParam int cateId) {
		ArrayList<Picture> pics = null;
		try {
			pics = pictureService.getAllPictureByCateId(cateId);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return new ResponseEntity<Base>(new Base(BaseStatus.ERROR, "error"), HttpStatus.OK);
		}

		return new ResponseEntity<ResultData<ArrayList<Picture>>>(new ResultData<ArrayList<Picture>>(pics),
				HttpStatus.OK);
	}
	
}
