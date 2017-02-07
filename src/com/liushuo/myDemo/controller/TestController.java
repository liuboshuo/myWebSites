package com.liushuo.myDemo.controller;

import com.liushuo.common.ResultData;
import com.liushuo.dev.first.pojo.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.PrintWriter;
import java.lang.reflect.Method;
import java.util.ArrayList;

/**
 * Created by liushuo on 16/8/13.
 */

@Controller
@RequestMapping("/test")
public class TestController {


    //测试
    @RequestMapping("/test")
    public String test() {
        return "/Demo/jsp/index.jsp";
    }



    @RequestMapping("/ajax1")
    public String ajax1(PrintWriter printWriter){

        return "test";

    }


    @RequestMapping(value = "ajax2",method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<?> getJson(){
        try {
            Thread.sleep(2000);
        }catch (Exception e){

        }
        ArrayList list = new ArrayList();

        User user = new User();
        user.setUserName("test");
        user.setPassword("testPwd");


        User user1 = new User();
        user1.setUserName("test");
        user1.setPassword("testPwd");


        list.add(user);

        list.add(user1);
        return new ResponseEntity<ResultData<ArrayList<User>>>(new ResultData<ArrayList<User>>(list), HttpStatus.OK);
    }
    @RequestMapping(value = "form",method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<?> getFrom()
    {
        ArrayList list = new ArrayList();
        User user = new User();
        user.setUserName("test");
        user.setPassword("testPwd");
        list.add(user);
        return new ResponseEntity<ResultData<ArrayList<User>>>(new ResultData<ArrayList<User>>(list), HttpStatus.OK);
    }
}
