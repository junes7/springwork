package app2;
//A�� B�� �ٸ��ٴ� ���� �����ֱ� ���� �ڵ��̴�.
//Spring������ ��ü�� Bean�̶�� �θ���.
public class MyBeanStyleB implements MyBeanStyle {
	@Override
	public void hello(String name) {
		System.out.println("hello...,"+name);
	}
}