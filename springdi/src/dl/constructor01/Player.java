package dl.constructor01;

//Player�� ���� �ִ� Dice�� �ܺο��� (�����������̳�) Injection �޾� ����ؾ�
//�ϹǷ� Injection���� �� �ֵ��� �̸� �غ��ؾ� �Ѵ�.
//=> Constructor or Setter �޼ҵ�
//���⼭ ������ ���鶧 AbstractDice d�� �����ε��ؼ� ����Ѵ�.
//Alt + Shift + T => AbstractPlayer �������̽� ������ �� ���� ����Ű
public class Player implements AbstractPlayer {
	AbstractDice d;
	int totalValue=0;
	public Player() {
		
	}
	public Player(AbstractDice d) {
		this.d = d;
		System.out.println("Player�� �Ű����� 1�� ������");
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