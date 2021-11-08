package com.hsj.controller;

import com.hsj.entity.request.RegisterReq;
import com.hsj.redis.Redis;
import com.hsj.service.UserAccountService;
import com.hsj.wrapper.RestResult;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author HUANG Zuo
 * @version create_time：2021-11-08 16:32:16
 * @declaration
 * @e-mail hz920120@gmail.com
 */
@RestController
public class AccountController {

    @Resource
    private UserAccountService userAccountService;
    @Resource
    private Redis redis;


    /**
     * register twitter
     * @param userId
     * @return
     */
    @PostMapping("/twitter/register")
    public RestResult<String> register(@RequestBody RegisterReq registerReq){
        RestResult result = new RestResult();
        String username = registerReq.getUsername();
        String password = registerReq.getPassword();

        if (StringUtils.isBlank(username) || StringUtils.isBlank(password)) {
            result.setCode(40001);
            result.setMsg("Wrong username or password!");
            return result;
        }

        //check where username exists
        if (userAccountService.isUserAccountExist(username)) {
            result.setCode(40002);
            result.setMsg("Username is already registered!");
            return result;
        }

        //if not exist, register
        boolean res = userAccountService.register(registerReq);
        if (res) {
            result.setCode(200);
            result.setMsg("success");
            return result;
        } else {
            result.setCode(40000);
            result.setMsg("Registration failed.");
            return result;
        }
    }
}

