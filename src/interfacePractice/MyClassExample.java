package interfacePractice;

public class MyClassExample {//�������̽��� ����ϴ� Ŭ������ ����
	public static void main(String[] args) {
		
		System.out.println("1)-------------------");
		MyClass myClass1 = new MyClass();
		myClass1.rc.turnOn();
		myClass1.rc.setVolume(7);
		myClass1.methodA();
		
		System.out.println("2)-------------------");
		MyClass myClass2 = new MyClass(new Audio());
		
		System.out.println("3)-------------------");
		MyClass myClass3 = new MyClass(new Audio());
		myClass3.methodB( new Television());
		
				
	}

}
