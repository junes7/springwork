package dl.exam01;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser {
	public static void main(String[] args) {
		/*
		 *	�����������̳ʿ� ���� �����ؼ� ��ü�� ���� �޾� ����� �� �ֵ��� �����ϱ�
		 * 	Dependency Lookup����
		 * 	��������: config/bean.xml
		 * 	�� ���:
		 * 		SamsungTV => samsung
		 * 		LgTV => lg
		 * 	getBean���� ���ͼ� �۾��ϵ��� �ڵ� �����ϱ�
		 */
		AbstractApplicationContext factory = 
				new GenericXmlApplicationContext("/config/bean.xml");
		//TV obj1 = (TV)factory.getBean("samsung");
		//TV obj1 = factory.getBean("samsung",TV.class);
		//���� ���� �����Ͽ� ����ϴ� �͵� �����ϴ�.
		TV tv = factory.getBean("tv", TV.class);
		
/*		if(obj1==obj2) {
			System.out.println("����.");
		} else {
			System.out.println("�ٸ���.");
		}*/
				
		
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
/*		
		obj2.powerOn();
		obj2.volumeUp();
		obj2.volumeDown();
		obj2.powerOff();*/
		//factory.close();
	}

}