/**
 *  *����test4.js�����еĳ�Ա
 *  m1�������г�Ա�����Ķ���
 */

import * as m1 from './test4.js'
import {default as add} from './test4.js'   //�õ���
import add2 from './test4.js'               //��Ч��import {default as add} from './test4.js'

//���ñ�¶�ķ���
let result = m1.default(10,20)
console.log(result)
let result2 = add(10,20)
console.log(result2)
let result3 = add2(10,20)
console.log(result3)
//����������ʽ��¶������
import { PI,Person } from './test2.js'
//ʹ�ñ�¶��Person��
let person = new Person("����",30)
person.sayHello()
//ʹ�ñ�¶������
console.log(PI)
