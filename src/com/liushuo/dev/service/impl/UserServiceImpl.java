package com.liushuo.dev.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.liushuo.dev.mapper.UserMapper;
import com.liushuo.dev.pojo.User;
import com.liushuo.dev.qo.UserAllQo;
import com.liushuo.dev.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Resource
	private UserMapper userMapper;

	@Override
	public User findUser(int id) {
		User user = userMapper.getUser(id);
		return user;
	}

	@Override
	public User getUser(UserAllQo userQo) {
		// TODO Auto-generated method stub
		return userMapper.getUserById(userQo);
	}
	

}
