package com.hsj.entity;


import java.util.Date;

public class Follow {

  private long id;
  private long userAccountId;
  private long followingUserAccountId;
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


  public long getFollowingUserAccountId() {
    return followingUserAccountId;
  }

  public void setFollowingUserAccountId(long followingUserAccountId) {
    this.followingUserAccountId = followingUserAccountId;
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
