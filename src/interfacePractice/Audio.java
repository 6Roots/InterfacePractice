package interfacePractice;

public class Audio implements RemoteControl{
	    //����Ŭ���� ����
		//�ʵ�
		private int volume;
		
		//������
		//turnOn() �߻� �޼ҵ��� ��ü �޼ҵ�
		public void turnOn() {
			System.out.println("������� �մϴ�.");
		}
		//turnOff() �߻�޼ҵ��� ��ü�޼ҵ�
		public void turnOff() {
			System.out.println("������� ���ϴ�.");
		}
		//setVolume() �߻�޼ҵ��� ��ü�޼ҵ�
		public void setVolume(int volume) { //�������̽��� �߻� �޼ҵ�� public�̱� ������ ��ü�޼ҵ�� public���� ���ٹ����� ���� �� ����.
			if ( volume < MIN_VOULME) {
				System.out.println("�ּ� ����� ������ 0�Դϴ�.");
				this.volume = MIN_VOULME;
			} else if ( volume > MAX_VOULME) {
				System.out.println("�ִ� ����� ������ 10�Դϴ�.");
				this.volume = MAX_VOULME;
			} else {
				this.volume = volume;
			}
			System.out.println("���� ����� ������"+ volume +"�Դϴ�.");
		}
	
}
