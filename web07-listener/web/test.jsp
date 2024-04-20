<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2024/3/13
  Time: 23:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<script>
    //ES6 允许使用“箭头” => 定义函数
    //1 函数说明
    let fn1 = function () {}
    let fn2 = () => {}              //剪头函数，此处不需要书写function关键字
    let fn3 = x => {}               //单参数可以省略()，多参数无参数不可用！
    let fn4 = x => console.log(x)   //只有一行函数体可以省略{}
    let fn5 = x => x + 1            //当函数只有一句返回值时，可以省略{}和return语句
    //2 使用特点 箭头函数this关键字
    //在JavaScript中，this关键字通常用来引用函数所在的对象，或者在函数本身作为构造函数时，来引用新对象的实例
    //但是在箭头函数中，this的含义与常规函数定义中的含义不同，并且是由箭头函数定义时的上下文来决定的，而不是函数调用时的上下文决定的
    //箭头函数没有自己的this，this指向的是外层上下文环境的this
    let person = {
        name: "胡歌",
        showName: function () {
            console.log(this)       //这里this是person
            console.log(this.name)
        },
        viewName: () => {
            console.log(this)       //这里this是window
            console.log(this.name)
        }
    }
    person.showName()
    person.viewName()

    //this应用
    function Counter() {
        this.count = 0;
        setInterval(() => {
            //这里的this是上一层作用域中的this，即Counter实例化对象
            this.count++;
            console.log(this.count);
        }, 1000);
    }

    let counter = new Counter();
</script>
</body>
</html>
