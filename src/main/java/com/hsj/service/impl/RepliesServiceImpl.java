package com.hsj.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hsj.entity.Replies;
import com.hsj.entity.UserAccount;
import com.hsj.entity.request.GetRepliesReq;
import com.hsj.entity.request.ReplyToTweetReq;
import com.hsj.mapper.RepliesMapper;
import com.hsj.service.RepliesService;
import org.springframework.beans.BeanUtils;

import java.util.List;

/**
 * @author HUANG Zuo
 * @version create_time：2021-11-09 22:42:40
 * @declaration
 * @e-mail hz920120@gmail.com
 */
public class RepliesServiceImpl extends ServiceImpl<RepliesMapper, Replies> implements RepliesService {

    @Override
    public List<Replies> getReplies(GetRepliesReq getRepliesReq) {
        QueryWrapper<Replies> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda().eq(Replies::getTweetsId, getRepliesReq.getTweetsId());
        return baseMapper.selectList(queryWrapper);
    }

    @Override
    public Boolean replyToTweet(ReplyToTweetReq replyToTweetReq) {
        Replies replies = new Replies();
        BeanUtils.copyProperties(replyToTweetReq, replies);
        int res = baseMapper.insert(replies);
        return res == 1;
    }
}
