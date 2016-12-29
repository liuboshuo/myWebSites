package com.liushuo.myDemo.controller.testPush;

import com.liushuo.myDemo.vo.base.Base;
import com.liushuo.myDemo.vo.base.BaseStatus;
import com.liushuo.myDemo.qo.Push;
import com.liushuo.myDemo.service.testPush.PushService;
import javapns.devices.Device;
import javapns.devices.implementations.basic.BasicDevice;
import javapns.notification.AppleNotificationServerBasicImpl;
import javapns.notification.PushNotificationManager;
import javapns.notification.PushNotificationPayload;
import javapns.notification.PushedNotification;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.*;
import java.util.ArrayList;

/**
 * Created by liushuo on 16/8/16.
 */
@Controller
@RequestMapping("/push")
public class TestController2 {

    @Resource
    private PushService pushService;

    @RequestMapping("/uploadDeviceToken")
    public ResponseEntity test(Push deviceToken){
        try {
            if (!pushService.isExitsDeviceToken(deviceToken)) {
                pushService.insertDeviceToken(deviceToken);
            }
            return  new ResponseEntity(new Base(BaseStatus.SUCCESS,""), HttpStatus.OK);
        }catch (Exception e){
            return  new ResponseEntity(new Base(BaseStatus.ERROR,"error"), HttpStatus.OK);
        }
    }

    @RequestMapping("/push")
    public ResponseEntity push(Push push){
        try {

            String alert = "我的push测试";
            int badge = 100;
            String sound = "default";

            List<String> tokens = new ArrayList<String>();

            tokens.add(push.getDeviceToken());
            String cer = "/Users/liushuo/Downloads/拜助理客户端iOS/证书.p12";
            String cerpwd = "000";
            boolean sendCount = true;

            PushNotificationPayload pyLoad = new PushNotificationPayload();
            pyLoad.addAlert(alert);
            pyLoad.addBadge(badge);
            if (sound != null){
                pyLoad.addSound(sound);
            }
            PushNotificationManager pushManager = new PushNotificationManager();
            pushManager.initializeConnection(new AppleNotificationServerBasicImpl(cer,cerpwd,false));

            List<PushedNotification> notifications = new ArrayList<PushedNotification>();

            if (sendCount){
                Device device = new BasicDevice();
                device.setToken(tokens.get(0));
                PushedNotification not = pushManager.sendNotification(device,pyLoad,true);
                notifications .add(not);
            }else {
                List<Device> device = new ArrayList<Device>();
                for (String token:tokens){
                    device.add(new BasicDevice(token));
                }
                notifications = pushManager.sendNotifications(pyLoad,device);
            }
            List<PushedNotification> failNotifications = PushedNotification.findFailedNotifications(notifications);
            List<PushedNotification> successfulNotifications = PushedNotification.findSuccessfulNotifications(notifications);
            int failed = failNotifications.size();
            int successfulSize = successfulNotifications.size();
            pushManager.stopConnection();
            System.out.println(failed + " " + successfulSize);
            return  new ResponseEntity(new Base(BaseStatus.SUCCESS,""), HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity(new Base(BaseStatus.ERROR, "error"), HttpStatus.OK);
        }
    }

    public static void main(String[] args) {

        try {

            //推送内容
            String alert = "我的push测试";
            int badge = 100;
            String sound = "default";


            List<String> tokens = new ArrayList<String>();

            //添加设备deviceId
            tokens.add("b6eb6ee1e2d734347cd5825b058f89215ae9cddde794de9b742af1557f5429e3");
            //证书的路径
            String cer = "/Users/liushuo/Desktop/Bay_Assistant_Test.p12";
            //证书的密码
            String cerpwd = "000";
            boolean sendCount = true;


            PushNotificationPayload pyLoad = new PushNotificationPayload();
            pyLoad.addAlert(alert);
            //角标
            pyLoad.addBadge(badge);
            if (sound != null){
                pyLoad.addSound(sound);
            }
            PushNotificationManager pushManager = new PushNotificationManager();
            pushManager.initializeConnection(new AppleNotificationServerBasicImpl(cer,cerpwd,false));

            List<PushedNotification> notifications = new ArrayList<PushedNotification>();

            if (sendCount){
                //单发
                Device device = new BasicDevice();
                device.setToken(tokens.get(0));
                PushedNotification not = pushManager.sendNotification(device,pyLoad,true);
                notifications .add(not);
            }else {
                //群发
                List<Device> device = new ArrayList<Device>();
                for (String token:tokens){
                    device.add(new BasicDevice(token));
                }
                notifications = pushManager.sendNotifications(pyLoad,device);
            }
            List<PushedNotification> failNotifications = PushedNotification.findFailedNotifications(notifications);
            List<PushedNotification> successfulNotifications = PushedNotification.findSuccessfulNotifications(notifications);
            int failed = failNotifications.size();
            int successfulSize = successfulNotifications.size();
            pushManager.stopConnection();
            System.out.println("失败:" + failed + " 成功:" + successfulSize);


        }catch (Exception e) {

        }
    }


}

