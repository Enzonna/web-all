package com.enzo.schedule.pojo;

import lombok.*;

import java.io.Serializable;
import java.util.Objects;

/**
 * 最为实体类最基本的要求：
 * 1 实体类的类名和表格名称应该对应
 * 2 实体类的属性名和表格的列名应该对应
 * 3 每个属性必须私有
 * 4 每个属性都应该具备getter setter
 * 5 必须具备无参构造器
 * 6 应该实现序列化接口
 * 7 应该重写类的hashcode和equals方法
 * 8 toString是否重写都可以
 *
 * 使用lombok帮助我们生成这些内容 getter setter 全参构造 无参构造 equals hashcode
 *  lombok使用步骤：
 *      1 检查idea是否已经安装了lombok插件
 *      2 检查是否勾选了enable annotation processing
 *      3 导入lombok依赖
 *      4 在实体类上注解
 *
 */

@AllArgsConstructor //相当于添加了全参构造
@NoArgsConstructor  //无参构造
@Data               //getter setter 全参构造 无参构造 equals hashcode
public class SysUser implements Serializable {
    private Integer uid;
    private String username;
    private String userPwd;


}
