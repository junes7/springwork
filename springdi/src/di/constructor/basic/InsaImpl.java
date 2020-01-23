package di.constructor.basic;

public class InsaImpl implements Insa {
	MemberDAO dao;

	//Constructor Injection���� MemberDAO��ü�� ���Թޱ� ���� �ʿ�
	public InsaImpl(MemberDAO dao) {
		super();
		this.dao = dao;
		System.out.println("InsaImpl �Ű����� 1�� ������");	
	}
	
	//setter Injection���� MemberDAO��ü�� ���Թޱ� ���� setter�޼ҵ带 �غ�
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
