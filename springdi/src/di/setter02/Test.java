package di.setter02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import di.etc.CollectionTest;
import di.etc.ConstructorTest;

public class Test {
	public static void main(String[] args) {
		ApplicationContext factory = 
			new GenericXmlApplicationContext("config/etc.xml");
		CollectionTest etc1 = 
			factory.getBean("collection",CollectionTest.class);
		etc1.getlist();
		etc1.getMap();
		
		ConstructorTest etc2 = factory.getBean("con1", ConstructorTest.class);
		System.out.println(etc2);
		
		
		ConstructorTest etc3 = factory.getBean("con2", ConstructorTest.class);
		System.out.println(etc3);
				
		ConstructorTest etc4 = factory.getBean("con3", ConstructorTest.class);
		System.out.println(etc4);
	}
}
