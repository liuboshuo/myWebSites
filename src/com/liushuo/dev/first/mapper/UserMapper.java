package com.liushuo.dev.first.mapper;

import com.liushuo.dev.first.pojo.User;
import com.liushuo.dev.first.qo.UserAllQo;

public interface UserMapper {
	
	User getUser(int id);
	
	User getUserById(UserAllQo userQo);

}
