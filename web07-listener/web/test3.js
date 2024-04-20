const PI = 3.14

function sum(a, b) {
    return a + b;
}

class Person {
    constructor(name, age) {
        this.name = name
        this.age = age
    }

    sayHello() {
        console.log(`Hello,my name is ${this.name},I'm ${this.age} years old.`)
    }
}

//统一导出
export{
    PI,
    sum,
    Person
}