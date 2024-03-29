package com.qf.detravel.entity;

import java.io.Serializable;

public class User implements Serializable {
    private Integer uId;
    private String uName;
    private String uNickName;
    private String uEmail;
    private String uPassWord;
    private String uPhone;
    private String uPicture;

    public User() {
    }

    public User(Integer uId, String uName, String uNickName, String uEmail, String uPassWord, String uPhone, String uPicture) {
        this.uId = uId;
        this.uName = uName;
        this.uNickName = uNickName;
        this.uEmail = uEmail;
        this.uPassWord = uPassWord;
        this.uPhone = uPhone;
        this.uPicture = uPicture;
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getuNickName() {
        return uNickName;
    }

    public void setuNickName(String uNickName) {
        this.uNickName = uNickName;
    }

    public String getuEmail() {
        return uEmail;
    }

    public void setuEmail(String uEmail) {
        this.uEmail = uEmail;
    }

    public String getuPassWord() {
        return uPassWord;
    }

    public void setuPassWord(String uPassWord) {
        this.uPassWord = uPassWord;
    }

    public String getuPhone() {
        return uPhone;
    }

    public void setuPhone(String uPhone) {
        this.uPhone = uPhone;
    }

    public String getuPicture() {
        return uPicture;
    }

    public void setuPicture(String uPicture) {
        this.uPicture = uPicture;
    }

    @Override
    public String toString() {
        return "User{" +
                "uId=" + uId +
                ", uName='" + uName + '\'' +
                ", uNickName='" + uNickName + '\'' +
                ", uEmail='" + uEmail + '\'' +
                ", uPassWord='" + uPassWord + '\'' +
                ", uPhone='" + uPhone + '\'' +
                ", uPicture='" + uPicture + '\'' +
                '}';
    }
}
