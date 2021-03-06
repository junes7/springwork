package app1;
//개발 방식을 정해 놓았다.
/* 
 * 결합도가 극도로 높은 프로그램
 * => 클래스간의 결합도고 강하고 의존성이 높다.
 * => 사용되는 클래스를 변경하면 이 클래스를 사용하고 있는 모든 소스를 수정해야 한다.
 * 즉, 수정해야 하는 범위기 넓어진다.
 * oop 특성(캡슐화, 상속성, 다형성)도 적용되어 있지 않다.
 */

public class MyBeanTest {
	public static void main(String[] args) {
		MyBeanStyleA obj = new MyBeanStyleA();
		run(obj);
		show(obj);
	}
	public static void run(MyBeanStyleA obj) {
		System.out.println("**************************");
		obj.testHello("현빈");
		obj.testHello("현빈");
		System.out.println("**************************");
	}
	public static void show(MyBeanStyleA obj) {
		System.out.println("===========================");
		obj.testHello("현빈");
		obj.testHello("현빈");
		System.out.println("===========================");
	}
}
