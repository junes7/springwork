package app3;

//���� �������̽��� �ۼ��Ѵ�.
/*public interface MyBeanStyle {
	void hello(String name);
}*/
public abstract class MyBeanStyle {
	public abstract void hello(String name);
	//��ü�� ������ �� �� �� ȣ��Ǵ� �޼ҵ�
	public void myInit() {
		System.out.println("init....");
	}
	//��ü�� �Ҹ�� �� �� �� ȣ��Ǵ� �޼ҵ�
	public void myDestroy() {
		System.out.println("destroy...");
	}
}