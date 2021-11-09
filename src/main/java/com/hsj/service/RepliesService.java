package com.hsj.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hsj.entity.Replies;
import com.hsj.entity.Tweets;
import com.hsj.entity.request.GetRepliesReq;
import com.hsj.entity.request.ReplyToTweetReq;

import java.util.List;

/**
 * @author HUANG Zuo
 * @version create_time：2021-11-09 22:42:03
 * @declaration
 * @e-mail hz920120@gmail.com
 */
public interface RepliesService extends IService<Replies> {

    List<Replies> getReplies(GetRepliesReq getRepliesReq);

    Boolean replyToTweet(ReplyToTweetReq replyToTweetReq);
}
