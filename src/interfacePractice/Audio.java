package interfacePractice;

public class Audio implements RemoteControl{
	    //구현클래스 생성
		//필드
		private int volume;
		
		//생성자
		//turnOn() 추상 메소드의 실체 메소드
		public void turnOn() {
			System.out.println("오디오를 켭니다.");
		}
		//turnOff() 추상메소드의 실체메소드
		public void turnOff() {
			System.out.println("오디오를 끕니다.");
		}
		//setVolume() 추상메소드의 실체메소드
		public void setVolume(int volume) { //인터페이스의 추상 메소드는 public이기 때문에 실체메소드는 public보다 접근범위가 낮을 수 없음.
			if ( volume < MIN_VOULME) {
				System.out.println("최소 오디오 볼륨은 0입니다.");
				this.volume = MIN_VOULME;
			} else if ( volume > MAX_VOULME) {
				System.out.println("최대 오디오 볼륨은 10입니다.");
				this.volume = MAX_VOULME;
			} else {
				this.volume = volume;
			}
			System.out.println("현재 오디오 볼륨은"+ volume +"입니다.");
		}
	
}
