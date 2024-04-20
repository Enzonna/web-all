<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2024/3/14
  Time: 13:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<script>
    //1 参数列表中多个普通参数 普通函数和箭头函数中都支持
    let fun1 = function (a, b, c, d = 10) {
        console.log(a, b, c, d)
    }
    let fun2 = (a, b, c, d = 10) => {
        console.log(a, b, c, d)
    }
    fun1(1, 2, 3)
    fun2(1, 2, 3, 4)
    //2 ...作为参数列表，称之为rest参数，普通函数和箭头函数中都支持，因为箭头函数中无法使用arguments，rest是一种解决方案
    let fun3 = function (...args) {
        console.log(args)
    }
    let fun4 = (...args) => {
        console.log(args)
    }
    fun3(1, 2, 3)
    fun4(1, 2, 3, 4)
    //rest参数在一个参数列表中的最后一个，一个参数列表只能有一个rest参数
    //let fun5 = {...args,...args2} => {}     会报错
</script>
</body>
</html>
