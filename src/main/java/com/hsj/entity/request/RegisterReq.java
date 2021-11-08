package com.hsj.entity.request;

/**
 * @author HUANG Zuo
 * @version create_time：2021-11-08 20:56:46
 * @declaration
 * @e-mail hz920120@gmail.com
 */
public class RegisterReq {

    private String username;

    private String password;

    private String email;

    private long mobileNumber;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(long mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
}
