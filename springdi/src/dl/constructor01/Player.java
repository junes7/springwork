package dl.constructor01;

//Player가 갖고 있는 Dice를 외부에서 (스프링컨테이너) Injection 받아 사용해야
//하므로 Injection받을 수 있도록 미리 준비해야 한다.
//=> Constructor or Setter 메소드
//여기서 생성자 만들때 AbstractDice d만 오버로딩해서 사용한다.
//Alt + Shift + T => AbstractPlayer 인터페이스 생성할 때 쓰는 단축키
public class Player implements AbstractPlayer {
	AbstractDice d;
	int totalValue=0;
	public Player() {
		
	}
	public Player(AbstractDice d) {
		this.d = d;
		System.out.println("Player의 매개변수 1개 생성자");
	}
	
	public void play(){
			totalValue=0;
		for (int i = 0; i < 3; i++) {
			totalValue+=d.getDiceValue();
		}
	}
	public int getTotalValue(){
		return totalValue;
	}
}