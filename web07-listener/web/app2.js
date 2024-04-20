/**
 * {}导入要使用的来自于module.js中的成员
 * {}导入的名称要和module.js中导出的一致，也可以在此处取别名
 * {}中如果定义了别名，那么在当前模块中只能使用别名
 * {}导入的顺序可以不是暴露的顺序
 * 一个模块中可以同时有多个import
 * 多个import可以导入多个不同的模块，也可以是同一个模块
 */

import { PI,Person,sum,PI as pi,Person as people,sum as add } from "./test2.js";
console.log(PI)
console.log(pi)

let result1 = sum(1,2)
console.log(result1)
let result2 = add(1,2)
console.log(result2)

let person1 = new Person("胡歌",30)
person1.sayHello()
let person2 = new people("陈粒",20)
person2.sayHello()


