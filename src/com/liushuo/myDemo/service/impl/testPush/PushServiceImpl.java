package com.liushuo.myDemo.service.impl.testPush;

import com.liushuo.myDemo.mapper.testPush.PushMapper;
import com.liushuo.myDemo.qo.Push;
import com.liushuo.myDemo.service.testPush.PushService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by liushuo on 16/8/16.
 */
@Service
public class PushServiceImpl implements PushService {

    @Resource
    private PushMapper pushMapper;

    @Override
    public void insertDeviceToken(Push deviceToken) {
        pushMapper.insertDeviceToken(deviceToken);
    }

    @Override
    public boolean isExitsDeviceToken(Push deviceToken) {

        return pushMapper.isExitsDeviceToken(deviceToken) > 0 ? true : false;
    }
}
