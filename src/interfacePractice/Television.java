package interfacePractice;

public class Television implements RemoteControl {
	//구현클래스 생성
	//필드
	private int volume;
	
	//생성자
	//turnOn() 추상 메소드의 실체 메소드
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}
	//turnOff() 추상메소드의 실체메소드
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}
	//setVolume() 추상메소드의 실체메소드
	public void setVolume(int volume) {
		if ( volume < MIN_VOULME) {
			System.out.println("최소 TV 볼륨은 0입니다.");
			this.volume = MIN_VOULME;
		} else if ( volume > MAX_VOULME) {
			System.out.println("최대 TV 볼륨은 10입니다.");
			this.volume = MAX_VOULME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 TV 볼륨은"+ volume +"입니다.");
	}
	
}
