package interfacePractice;

public class MyClass { //인터페이스를 사용하는 클래스 생성
	//필드
	RemoteControl rc = new Television();
	
	//생성자
	MyClass () {} // 매개변수 없는 경우
	
	MyClass (RemoteControl rc) { // 매개변수 있는 경우
		this.rc = rc;
		rc.turnOn();
		rc.setVolume(5);
		
	}
	
	//메소드
	void methodA() {
		RemoteControl rc = new Audio(); // 초기 필드는 Television 객체이지만, methodA 실행 시 Audio 객체로 변경됨
		rc.turnOn();
		rc.setVolume(5);
	}
	
	void methodB( RemoteControl rc) {
	//Television 객체가 매개변수로 들어옴
		rc.turnOn();
		rc.setVolume(5);
	}
	

}
