package com.hsj.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hsj.entity.Tweets;
import com.hsj.entity.request.LoginReq;
import com.hsj.entity.request.NewTweetReq;
import com.hsj.entity.request.RegisterReq;

/**
 * @author HUANG Zuo
 * @version create_time：2021-11-08 18:52:37
 * @declaration
 * @e-mail hz920120@gmail.com
 */
public interface TweetsService extends IService<Tweets> {

    Boolean newTweets(NewTweetReq req);
}
