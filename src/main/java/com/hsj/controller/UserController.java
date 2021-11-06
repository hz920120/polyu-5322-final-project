package com.hsj.controller;


import com.hsj.redis.Redis;
import com.hsj.service.UserService;
import com.hsj.wrapper.RestResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;

/**
 * <p>
 * 用户表 前端控制器
 * </p>
 *
 * @author system
 * @since 2021-08-25
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;
    @Resource
    private Redis redis;

    /**
     * @Description:获取用户信息：mysql&redis
     * @author HeShengjin 2356899074@qq.com
     * @date 2021/8/26 12:54
     */
    @GetMapping("/getUserInfo")
    public RestResult getUserInfo(@RequestParam Long userId){
        return RestResult.ok(new HashMap<String,Object>(){{
            put("redis_memory_result",redis.incr("dockercomposespringbootmysqlredis:v1.0.0", 1L));
            put("mysql_db_result",userService.getById(userId));
        }});
    }

}

