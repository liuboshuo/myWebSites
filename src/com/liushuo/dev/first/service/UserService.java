package com.liushuo.dev.first.service;

import com.liushuo.dev.first.pojo.User;
import com.liushuo.dev.first.qo.UserAllQo;

public interface UserService {
	
	public User findUser(int id);
	
	public User getUser(UserAllQo userQo);
	
	
}

