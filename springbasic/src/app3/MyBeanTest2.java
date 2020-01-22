package app3;
//���� ����� ���� ���Ҵ�.
/*
 * �������� �̿��ؼ� ���α׷��� �����ϱ�
 * 	-new�����ڸ� �̿��ؼ� ��ü �����ϴ� �ڵ带 ���� �������� �ʴ´�. (API����)
 * 	-������ ���ο��� �����ϴ� FactoryŬ������ �̿��ؼ� ��ü�� ���޹޴´�.
 */

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
//�̰Ŵ� ���� Ŭ�����̴�.
import org.springframework.core.io.Resource;

//BeanFactory����ؼ� �۾��ϱ�
//1. xml�� spring���� ����� �� �ֵ��� ��ü�� ��ȯ�ϴ� �۾��� �����ϴ� ��ü����
//		-> ClassPathResource�� xml������ classpath(src)���� ã�´�.
//2. �����̳� ��ü�� �����ϴ� �۾�

public class MyBeanTest2 {
	public static void main(String[] args) {
		//1. xml�Ľ�
		Resource res =new ClassPathResource("/config/bean.xml");
		//2. �����̳� ��ü�� ����
		BeanFactory factory = new XmlBeanFactory(res);
		//The type XmlBeanFactory is deprecated
		//������ ���Ǹ鼭 �ظ��ϸ� ���� ���ڴ� �ǹ��̴�.
		//�׷��� �̰��� ���Ƶ� ������ �̰��� ������� ���ߵ� ���α׷��� �����Ƿ�..
		//3. �����̳ʰ� �����ϴ� ��ü�� ���޹ޱ�
		MyBeanStyle obj = (MyBeanStyle)factory.getBean("myBean");
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