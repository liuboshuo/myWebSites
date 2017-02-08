package com.liushuo.myDemo.controller.zhiwen;

import com.liushuo.common.ResultData;
import com.liushuo.dev.first.pojo.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.PrintWriter;
import java.util.ArrayList;

/**
 * Created by liushuo on 17/2/8.
 */
@Controller
@RequestMapping("/zhiwen")

public class IndexController {

    @RequestMapping(value = "/form",method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<?> getFrom()
    {
        try {
            Thread.sleep(2000);
        } catch (Exception e) {

        }
        ArrayList list = new ArrayList();
        User user = new User();
        user.setUserName("test");
        user.setPassword("testPwd");
        list.add(user);
        return new ResponseEntity<ResultData<ArrayList<User>>>(new ResultData<ArrayList<User>>(list), HttpStatus.OK);
    }

    @RequestMapping(value = "is_user",method = RequestMethod.POST)
    @ResponseBody
    public void userExits(String user,PrintWriter printWriter){
        if (user.equals("admin")){
            printWriter.print(false);
        }else {
            printWriter.print(true);
        }

    }

}
