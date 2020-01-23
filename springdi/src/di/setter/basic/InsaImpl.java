package di.setter.basic;



public class InsaImpl implements Insa {
	MemberDAO dao;
	public InsaImpl() {
		System.out.println("InsaImpl 기본 생성자");
	}
	
	public InsaImpl(MemberDAO dao) {
		super();
		this.dao = dao;
		System.out.println("InsaImpl 매개변수 1개 생성자");	
	}

	public MemberDAO getDao() {
		return dao;
	}
	public void setDao(MemberDAO dao) {
		System.out.println("setter메소드 호출");
		this.dao = dao;
	}
	
	
	@Override
	public void add(MemberDTO user) {
		dao.add(user);		
	}
	
	@Override
	public MemberDTO getUser(String id) {
		dao.getUser("id");
		return null;
	}

}
