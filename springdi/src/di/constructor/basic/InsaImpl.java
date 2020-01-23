package di.constructor.basic;

public class InsaImpl implements Insa {
	MemberDAO dao;

	//Constructor Injection으로 MemberDAO객체를 주입받기 위해 필요
	public InsaImpl(MemberDAO dao) {
		super();
		this.dao = dao;
		System.out.println("InsaImpl 매개변수 1개 생성자");	
	}
	
	//setter Injection으로 MemberDAO객체를 주입받기 위해 setter메소드를 준비
	@Override
	public void addUser(MemberDTO user) {
		dao.addUser(user);		
	}
	
	@Override
	public MemberDTO getUser(String id) {
		dao.getUser("id");
		return null;
	}

}
