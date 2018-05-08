package com.bwei.kangjialing20180508.presenter;


import com.bwei.kangjialing20180508.http.Httpconfig;
import com.bwei.kangjialing20180508.model.LoginListener;
import com.bwei.kangjialing20180508.model.LoginModel;
import com.bwei.kangjialing20180508.view.LoginView;
import com.bwei.kangjialing20180508.view.RegView;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wonder on 2018/4/20.
 */

public class LoginPresenterImpl implements LoginPresenter{
    @Override
    public void loginPresenter(LoginModel loginModel, final LoginView loginView) {
        Map<String,String> parms=new HashMap<>();
        parms.put("mobile",loginView.getMobile());
        parms.put("password",loginView.getPassWord());
        loginModel.login(Httpconfig.login_url, parms, new LoginListener() {
            @Override
            public void loginsuccess(String json) {
                loginView.LoginSuccess();
            }

            @Override
            public void loginerror(String error) {
                loginView.LoginError();
            }
        });
    }

    @Override
    public void RegPresenter(LoginModel loginModel, final RegView regView) {
        Map<String,String> parms=new HashMap<>();
        parms.put("mobile",regView.getMobile());
        parms.put("password",regView.getPassWord());
        loginModel.Reg(Httpconfig.reg_url, parms, new LoginListener() {
            @Override
            public void loginsuccess(String json) {
                regView.RegSuccess();

            }

            @Override
            public void loginerror(String error) {
                regView.RegError();
            }
        });
    }

}
