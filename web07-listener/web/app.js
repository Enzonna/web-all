/**
 *  *����test-export.js�����г�Ա
 *  ���ۺ��ַ�ʽ���룬��������ݶ��ᱻ����һ��������
 *  ʹ��һ���������������еĳ�Ա
 */
import * as m1 from './test-export.js'
//ʹ�ñ�¶������
console.log(m1.PI)
//ʹ�ñ�¶�ķ���
console.log(m1.sum(1, 2))
//ʹ�ñ�¶��Person��
let person = new m1.Person('����', 30)
person.sayHello()