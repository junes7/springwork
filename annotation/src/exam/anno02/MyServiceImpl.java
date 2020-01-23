package exam.anno02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/*이름을 안 주면 실행을 위해서 test 클래스에서 myServiceImpl로 준다.*/

@Service/*("service")*/

public class MyServiceImpl implements MyService {
	@Autowired
	@Qualifier("mylogic")
	Logic mylogic;
	String name;
	String msg;
	public MyServiceImpl() {
		
		
	}
	
	public MyServiceImpl(Logic mylogic, String name, String msg) {
		super();
		this.mylogic = mylogic;
		this.name = name;
		this.msg = msg;
		System.out.println("ServiceImpl의 매개변수3개 생성자");
	}

	@Override
	public void test() {
		//Logic의 메소드를 호출하는 메소드
		//System.out.println(msg+","+name);
		mylogic.testLogic();
	}

}
