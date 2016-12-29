package com.liushuo.myDemo.mapper.testPush;

import com.liushuo.myDemo.qo.Push;

/**
 * Created by liushuo on 16/8/16.
 */
public interface PushMapper {

    public void insertDeviceToken(Push deviceToken);

    public int isExitsDeviceToken(Push deviceToken);
}
