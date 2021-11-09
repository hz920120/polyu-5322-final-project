package com.hsj.entity.request;

/**
 * @author HUANG Zuo
 * @version create_time：2021-11-09 23:21:00
 * @declaration
 * @e-mail hz920120@gmail.com
 */
public class FollowReq {

    private Long userAccountId;

    private Long followingUserAccountId;

    public Long getUserAccountId() {
        return userAccountId;
    }

    public void setUserAccountId(Long userAccountId) {
        this.userAccountId = userAccountId;
    }

    public Long getFollowingUserAccountId() {
        return followingUserAccountId;
    }

    public void setFollowingUserAccountId(Long followingUserAccountId) {
        this.followingUserAccountId = followingUserAccountId;
    }
}
