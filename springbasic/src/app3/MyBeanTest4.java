package app3;
//개발 방식을 정해 놓았다.
/*
 * 스프링을 이용해서 프로그램을 실행하기
 * 	-new연산자를 이용해서 객체 생성하는 코드를 직접 정의하지 않는다. (API제외)
 * 	-스프링 내부에서 제공하는 Factory클래스를 이용해서 객체를 전달받는다.
 */

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
//이거는 상위 클래스이다.


public class MyBeanTest4 {
	public static void main(String[] args) {
		//spring의 팩토리 클래스를 생성
		//ApplicationContext보다 기능이 많다. | ApplicationContext의 상위 클래스
		AbstractApplicationContext factory = 
			new GenericXmlApplicationContext("/config/bean.xml");
		//필요한 객체를 factory로 부터 가져온다.
		//설정파일에 등록한 id명을 정의 - <bean>태그의 id속성을 정의
		
		//기본설정이 singleton이므로 getBean을 세 번 호출해도
		//MyBeanStyleB객체는 한 개만 생성되어 호출된다.
		//따라서 init도 한 번 호출된다.
		MyBeanStyle obj1 = (MyBeanStyle)factory.getBean("myBean2");
		MyBeanStyle obj2 = (MyBeanStyle)factory.getBean("myBean2");
		MyBeanStyle obj3 = (MyBeanStyle)factory.getBean("myBean2");
		//비지니스로직 호출
		if(obj1==obj2) {
			System.out.println("같다.");
		} else {
			System.out.println("다르다.");
		}
		run(obj1);
		show(obj1);
		run(obj2);
		show(obj2);
		
		//컨테이너에 의해 생성된 객체가 소멸되는 시점은 컨테이너가 소멸될때
		factory.close();
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
