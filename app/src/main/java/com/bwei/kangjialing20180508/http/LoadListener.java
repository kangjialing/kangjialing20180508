package com.bwei.kangjialing20180508.http;

/**
 * Created by wonder on 2018/4/19.
 */

public interface LoadListener {
    void LoadSuccess(String json);
    void LoadError(String error);
}
