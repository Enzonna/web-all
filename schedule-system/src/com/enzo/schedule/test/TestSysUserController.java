package com.enzo.schedule.test;

import com.enzo.schedule.controller.SysUserController;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * ClassName: TestSysUserController
 * Package: com.enzo.schedule.test
 * Description:
 *
 * @Author ENZO
 * @Create 2024/3/11 22:37
 * @Version 1.0
 */
public class TestSysUserController {
    private static SysUserController sysUserController;

    @BeforeClass
    public static void initSysUserController(){
        sysUserController = new SysUserController();
    }

    @Test
    public void test(){

    }


}
