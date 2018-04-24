package com.yaofly.yaofly.Model;

import java.io.Serializable;

/**
 * Created by jianweiwei on 2018/4/1.
 */

public class ResponseInfo implements Serializable{
    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public int getResultCode() {
        return resultCode;
    }

    public void setResultCode(int resultCode) {
        this.resultCode = resultCode;
    }

    private String errorMessage;
    private int resultCode;
}
