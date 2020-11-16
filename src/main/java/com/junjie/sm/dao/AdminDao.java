package com.junjie.sm.dao;

import com.junjie.sm.entity.Admin;

import java.sql.SQLException;

/**
 * @ClassName AdminDao
 * @Description TODO
 * @Author 28380
 * @Date 2020/11/15
 **/

public interface AdminDao {
    /**
     * 根据账号查找管理员
     *
     * @param account:账号入参
     * @return Admin:管理员信息
     * @throws java.sql.SQLException 该方法会输出SQL异常
     */
     Admin findAdminByAccount(String account) throws SQLException;
}
