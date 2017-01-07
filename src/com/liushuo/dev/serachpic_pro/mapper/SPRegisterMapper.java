package com.liushuo.dev.serachpic_pro.mapper;

import com.liushuo.dev.serachpic_pro.pojo.SPUser;

/**
 * Created by liushuo on 17/1/5.
 */
public interface SPRegisterMapper {

    public SPUser userIsExitts(SPUser user);
    public void insertUser(SPUser user);

}
