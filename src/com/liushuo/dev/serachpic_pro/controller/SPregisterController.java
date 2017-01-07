package com.liushuo.dev.serachpic_pro.controller;

import Utils.StringTool;
import com.liushuo.common.Base;
import com.liushuo.dev.serachpic_pro.pojo.SPUser;
import com.liushuo.dev.serachpic_pro.service.SPLoginService;
import com.liushuo.dev.serachpic_pro.service.SPRegisterService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created by liushuo on 17/1/5.
 */
@Controller

@RequestMapping("/sp")
public class SPregisterController {


    @Resource
    SPRegisterService registerService;

    @RequestMapping(value = "/user_register")
    @ResponseBody
    public ResponseEntity<?> register(SPUser user){
        user.setUserId(StringTool.createUnitId());
        try {
            if (registerService.userIsExitts(user) != null){
                Base data = new Base("20000","用户已存在");
                return new ResponseEntity<Base>(data, HttpStatus.OK);
            }

            registerService.register(user);
            Base data = new Base("10000","注册成功");
            return new ResponseEntity<Base>(data, HttpStatus.OK);
        }catch (Exception e){
            Base data = new Base("20000","注册失败");
            return new ResponseEntity<Base>(data, HttpStatus.OK);
        }





    }


}
