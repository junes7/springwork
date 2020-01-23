package book.exam.constructor;

public class SamsungTV extends TV {
	//���� Ŭ���� ���ο��� ����ϴ� ��ü �����������̳ʸ� ���� ���޹��� �� �ֵ��� �غ��Ѵ�.
	Speaker speaker;
	
	public SamsungTV(Speaker speaker) {
		this.speaker = speaker;
	}

	public void powerOn() {
		System.out.println("SamsungTV---���� �Ҵ�.");
	}

	public void powerOff() {
		System.out.println("SamsungTV---���� ����.");
	}

	public void volumeUp() {
		System.out.println("SamsungTV---�Ҹ� �ø���.");
		speaker.volumeUp();
	}

	public void volumeDown() {
		System.out.println("SamsungTV---�Ҹ� ������.");
		speaker.volumeDown();
	}
}
