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
 * @author HUANG Zuo
 * @version create_time：2021-11-08 16:32:16
 * @declaration
 * @e-mail hz920120@gmail.com
 */
@RestController
public class AccountController {

    @Resource
    private UserService userService;
    @Resource
    private Redis redis;


    /**
     * register twitter
     * @param userId
     * @return
     */
    @GetMapping("/twitter/register")
    public RestResult getUserInfo(@RequestParam Long userId){
        return RestResult.ok(new HashMap<String,Object>(){{
            put("redis_memory_result",redis.incr("dockercomposespringbootmysqlredis:v1.0.0", 1L));
            put("mysql_db_result",userService.getById(userId));
        }});
    }
}

