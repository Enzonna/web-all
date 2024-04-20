/**
 *  *代表test4.js中所有的成员
 *  m1代表所有成员所属的对象
 */

import * as m1 from './test4.js'
import {default as add} from './test4.js'   //用的少
import add2 from './test4.js'               //等效于import {default as add} from './test4.js'

//调用暴露的方法
let result = m1.default(10,20)
console.log(result)
let result2 = add(10,20)
console.log(result2)
let result3 = add2(10,20)
console.log(result3)
//引入其他方式暴露的内容
import { PI,Person } from './test2.js'
//使用暴露的Person类
let person = new Person("胡歌",30)
person.sayHello()
//使用暴露的属性
console.log(PI)
