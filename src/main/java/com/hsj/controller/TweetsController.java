package com.hsj.controller;

import com.hsj.entity.Replies;
import com.hsj.entity.request.GetRepliesReq;
import com.hsj.entity.request.NewTweetReq;
import com.hsj.entity.request.ReplyToTweetReq;
import com.hsj.enums.ResultCodeEnum;
import com.hsj.redis.Redis;
import com.hsj.service.RepliesService;
import com.hsj.service.TweetsService;
import com.hsj.wrapper.RestResult;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author HUANG Zuo
 * @version create_time：2021-11-09 10:50:15
 * @declaration
 * @e-mail hz920120@gmail.com
 */
@RestController
public class TweetsController {

    @Resource
    private RepliesService repliesService;

    @Resource
    private TweetsService tweetsService;

    @Resource
    private Redis redis;

    /**
     * new tweets
     * @param userId
     * @return
     */
    @PostMapping("/twitter/newTweet")
    public RestResult<String> register(@RequestBody NewTweetReq registerReq){
        RestResult result = new RestResult();

        if (StringUtils.isBlank(registerReq.getContent())) {
            result.setCode(ResultCodeEnum.EMPTY_CONTENT.getCode());
            result.setMsg(ResultCodeEnum.EMPTY_CONTENT.getMsg());
            return result;
        }

        //insert
        boolean res = tweetsService.newTweets(registerReq);
        if (res) {
            result.setCode(ResultCodeEnum.SUCCESS.getCode());
            result.setMsg(ResultCodeEnum.SUCCESS.getMsg());
            return result;
        } else {
            result.setCode(ResultCodeEnum.NEW_TWEETS_FAILED.getCode());
            result.setMsg(ResultCodeEnum.NEW_TWEETS_FAILED.getMsg());
            return result;
        }
    }

    @PostMapping("/twitter/getReplies")
    public RestResult<List<Replies>> getReplies(@RequestBody GetRepliesReq getRepliesReq){
        RestResult result = new RestResult();

        if (getRepliesReq.getTweetsId() == null) {
            result.setCode(ResultCodeEnum.GET_REPLIES_ERROR.getCode());
            result.setMsg(ResultCodeEnum.GET_REPLIES_ERROR.getMsg());
            return result;
        }

        //get replies list
        List<Replies> res = repliesService.getReplies(getRepliesReq);
        result.setCode(ResultCodeEnum.SUCCESS.getCode());
        result.setMsg(ResultCodeEnum.SUCCESS.getMsg());
        result.setData(res);
        return result;
    }

    @PostMapping("/twitter/replyToTweet")
    public RestResult<String> replyToTweet(@RequestBody ReplyToTweetReq replyToTweetReq){
        RestResult result = new RestResult();

        Long userAccountId = replyToTweetReq.getUserAccountId();
        Long tweetsId = replyToTweetReq.getTweetsId();
        Long toUserAccountId = replyToTweetReq.getToUserAccountId();
        String content = replyToTweetReq.getContent();

        //verify reply content
        if (StringUtils.isBlank(content)) {
            result.setCode(ResultCodeEnum.EMPTY_CONTENT.getCode());
            result.setMsg(ResultCodeEnum.EMPTY_CONTENT.getMsg());
            return result;
        }

        //verify reply parameters
        if (userAccountId == null || tweetsId == null || toUserAccountId == null) {
            result.setCode(ResultCodeEnum.REPLY_ERROR.getCode());
            result.setMsg(ResultCodeEnum.REPLY_ERROR.getMsg());
            return result;
        }

        //insert reply data
        Boolean res = repliesService.replyToTweet(replyToTweetReq);
        if (res) {
            result.setCode(ResultCodeEnum.SUCCESS.getCode());
            result.setMsg(ResultCodeEnum.SUCCESS.getMsg());
            return result;
        } else {
            result.setCode(ResultCodeEnum.REPLY_ERROR.getCode());
            result.setMsg(ResultCodeEnum.REPLY_ERROR.getMsg());
            return result;
        }
    }


}

