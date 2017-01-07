package com.liushuo.dev.serachpic_pro.controller;

import com.liushuo.common.Base;
import com.liushuo.common.ResultData;
import com.liushuo.dev.serachpic_pro.pojo.SPUser;
import com.liushuo.dev.serachpic_pro.service.SPLoginService;
import com.sun.org.apache.bcel.internal.generic.NEW;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created by liushuo on 17/1/6.
 */
@Controller
@RequestMapping("/sp")
public class SPLoginController {


    @Resource
    private SPLoginService loginService;

    @RequestMapping("/user_login")
    @ResponseBody
    public ResponseEntity<?> login(SPUser user) {
        try {
            SPUser resultUser = loginService.login(user);
            if (resultUser != null){
                return new ResponseEntity<ResultData<SPUser>>(new ResultData<SPUser>(user), HttpStatus.OK);
            }
        }catch (Exception e){
            return new ResponseEntity<Base>(new Base("20000","用户名或者密码错误"), HttpStatus.OK);
        }
        return new ResponseEntity<Base>(new Base("20000","登录失败"), HttpStatus.OK);
    }


}
