package com.junjie.sm.factory;


import com.junjie.sm.service.AdminService;
import com.junjie.sm.service.impl.AdminServiceImpl;


/**
 * @ClassName ServieFactory
 * @Description TODO
 * @Author 28380
 * @Date 2020/11/15
 **/

public class ServiceFactory {
    public static AdminService getAdminServieInstance() {
        return new AdminServiceImpl();
    }
}
