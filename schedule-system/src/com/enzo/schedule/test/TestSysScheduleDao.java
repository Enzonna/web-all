package com.enzo.schedule.test;

import com.enzo.schedule.dao.SysScheduleDao;
import com.enzo.schedule.dao.SysUserDao;
import com.enzo.schedule.dao.impl.SysScheduleDaoImpl;
import com.enzo.schedule.dao.impl.SysUserDaoImpl;
import com.enzo.schedule.pojo.SysSchedule;

import com.enzo.schedule.pojo.SysUser;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;


public class TestSysScheduleDao {
    private static SysScheduleDao scheduleDao;
    private static SysUserDao userDao;

    @BeforeClass
    public static void initSysScheduleDao() {
        scheduleDao = new SysScheduleDaoImpl();
    }
    @BeforeClass
    public static void initSysUserDao() {
        userDao = new SysUserDaoImpl();
    }

    @Test
    public void testAddUser(){
        int rows = userDao.addUser(new SysUser(null,"111111","111111"));
        System.out.println(rows);
    }
    @Test
    public void testAddSchedule() {
        int rows = scheduleDao.addSchedule(new SysSchedule(null, 2, "learn database", 1));
        System.out.println(rows);
    }

    @Test
    public void testFindAll() {
        List<SysSchedule> scheduleList = scheduleDao.findAll();
        scheduleList.forEach(System.out::println);
    }
}
