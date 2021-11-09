package com.hsj.controller;

import com.hsj.entity.request.LoginReq;
import com.hsj.entity.request.RegisterReq;
import com.hsj.enums.ResultCodeEnum;
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
            result.setCode(ResultCodeEnum.WRONG_USERNAME_PASSWORD.getCode());
            result.setMsg(ResultCodeEnum.WRONG_USERNAME_PASSWORD.getMsg());
            return result;
        }

        //check whether username exists
        if (userAccountService.isUserAccountExist(username)) {
            result.setCode(ResultCodeEnum.USERNAME_ALREADY_REGISTERED.getCode());
            result.setMsg(ResultCodeEnum.USERNAME_ALREADY_REGISTERED.getMsg());
            return result;
        }

        //if not exist, register
        boolean res = userAccountService.register(registerReq);
        if (res) {
            result.setCode(ResultCodeEnum.SUCCESS.getCode());
            result.setMsg(ResultCodeEnum.SUCCESS.getMsg());
            return result;
        } else {
            result.setCode(ResultCodeEnum.REGISTRATION_FAILED.getCode());
            result.setMsg(ResultCodeEnum.REGISTRATION_FAILED.getMsg());
            return result;
        }
    }

    @PostMapping("/twitter/login")
    public RestResult<String> login(@RequestBody LoginReq loginReq){
        RestResult result = new RestResult();
        String username = loginReq.getUsername();
        String password = loginReq.getPassword();

        if (StringUtils.isBlank(username) || StringUtils.isBlank(password)) {
            result.setCode(ResultCodeEnum.WRONG_USERNAME_PASSWORD.getCode());
            result.setMsg(ResultCodeEnum.WRONG_USERNAME_PASSWORD.getMsg());
            return result;
        }

        //check whether username exists
        if (!userAccountService.isUserAccountExist(username)) {
            result.setCode(ResultCodeEnum.USER_DOESNT_EXIST.getCode());
            result.setMsg(ResultCodeEnum.USER_DOESNT_EXIST.getMsg());
            return result;
        }

        //if not exist, register
        boolean res = userAccountService.login(loginReq);
        if (res) {
            result.setCode(ResultCodeEnum.SUCCESS.getCode());
            result.setMsg(ResultCodeEnum.SUCCESS.getMsg());
            return result;
        } else {
            result.setCode(ResultCodeEnum.WRONG_PASSWORD.getCode());
            result.setMsg(ResultCodeEnum.WRONG_USERNAME_PASSWORD.getMsg());
            return result;
        }
    }
}

