package interfacePractice;

public interface RemoteControl {
	//인터페이스 선언
	
	//상수 ('static final' 생략 가능)
	public int MAX_VOULME = 10;
	public static final int MIN_VOULME = 0;
	
	
	//추상 메소드 (메소드 선언부만 작성) ('public abstract' 생략 가능)
	public abstract void turnOn();
	void turnOff();
	public void setVolume(int volume);	
}
