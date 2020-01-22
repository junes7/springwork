package basic;
public class MemberDTO {
	private String id;
	private String pass;
	private String name;
	//奄沙 持失切 持失
	public MemberDTO(){
		
	}
	public MemberDTO(String id, String pass, String name) {
		super();
		this.id = id;
		this.pass = pass;
		this.name = name;
	}
	//setter人 getter 持失
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
