/**
 * Ĭ�ϱ�¶�﷨ export default sum
 * Ĭ�ϱ�¶�൱�����ڱ�¶�Ķ����������һ����Ϊdefault������
 * ���ֱ�¶��ʽ������һ��module
 */

export const PI = 3.14
//����һ������
function sum(a,b){
    return a+b
}

//����һ����
class Person{
    constructor(name,age){
        this.name = name
        this.age = age
    }
    sayHello(){
        console.log(`Hello,my name is ${this.name},I'm ${this.age} years old.`)
    }
}

//Ĭ�ϵ���
export default sum
//ͳһ����
export{
    Person
}