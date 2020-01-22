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

//ApplicationContext�� ��ü�� �����ϴ� ���
public class MyBeanTest_ApplicationContext {
	public static void main(String[] args) {
		//spring�� ���丮 Ŭ������ ����
		System.out.println("*********ApplicationContext���� ��************");
		ApplicationContext factory = 
			new GenericXmlApplicationContext("/config/bean.xml");
		//�ʿ��� ��ü�� factory�� ���� �����´�.
		//�������Ͽ� ����� id���� ���� - <bean>�±��� id�Ӽ��� ����
		System.out.println("***********getBeanȣ�� ��***********");
		MyBeanStyle obj = (MyBeanStyle)factory.getBean("myBean1");
		//�����Ͻ����� ȣ��
		run(obj);
		show(obj);
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
