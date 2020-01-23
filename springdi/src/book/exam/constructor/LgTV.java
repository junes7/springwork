package book.exam.constructor;

public class LgTV extends TV {
	Speaker speaker;
	
	public LgTV(Speaker speaker) {
		this.speaker = speaker;
	}

	public void powerOn() {
		System.out.println("LgTV---���� �Ҵ�.");
	}

	public void powerOff() {
		System.out.println("LgTV---���� ����.");
	}

	public void volumeUp() {
		System.out.println("LgTV---�Ҹ� �ø���.");
		speaker.volumeUp();
	}

	public void volumeDown() {
		System.out.println("LgTV---�Ҹ� ������.");
		speaker.volumeDown();
	}
}
