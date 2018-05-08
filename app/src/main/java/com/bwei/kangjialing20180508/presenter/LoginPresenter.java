package com.bwei.kangjialing20180508.presenter;


import com.bwei.kangjialing20180508.model.LoginModel;
import com.bwei.kangjialing20180508.view.LoginView;
import com.bwei.kangjialing20180508.view.RegView;

/**
 * Created by wonder on 2018/4/20.
 */

public interface LoginPresenter {
    void loginPresenter(LoginModel loginModel, LoginView loginView);
    void RegPresenter(LoginModel loginModel, RegView regView);
}
