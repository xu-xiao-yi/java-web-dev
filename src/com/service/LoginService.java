package com.service;

/**
 * @author mqxu
 * @date 2019/9/18
 * 登陆功能类
 */
public class LoginService {
    /**
     * 登陆功能
     * @param username
     * @param password
     * @return boolean
     */
    public boolean isLogin(String username, String password) {
        boolean flag = false;
        if ("许莫淇".equals(username.trim()) && "111".equals(password.trim())) {
            flag = true;
        }
        return flag;
    }
}
