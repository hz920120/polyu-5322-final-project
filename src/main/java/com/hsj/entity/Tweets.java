package com.hsj.entity;


import com.baomidou.mybatisplus.annotation.TableName;

import java.util.Date;

@TableName("tweets")
public class Tweets {

  private long id;
  private long userAccountId;
  private String content;
  private Date tweetTime;
  private long status;
  private Date createTime;
  private Date modifyTime;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


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


  public Date getTweetTime() {
    return tweetTime;
  }

  public void setTweetTime(Date tweetTime) {
    this.tweetTime = tweetTime;
  }


  public long getStatus() {
    return status;
  }

  public void setStatus(long status) {
    this.status = status;
  }


  public Date getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Date createTime) {
    this.createTime = createTime;
  }


  public Date getModifyTime() {
    return modifyTime;
  }

  public void setModifyTime(Date modifyTime) {
    this.modifyTime = modifyTime;
  }

}
