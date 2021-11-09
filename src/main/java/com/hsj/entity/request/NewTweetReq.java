package com.hsj.entity.request;

import java.util.Date;

/**
 * @author HUANG Zuo
 * @version create_time：2021-11-08 20:56:46
 * @declaration
 * @e-mail hz920120@gmail.com
 */
public class NewTweetReq {


    private long userAccountId;
    private String content;

    public long getUserAccountId() {
        return userAccountId;
    }

    public void setUserAccountId(long userAccountId) {
        this.userAccountId = userAccountId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}
