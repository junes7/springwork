package book.exam.constructor;

public class LgTV extends TV {
	Speaker speaker;
	
	public LgTV(Speaker speaker) {
		this.speaker = speaker;
	}

	public void powerOn() {
		System.out.println("LgTV---전원 켠다.");
	}

	public void powerOff() {
		System.out.println("LgTV---전원 끈다.");
	}

	public void volumeUp() {
		System.out.println("LgTV---소리 올린다.");
		speaker.volumeUp();
	}

	public void volumeDown() {
		System.out.println("LgTV---소리 내린다.");
		speaker.volumeDown();
	}
}
