package com.liushuo.myDemo.service.testPush;

import com.liushuo.myDemo.qo.Push;

/**
 * Created by liushuo on 16/8/16.
 */

public interface PushService {

    public void insertDeviceToken(Push deviceToken);

    public boolean isExitsDeviceToken(Push deviceToken);
}