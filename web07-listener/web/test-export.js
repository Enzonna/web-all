//1 �ֱ𵼳�
//ģ������⵼�������export�ؼ��ּ���
//����һ������
export const PI = 3.14

//����һ������
export function sum(a, b) {
    return a + b;
}

//����һ����
export class Person {
    constructor(name, age) {
        this.name = name
        this.age = age
    }

    sayHello() {
        console.log(`Hello,my name is ${this.name},I'm ${this.age} years old.`)
    }
}