package com.liushuo.dev.first.controller;

import javax.annotation.Resource;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.liushuo.dev.first.pojo.User;
import com.liushuo.dev.first.qo.UserAllQo;
import com.liushuo.dev.first.service.UserService;
import com.liushuo.common.Base;
import com.liushuo.common.BaseStatus;
import com.liushuo.common.ResultData;

@Controller
public class UserController {

	@Resource
	private UserService userService;
	
	@RequestMapping(value = "/findUser" , method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<?> findUser(){
		User user;
		try {
			user = userService.findUser(1);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return new ResponseEntity<Base>(new Base(BaseStatus.ERROR,"error"), HttpStatus.OK);
		} 
		return new ResponseEntity<ResultData<User>>(new ResultData<User>(user),HttpStatus.OK);
	}
	
	
	@RequestMapping(value = "/findUser1" , method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<?> findUser1(@RequestBody UserAllQo userQo){
		User user = null;
		try {
			user = userService.getUser(userQo);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<Base>(new Base(BaseStatus.ERROR, "error"), HttpStatus.OK);
		}
		return new ResponseEntity<ResultData<User>>(new ResultData<User>(user), HttpStatus.OK);
	}
}
