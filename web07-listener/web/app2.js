/**
 * {}����Ҫʹ�õ�������module.js�еĳ�Ա
 * {}���������Ҫ��module.js�е�����һ�£�Ҳ�����ڴ˴�ȡ����
 * {}����������˱�������ô�ڵ�ǰģ����ֻ��ʹ�ñ���
 * {}�����˳����Բ��Ǳ�¶��˳��
 * һ��ģ���п���ͬʱ�ж��import
 * ���import���Ե�������ͬ��ģ�飬Ҳ������ͬһ��ģ��
 */

import { PI,Person,sum,PI as pi,Person as people,sum as add } from "./test2.js";
console.log(PI)
console.log(pi)

let result1 = sum(1,2)
console.log(result1)
let result2 = add(1,2)
console.log(result2)

let person1 = new Person("����",30)
person1.sayHello()
let person2 = new people("����",20)
person2.sayHello()


