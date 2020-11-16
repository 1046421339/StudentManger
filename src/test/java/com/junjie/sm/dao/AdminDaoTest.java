package com.junjie.sm.dao;

import java.sql.SQLException;
import static org.junit.Assert.assertEquals;
import com.junjie.sm.entity.Admin;
import com.junjie.sm.factory.DaoFactory;
import org.junit.Test;

public class AdminDaoTest {

    private final AdminDao adminDao = DaoFactory.getAdminDaoInstance();

    @Test
    public void findAdminByAccount() {
        Admin admin;
        try {
            admin = adminDao.findAdminByAccount("1046421339@qq.com");
            assertEquals("李俊杰", admin.getAdminName());
            System.out.println(admin);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
