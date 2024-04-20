<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2024/3/14
  Time: 13:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<script>
    let arr = [1, 2, 3]
    let fun1 = (a, b, c) => {
        console.log(a, b, c)
    }
    //调用方法时，对arr进行转换，转换为1，2，3
    fun1(...arr)
    //应用场景1 合并数组
    let arr2 = [4, 5, 6]
    let arr3 = [...arr, ...arr2]
    console.log(arr3)
    //应用场景2 合并对象属性
    let p1 = {name: "胡歌"}
    let p2 = {age: 10}
    let p3 = {gender: "boy"}
    let person = {...p1, ...p2, ...p3}
    console.log(person)
</script>
</body>
</html>
