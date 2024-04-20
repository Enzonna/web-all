package com.enzo.schedule.dao;

import com.enzo.schedule.pojo.SysSchedule;

import java.util.List;

/**
 * 介绍一下当前类...
 * 作者：
 * 时间：。。。。。
 */
public interface SysScheduleDao {
    /**
     * 该方法用于向数据库中增加一条日程记录
     * @param schedule 日程数据以SysSchedule实体类对象形式入参
     * @return 返回影响数据库记录的行数，行数为0增加失败，行数大于0说明增加成功
     */
    int addSchedule(SysSchedule schedule);

    /**
     * 查询所有用户的日程
     * @return 将所有日程放入一个List<SysSchedule>集合中返回
     */
    List<SysSchedule> findAll();

}


