package com.hsj.service;

import com.hsj.entity.request.LoginReq;
import com.hsj.entity.request.RegisterReq;

/**
 * @author HUANG Zuo
 * @version create_time：2021-11-08 18:52:37
 * @declaration
 * @e-mail hz920120@gmail.com
 */
public interface UserAccountService {

    Boolean isUserAccountExist(String username);

    Boolean register(RegisterReq req);

    Boolean login(LoginReq req);
}
