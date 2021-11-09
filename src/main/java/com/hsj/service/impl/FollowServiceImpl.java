package com.hsj.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hsj.entity.Follow;
import com.hsj.entity.request.FollowReq;
import com.hsj.mapper.FollowMapper;
import com.hsj.service.FollowService;
import org.springframework.beans.BeanUtils;

/**
 * @author HUANG Zuo
 * @version create_time：2021-11-09 23:18:55
 * @declaration
 * @e-mail hz920120@gmail.com
 */
public class FollowServiceImpl extends ServiceImpl<FollowMapper, Follow> implements FollowService {

    @Override
    public Boolean follow(FollowReq req) {
        Follow follow = new Follow();
        BeanUtils.copyProperties(req, follow);
        int res = baseMapper.insert(follow);
        return res == 1;
    }
}
