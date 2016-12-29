package com.liushuo.dev.service;

import com.liushuo.dev.pojo.User;
import com.liushuo.dev.qo.UserAllQo;

public interface UserService {
	
	public User findUser(int id);
	
	public User getUser(UserAllQo userQo);
	
	
}

