package com.yaofly.yaofly;

import com.jaydenxiao.common.baseapp.BaseApplication;
import com.yanzhenjie.nohttp.Logger;
import com.yanzhenjie.nohttp.NoHttp;

/**
 * Created by jianweiwei on 2018/4/20.
 */

public class YaoflyApplaction extends BaseApplication {
    @Override
    public void onCreate() {
        super.onCreate();
        NoHttp.initialize(this);//nohttp默认初始化
        Logger.setDebug(true);
        Logger.setTag("Ingernet request/response data :  ");
    }
}
