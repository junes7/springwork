package book.exam.constructor;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser {
	public static void main(String[] args) {
		/*
		 *	스프링컨테이너에 의해 생성해서 객체를 전달 받아 사용할 수 있도록 수정하기
		 * 	Dependency Lookup적용
		 * 	설정파일: config/bean.xml
		 * 	빈 등록:
		 * 		SamsungTV => samsung
		 * 		LgTV => lg
		 * 	getBean으로 얻어와서 작업하도록 코드 수정하기
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
		//위와 같이 선언하여 사용하는 것도 가능하다.
		
		
/*		if(obj1==obj2) {
			System.out.println("같다.");
		} else {
			System.out.println("다르다.");
		}*/

/*		
		obj2.powerOn();
		obj2.volumeUp();
		obj2.volumeDown();
		obj2.powerOff();*/
		//factory.close();
	}

}
