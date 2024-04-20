package com.enzo.schedule.test;

import com.enzo.schedule.dao.BaseDao;
import com.enzo.schedule.pojo.SysUser;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;


public class TestBaseDao {

    private static BaseDao baseDao;

    @BeforeClass
    public static void initBaseDao(){
        baseDao=new BaseDao();
    }

    @Test
    public void testBaseQueryObject(){
        //查询用户数量 baseQueryObject 查询结果集是单行 单列的 一个值的数据的方法
        String sql = "select count(1) from sys_user";
        Long count = baseDao.baseQueryObject(Long.class, sql);
        System.out.println(count);
    }

    @Test
    public void testBaseQuery(){
        //注意起别名
        String sql = "select uid,username,user_pwd userPwd from sys_user";
        List<SysUser> sysUsers = baseDao.baseQuery(SysUser.class, sql);
        sysUsers.forEach(System.out::println);

    }

    @Test
    public void testBaseUpdate(){
        String sql = "insert into sys_schedule values(DEFAULT,?,?,?)";

        int rows = baseDao.baseUpdate(sql, 1, "学习Java", 0);
        System.out.println(rows);
    }


}
