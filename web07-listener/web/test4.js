/**
 * 默认暴露语法 export default sum
 * 默认暴露相当于是在暴露的对象中添加了一个名为default的属性
 * 三种暴露方式可以在一个module
 */

export const PI = 3.14
//导出一个函数
function sum(a,b){
    return a+b
}

//导出一个类
class Person{
    constructor(name,age){
        this.name = name
        this.age = age
    }
    sayHello(){
        console.log(`Hello,my name is ${this.name},I'm ${this.age} years old.`)
    }
}

//默认导出
export default sum
//统一导出
export{
    Person
}