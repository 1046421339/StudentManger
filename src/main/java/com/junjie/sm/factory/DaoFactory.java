package com.junjie.sm.factory;

import com.junjie.sm.dao.AdminDao;
import com.junjie.sm.dao.impl.AdminDaoImpl;

/**
 * @ClassName DaoFactory
 * @Description TODO
 * @Author 28380
 * @Date 2020/11/15
 **/

public class DaoFactory {
    /**
     * 获取AdminDao实例
     *
     * @return AdminDao实例
     */
    public static AdminDao getAdminDaoInstance() {
        return new AdminDaoImpl();
    }
}
