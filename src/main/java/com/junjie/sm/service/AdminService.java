package com.junjie.sm.service;

import com.junjie.sm.utils.ResultEntity;

/**
 * @ClassName AdminServie
 * @Description TODO
 * @Author 28380
 * @Date 2020/11/15
 **/

public interface AdminService {
    /**
     * 管理员登录
     *
     * @param account     :账号
     * @param password:密码
     * @return ResultEntity:返回结果
     */
    ResultEntity adminLogin(String account, String password);
}
