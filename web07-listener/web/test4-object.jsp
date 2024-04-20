<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2024/3/14
  Time: 13:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<script>
    class Person {
        //属性
        #n;
        age;

        get name() {
            return this.#n;
        }

        set name(n) {
            this.#n = n;
        }

        //实例方法
        eat(food) {
            console.log(this.age + "岁的" + this.#n + "用筷子吃" + food)
        }

        //静态方法
        static sun(a, b) {
            return a + b;
        }

        //构造器
        constructor(name, age) {
            this.#n = name;
            this.age = age;
        }
    }

    let person = new Person("胡歌", 30);
    //访问对象属性
    //调用对象方法
    console.log(person.name)
    //console.log(person.#n)    报错 私有属性
    person.name = "周迅";
    console.log(person.age)
    person.eat("火锅")
    console.log(Person.sun(1, 2))

    class Student extends Person {
        grade;
        score;

        study() {

        }

        constructor(name, age) {
            super(name, age);
        }
    }

    let stu = new Student("学生陈坤", 18)
    stu.eat("海天盛筵")

</script>
</body>
</html>
