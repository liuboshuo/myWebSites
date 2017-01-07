package com.liushuo.dev.serachpic_pro.service;

import com.liushuo.dev.serachpic_pro.pojo.SPUser;
import org.springframework.stereotype.Service;

/**
 * Created by liushuo on 17/1/5.
 */
public interface SPLoginService {

    public SPUser login(SPUser user);
}
