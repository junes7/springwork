package di.setter.basic;



public class InsaImpl implements Insa {
	MemberDAO dao;
	public InsaImpl() {
		System.out.println("InsaImpl �⺻ ������");
	}
	
	public InsaImpl(MemberDAO dao) {
		super();
		this.dao = dao;
		System.out.println("InsaImpl �Ű����� 1�� ������");	
	}

	public MemberDAO getDao() {
		return dao;
	}
	public void setDao(MemberDAO dao) {
		System.out.println("setter�޼ҵ� ȣ��");
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
