/**
 *  *代表test-export.js的所有成员
 *  无论何种方式导入，导入的内容都会被当成一个对象处理
 *  使用一个对象来接受所有的成员
 */
import * as m1 from './test-export.js'
//使用暴露的属性
console.log(m1.PI)
//使用暴露的方法
console.log(m1.sum(1, 2))
//使用暴露的Person类
let person = new m1.Person('胡歌', 30)
person.sayHello()