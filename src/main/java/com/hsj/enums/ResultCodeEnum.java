package com.hsj.enums;

/**
 * @author HUANG Zuo
 * @version create_time：2021-11-09 21:51:23
 * @declaration
 * @e-mail hz920120@gmail.com
 */
public enum ResultCodeEnum implements ResultCode {
    //SUCCESS
    SUCCESS(200, "success"),

    //FAIL
    WRONG_USERNAME_PASSWORD(40001, "Wrong username or password!"),
    USERNAME_ALREADY_REGISTERED(40002, "Username is already registered!"),
    REGISTRATION_FAILED(40003, "Registration failed!"),
    USER_DOESNT_EXIST(40004, "Username doesn't exist, please register first!"),
    WRONG_PASSWORD(40005, "Wrong password!"),
    EMPTY_CONTENT(40006, "Content cannot be empty!"),
    NEW_TWEETS_FAILED(40007, "Tweets failed!"),
    GET_REPLIES_ERROR(40008, "Something wrong when opening replies!"),
    REPLY_ERROR(40009, "Something wrong!"),
    FOLLOW_ERROR(40010, "Follow failed!"),

    ;

    ResultCodeEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    /**
     * code
     */
    public final int code;
    /**
     * msg
     */
    public final String msg;

    @Override
    public int getCode() {
        return -1;
    }

    @Override
    public String getMsg() {
        return null;
    }
}
