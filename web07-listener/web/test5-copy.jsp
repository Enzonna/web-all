<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2024/3/14
  Time: 14:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<script>
    let arr = ['java', 'c', 'python']
    let person = {
        name: '胡歌',
        language: arr
    }
    //浅拷贝person2和person指向相同的内存
    let person2 = person
    person2.name = "周迅"
    console.log(person.name)

    //深拷贝，通过JSON和字符串的转换形成一个新的对象
    let person3 = JSON.parse(JSON.stringify(person))
    person3.name = "陈坤"
    console.log(person.name)
    console.log(person3.name)
</script>
</body>
</html>
