package com.hsj.entity.request;

/**
 * @author HUANG Zuo
 * @version create_time：2021-11-08 20:56:46
 * @declaration
 * @e-mail hz920120@gmail.com
 */
public class GetRepliesReq {

    private Long tweetsId;

    public Long getTweetsId() {
        return tweetsId;
    }

    public void setTweetsId(long tweetsId) {
        this.tweetsId = tweetsId;
    }
}
