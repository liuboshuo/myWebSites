package com.liushuo.dev.serachpic_pro.service;

import com.liushuo.dev.serachpic_pro.pojo.SPUser;

/**
 * Created by liushuo on 17/1/5.
 */
public interface SPRegisterService {

    public SPUser userIsExitts(SPUser user);
    public void register(SPUser user);

}
