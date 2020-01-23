package book.exam.constructor;

public class SamsungTV extends TV {
	//현재 클래스 내부에서 사용하는 객체 스프링컨테이너를 통해 전달받을 수 있도록 준비한다.
	Speaker speaker;
	
	public SamsungTV(Speaker speaker) {
		this.speaker = speaker;
	}

	public void powerOn() {
		System.out.println("SamsungTV---전원 켠다.");
	}

	public void powerOff() {
		System.out.println("SamsungTV---전원 끈다.");
	}

	public void volumeUp() {
		System.out.println("SamsungTV---소리 올린다.");
		speaker.volumeUp();
	}

	public void volumeDown() {
		System.out.println("SamsungTV---소리 내린다.");
		speaker.volumeDown();
	}
}
