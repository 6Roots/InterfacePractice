package interfacePractice;

public class MyClass { //�������̽��� ����ϴ� Ŭ���� ����
	//�ʵ�
	RemoteControl rc = new Television();
	
	//������
	MyClass () {} // �Ű����� ���� ���
	
	MyClass (RemoteControl rc) { // �Ű����� �ִ� ���
		this.rc = rc;
		rc.turnOn();
		rc.setVolume(5);
		
	}
	
	//�޼ҵ�
	void methodA() {
		RemoteControl rc = new Audio(); // �ʱ� �ʵ�� Television ��ü������, methodA ���� �� Audio ��ü�� �����
		rc.turnOn();
		rc.setVolume(5);
	}
	
	void methodB( RemoteControl rc) {
	//Television ��ü�� �Ű������� ����
		rc.turnOn();
		rc.setVolume(5);
	}
	

}
