package com.hsj.entity.request;

/**
 * @author HUANG Zuo
 * @version create_time：2021-11-09 22:55:17
 * @declaration
 * @e-mail hz920120@gmail.com
 */
public class ReplyToTweetReq {

    private Long userAccountId;
    private Long tweetsId;
    private Long toUserAccountId;
    private String content;

    public Long getUserAccountId() {
        return userAccountId;
    }

    public void setUserAccountId(Long userAccountId) {
        this.userAccountId = userAccountId;
    }

    public Long getTweetsId() {
        return tweetsId;
    }

    public void setTweetsId(Long tweetsId) {
        this.tweetsId = tweetsId;
    }

    public Long getToUserAccountId() {
        return toUserAccountId;
    }

    public void setToUserAccountId(Long toUserAccountId) {
        this.toUserAccountId = toUserAccountId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
