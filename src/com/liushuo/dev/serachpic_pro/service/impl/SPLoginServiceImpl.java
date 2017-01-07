package com.liushuo.dev.serachpic_pro.service.impl;

import com.liushuo.dev.serachpic_pro.mapper.SPLoginMapper;
import com.liushuo.dev.serachpic_pro.pojo.SPUser;
import com.liushuo.dev.serachpic_pro.service.SPLoginService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by liushuo on 17/1/5.
 */
@Service
public class SPLoginServiceImpl implements SPLoginService{

    @Resource
    private SPLoginMapper loginMapper;


    public SPUser login(SPUser user){

        return loginMapper.userIsExitts(user);
    }

}
