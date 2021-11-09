package com.hsj.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hsj.entity.Follow;
import com.hsj.entity.request.FollowReq;

/**
 * @author HUANG Zuo
 * @version create_time：2021-11-09 23:17:59
 * @declaration
 * @e-mail hz920120@gmail.com
 */
public interface FollowService extends IService<Follow> {

    Boolean follow(FollowReq req);
}
