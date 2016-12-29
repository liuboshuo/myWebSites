package com.liushuo.myDemo.controller.jsp;

import org.springframework.http.server.ServletServerHttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 * Created by liushuo on 16/9/16.
 */

@Controller
public class UploadController {

    @RequestMapping("upload")
    public String test()
    {
        return "/Demo/jsp/upload.jsp";
    }

    @RequestMapping("uploadPic")
    public String uplodFile(HttpServletRequest request) throws IOException {
        //强制转化类型
        MultipartHttpServletRequest multiRequest = (MultipartHttpServletRequest)request;
        MultipartFile file = multiRequest.getFile("pic");


        CommonsMultipartFile cFile = (CommonsMultipartFile)file;

        byte[] bFile = cFile.getBytes();


        //文件名:时间格式加上三位随机数
        String fileName =  "";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmssSSS");
        fileName = sdf.format(new Date());

        Random random = new Random();
        for (int i = 0 ; i < 3 ; i++){
            fileName = fileName + random.nextInt(10);
        }

        fileName += cFile.getOriginalFilename().substring(cFile.getOriginalFilename().lastIndexOf("."));


        String path = request.getSession().getServletContext().getRealPath("/");

        path += "Res/upload/" + fileName;

        OutputStream outputStream = new FileOutputStream(path);

        outputStream.write(bFile);
        outputStream.flush();
        outputStream.close();

        return "/Demo/jsp/success.jsp";
    }
}
