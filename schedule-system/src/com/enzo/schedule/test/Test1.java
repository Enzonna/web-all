package com.enzo.schedule.test;

import com.enzo.schedule.pojo.SysUser;

/**
 * ClassName: Test
 * Package: com.enzo.schedule.test
 * Description:
 *
 * @Author ENZO
 * @Create 2024/3/9 21:38
 * @Version 1.0
 */
public class Test1 {

    public void testAnnotation(){
        SysUser sysUser = new SysUser(1,"","");
        sysUser.getUserPwd();
    }
}
