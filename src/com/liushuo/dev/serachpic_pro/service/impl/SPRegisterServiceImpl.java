package com.liushuo.dev.serachpic_pro.service.impl;

import com.liushuo.dev.serachpic_pro.mapper.SPRegisterMapper;
import com.liushuo.dev.serachpic_pro.pojo.SPUser;
import com.liushuo.dev.serachpic_pro.service.SPRegisterService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by liushuo on 17/1/5.
 */

@Service
public class SPRegisterServiceImpl implements SPRegisterService {

    @Resource
    SPRegisterMapper registerMapper;

    public void register(SPUser user){
        registerMapper.insertUser(user);
    }

    public SPUser userIsExitts(SPUser user){
        return registerMapper.userIsExitts(user);
    }

}
