package book.exam.constructor;

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
		TV mytv = factory.getBean("samsungtv", TV.class);
		
		mytv.powerOn();
		mytv.powerOff();
		mytv.volumeUp();
		mytv.volumeDown();
		
		
		
		//TV obj1 = (TV)factory.getBean("samsung");
		//TV obj1 = factory.getBean("samsung",TV.class);
		//���� ���� �����Ͽ� ����ϴ� �͵� �����ϴ�.
		
		
/*		if(obj1==obj2) {
			System.out.println("����.");
		} else {
			System.out.println("�ٸ���.");
		}*/

/*		
		obj2.powerOn();
		obj2.volumeUp();
		obj2.volumeDown();
		obj2.powerOff();*/
		//factory.close();
	}

}
