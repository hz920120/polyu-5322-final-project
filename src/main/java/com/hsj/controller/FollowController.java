package com.hsj.controller;

import com.hsj.entity.request.FollowReq;
import com.hsj.enums.ResultCodeEnum;
import com.hsj.redis.Redis;
import com.hsj.service.FollowService;
import com.hsj.wrapper.RestResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author HUANG Zuo
 * @version create_time：2021-11-09 23:17:07
 * @declaration
 * @e-mail hz920120@gmail.com
 */
@RestController
public class FollowController {

    @Resource
    private FollowService followService;

    @Resource
    private Redis redis;

    /**
     * new tweets
     * @param userId
     * @return
     */
    @PostMapping("/twitter/follow")
    public RestResult<String> register(@RequestBody FollowReq followReq){
        RestResult result = new RestResult();

        if (followReq.getUserAccountId() == null || followReq.getFollowingUserAccountId() == null) {
            result.setCode(ResultCodeEnum.FOLLOW_ERROR.getCode());
            result.setMsg(ResultCodeEnum.FOLLOW_ERROR.getMsg());
            return result;
        }

        //insert follow data
        boolean res = followService.follow(followReq);
        if (res) {
            result.setCode(ResultCodeEnum.SUCCESS.getCode());
            result.setMsg(ResultCodeEnum.SUCCESS.getMsg());
            return result;
        } else {
            result.setCode(ResultCodeEnum.FOLLOW_ERROR.getCode());
            result.setMsg(ResultCodeEnum.FOLLOW_ERROR.getMsg());
            return result;
        }
    }
}
