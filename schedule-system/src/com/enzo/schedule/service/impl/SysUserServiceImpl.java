package com.enzo.schedule.service.impl;

import com.enzo.schedule.dao.SysUserDao;
import com.enzo.schedule.dao.impl.SysUserDaoImpl;
import com.enzo.schedule.pojo.SysUser;
import com.enzo.schedule.service.SysUserService;
import com.enzo.schedule.util.MD5Util;

/**
 * ClassName: SysUserServiceImpl
 * Package: com.enzo.schedule.service.impl
 * Description:
 *
 * @Author ENZO
 * @Create 2024/3/11 18:48
 * @Version 1.0
 */
public class SysUserServiceImpl implements SysUserService {
    private SysUserDao userDao = new SysUserDaoImpl();
    @Override
    public int regist(SysUser sysUser) {
            //将用户的明文密码转换为密文密码
            sysUser.setUserPwd(MD5Util.encrypt(sysUser.getUserPwd()));
            //调用DAO层的方法，将sysUser信息存入数据库
            return userDao.addUser(sysUser);
    }

    @Override
    public SysUser findByUsername(String username) {
        return userDao.findByUsername(username);
    }


}
