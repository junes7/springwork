package app3;
//개발 방식을 정해 놓았다.
/*
 * 스프링을 이용해서 프로그램을 실행하기
 * 	-new연산자를 이용해서 객체 생성하는 코드를 직접 정의하지 않는다. (API제외)
 * 	-스프링 내부에서 제공하는 Factory클래스를 이용해서 객체를 전달받는다.
 */

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
//이거는 상위 클래스이다.
import org.springframework.core.io.Resource;

//BeanFactory(컨테이너)가 객체를 관리하는 방법

public class MyBeanTest_BeanFactory {
	public static void main(String[] args) {
		System.out.println("********Resource생성 전*********");
		//1. xml파싱
		Resource res =new ClassPathResource("/config/bean.xml");
		//2. 컨테이너 객체를 생성
		System.out.println("********BeanFactory생성 전*********");
		BeanFactory factory = new XmlBeanFactory(res);
		//The type XmlBeanFactory is deprecated
		//버전이 업되면서 왠만하면 쓰지 말자는 의미이다.
		//그러나 이것을 놓아둔 이유는 이것을 기반으로 개발된 프로그램이 많으므로..
		//3. 컨테이너가 관리하는 객체를 전달받기
		System.out.println("********getBean호출 전*********");
		//객체를 딱 하나만 만드는 singletone이다.
		MyBeanStyle obj = (MyBeanStyle)factory.getBean("myBean1");
		MyBeanStyle obj2 = (MyBeanStyle)factory.getBean("myBean1");
		//비지니스로직 호출
		if(obj==obj2) {
			System.out.println("같다.");
		} else {
			System.out.println("다르다.");
		}
		run(obj);
		show(obj);
	}
	public static void run(MyBeanStyle obj) {
		System.out.println("**************************");
		obj.hello("현빈");
		obj.hello("현빈");
		System.out.println("**************************");
	}
	public static void show(MyBeanStyle obj) {
		System.out.println("===========================");
		obj.hello("현빈");
		obj.hello("현빈");
		System.out.println("===========================");
	}
}
