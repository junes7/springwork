package app3;
//���� ����� ���� ���Ҵ�.
/*
 * �������� �̿��ؼ� ���α׷��� �����ϱ�
 * 	-new�����ڸ� �̿��ؼ� ��ü �����ϴ� �ڵ带 ���� �������� �ʴ´�. (API����)
 * 	-������ ���ο��� �����ϴ� FactoryŬ������ �̿��ؼ� ��ü�� ���޹޴´�.
 */

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
//�̰Ŵ� ���� Ŭ�����̴�.


public class MyBeanTest3 {
	public static void main(String[] args) {
		//spring�� ���丮 Ŭ������ ����
		ApplicationContext factory = 
			new GenericXmlApplicationContext("/config/bean.xml");
		//�ʿ��� ��ü�� factory�� ���� �����´�.
		//�������Ͽ� ����� id���� ���� - <bean>�±��� id�Ӽ��� ����
		MyBeanStyle obj1 = (MyBeanStyle)factory.getBean("myBean1");
		MyBeanStyle obj2 = (MyBeanStyle)factory.getBean("myBean1");
		//�����Ͻ����� ȣ��
		if(obj1==obj2) {
			System.out.println("����.");
		} else {
			System.out.println("�ٸ���.");
		}
		run(obj1);
		show(obj1);
		run(obj2);
		show(obj2);
	}
	public static void run(MyBeanStyle obj) {
		System.out.println("**************************");
		obj.hello("����");
		obj.hello("����");
		System.out.println("**************************");
	}
	public static void show(MyBeanStyle obj) {
		System.out.println("===========================");
		obj.hello("����");
		obj.hello("����");
		System.out.println("===========================");
	}
}