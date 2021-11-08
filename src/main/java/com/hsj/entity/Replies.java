package com.hsj.entity;


import com.baomidou.mybatisplus.annotation.TableName;

import java.util.Date;

@TableName("replies")
public class Replies {

  private long id;
  private long userAccountId;
  private long tweetsId;
  private long toUserAccountId;
  private String content;
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


  public long getTweetsId() {
    return tweetsId;
  }

  public void setTweetsId(long tweetsId) {
    this.tweetsId = tweetsId;
  }


  public long getToUserAccountId() {
    return toUserAccountId;
  }

  public void setToUserAccountId(long toUserAccountId) {
    this.toUserAccountId = toUserAccountId;
  }


  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
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
