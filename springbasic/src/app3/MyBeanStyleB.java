package app3;
//A와 B가 다르다는 것을 보여주기 위한 코드이다.
//Spring에서는 객체를 Bean이라고 부른다.
public class MyBeanStyleB extends MyBeanStyle {
	public MyBeanStyleB() {
		System.out.println("MyBeanStyleB의 기본 생성자");
	}
	@Override
	public void hello(String name) {
		System.out.println("hello...,"+name);
	}
}
