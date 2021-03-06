package com.liushuo.dev.first.controller;

import java.util.ArrayList;

import javax.annotation.Resource;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.liushuo.dev.first.pojo.Novel;
import com.liushuo.dev.first.qo.NovelQo;
import com.liushuo.dev.first.service.NovelService;
import com.liushuo.common.Base;
import com.liushuo.common.BaseStatus;
import com.liushuo.common.ResultData;

@Controller
@RequestMapping("/ls")
public class NovelController {

	@Resource NovelService novelService;
	
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<?> testAllNovels(){
		ArrayList<Novel> lists = null;
		try {
			lists = novelService.testAllNovels();
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<Base>(new Base("20000", BaseStatus.ERROR) , HttpStatus.OK);
		}
		return new ResponseEntity<ResultData<ArrayList<Novel>>>(new ResultData<ArrayList<Novel>>(lists), HttpStatus.OK);
	}
	
	
	@RequestMapping(value = "/getAllNovel" , method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<?> getAllNovel(NovelQo qo){
		
		ArrayList<Novel> lists = null;
		int count = 0;
		try {
			lists = novelService.getAllNovels(qo);
			count = novelService.getAllNovelsCount(qo);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<Base>(new Base(BaseStatus.ERROR, "error"), HttpStatus.OK);
		}
		return new ResponseEntity<ResultData<ArrayList<Novel>>>(new ResultData<ArrayList<Novel>>(lists, qo.getPageNo(), qo.getPageSize(), count), HttpStatus.OK);
	}
	
}
