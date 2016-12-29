package com.liushuo.dev.mapper;

import com.liushuo.dev.pojo.User;
import com.liushuo.dev.qo.UserAllQo;

public interface UserMapper {
	
	User getUser(int id);
	
	User getUserById(UserAllQo userQo);

}
