package com.junjie.sm.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @ClassName JdbcUtil
 * @Description TODO
 * @Author Jason
 * @Date 2020/11/15
 **/
public class JdbcUtil {
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/student_manager?useUnicode=true&characterEncoding=UTF-8&autoReconnect=true&serverTimezone=GMT%2B8";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "Jason1046421339";
    private static Connection connection = null;
    private static JdbcUtil jdbcUtil = null;

    public static JdbcUtil getInitJdbcUtil() {
        if (jdbcUtil == null) {
            //线程加锁
            synchronized (JdbcUtil.class) {
                if (jdbcUtil == null) {
                    //懒汉式加载
                    jdbcUtil = new JdbcUtil();
                }
            }
        }
        return jdbcUtil;
    }

    private JdbcUtil() {
    }

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection() {
        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return connection;

    }

    public void closeConnection() {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                System.err.println(e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        Connection connection = JdbcUtil.getInitJdbcUtil().getConnection();
        if (connection != null) {
            System.out.println("连接成功");
        }
    }
}
