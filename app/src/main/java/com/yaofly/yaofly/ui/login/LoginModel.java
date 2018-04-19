package com.yaofly.yaofly.ui.login;

import java.io.Serializable;

/**
 * Created by jianweiwei on 2018/4/19.
 */

public class LoginModel implements Serializable {
    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private String account;
    private String password;
}
