package com.hsj.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hsj.entity.Tweets;
import com.hsj.entity.UserAccount;
import com.hsj.entity.request.NewTweetReq;
import com.hsj.mapper.TweetsMapper;
import com.hsj.service.TweetsService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

/**
 * @author HUANG Zuo
 * @version create_time：2021-11-09 11:12:22
 * @declaration
 * @e-mail hz920120@gmail.com
 */
@Service
public class TweetsServiceImpl extends ServiceImpl<TweetsMapper, Tweets> implements TweetsService {

    @Override
    public Boolean newTweets(NewTweetReq req) {

        Tweets tweets = new Tweets();
        BeanUtils.copyProperties(req, tweets);
        int res = baseMapper.insert(tweets);
        return res == 1;
    }
}
