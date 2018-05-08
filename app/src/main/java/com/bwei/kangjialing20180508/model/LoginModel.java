package com.bwei.kangjialing20180508.model;

import java.util.Map;

/**
 * Created by wonder on 2018/4/20.
 */

public interface LoginModel {
    void login(String url, Map<String, String> parms, LoginListener loginListener);
    void Reg(String url, Map<String, String> parms, LoginListener loginListener);
}
