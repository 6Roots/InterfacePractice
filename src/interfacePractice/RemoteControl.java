package interfacePractice;

public interface RemoteControl {
	//�������̽� ����
	
	//��� ('static final' ���� ����)
	public int MAX_VOULME = 10;
	public static final int MIN_VOULME = 0;
	
	
	//�߻� �޼ҵ� (�޼ҵ� ����θ� �ۼ�) ('public abstract' ���� ����)
	public abstract void turnOn();
	void turnOff();
	public void setVolume(int volume);	
}
