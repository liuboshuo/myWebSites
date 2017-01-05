package com.liushuo.dev.serachpic_pro.controller;

import com.liushuo.common.Base;
import com.liushuo.dev.serachpic_pro.pojo.SPUser;
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

        System.out.println("------测试" + user);

        try {
            registerService.register(user);
            Base data = new Base("1000","成功");
            return new ResponseEntity<Base>(data, HttpStatus.OK);
        }catch (Exception e){
            Base data = new Base("2000","失败");
            return new ResponseEntity<Base>(data, HttpStatus.OK);
        }





    }


}
