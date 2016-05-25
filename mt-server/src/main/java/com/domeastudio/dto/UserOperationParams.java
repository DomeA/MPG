package com.domeastudio.dto;

import org.codehaus.jackson.map.annotate.JsonRootName;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by domea on 16-5-25.
 */
@JsonRootName("userOperationParams")
public class UserOperationParams implements Serializable {
    private String email;
    private String phone;
    private String loginName;
    private String passWord;
    private Date date;

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
