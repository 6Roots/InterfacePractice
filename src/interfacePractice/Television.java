package interfacePractice;

public class Television implements RemoteControl {
	//����Ŭ���� ����
	//�ʵ�
	private int volume;
	
	//������
	//turnOn() �߻� �޼ҵ��� ��ü �޼ҵ�
	public void turnOn() {
		System.out.println("TV�� �մϴ�.");
	}
	//turnOff() �߻�޼ҵ��� ��ü�޼ҵ�
	public void turnOff() {
		System.out.println("TV�� ���ϴ�.");
	}
	//setVolume() �߻�޼ҵ��� ��ü�޼ҵ�
	public void setVolume(int volume) {
		if ( volume < MIN_VOULME) {
			System.out.println("�ּ� TV ������ 0�Դϴ�.");
			this.volume = MIN_VOULME;
		} else if ( volume > MAX_VOULME) {
			System.out.println("�ִ� TV ������ 10�Դϴ�.");
			this.volume = MAX_VOULME;
		} else {
			this.volume = volume;
		}
		System.out.println("���� TV ������"+ volume +"�Դϴ�.");
	}
	
}
