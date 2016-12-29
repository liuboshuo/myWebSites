package com.liushuo.myDemo.controller.jsp;

import com.liushuo.myDemo.pojo.User1;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by liushuo on 16/8/13.
 */

@Controller
@RequestMapping("/Demo/jsp")
public class TestController1 {

    //测试数据到jsp的页面
    @RequestMapping("/test")
    public String test(HttpServletRequest request) {

        User1 user = new User1();
        user.setId(1);
        user.setUserName("liushuo");
        user.setPassword("liushuo");
        request.setAttribute("user",user);
        return "return.jsp";
    }
    //使用
    @RequestMapping("/test1")
    public String test1(Model model) {

        User1 user = new User1();
        user.setId(1);
        user.setUserName("liushuo");
        user.setPassword("liushuo");
        model.addAttribute("user",user);
        return "return.jsp";
    }



    //重定向demo
    @RequestMapping("/test5")
    public String test5() {

        //  在这个文件找
        //  /jsp/ajax就是回到跟目录下
        return "redirect:/Demo/jsp/ajax";
    }



    //返回数据的方式
    @RequestMapping("/test2")
    public void test2(String name, HttpServletResponse response) throws IOException {
        response.getWriter().write(name);
    }


    //返回页面
    @RequestMapping("ajax")
    public String text4()
    {
        return "testAjax.jsp";
    }

    //返回数据的方式
    @RequestMapping("/test3")
    public void test3(String name, PrintWriter printWriter) throws IOException {
        printWriter.write(name);
    }
}
