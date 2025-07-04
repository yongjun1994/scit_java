package chapter06.class_part1;

/*
	싱글턴 패턴
	단 하나의 인스턴스만 생성되도록 보장하는 디자인 패턴
	
	장점
	  자원의 절약: 동일한 객체를 공유하므로 객체를 여러번 생성하지 않아도 됨
	  전역 상태 관리: 프로그램의 여러 부분에서 동일한 상태를 유지하고자 할 때 유용
	단점
	  유연성 저하: 객체의 생성을 제한하기 떄문에 확장성이나 유연성 저하
	  멀티스레드 환경에서 문제 발생 가능:
	  		여러 스레드가 동시에 접근할 경우 인스턴스가 두 번
	  		생성 되는 문제를 방지하기 위해 동기화가 필요
 */
class Singleton {
	private static Singleton instance;
	private Singleton() {
		System.out.println("생성자 호출");
	}
	public static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
	public void printMethod() {
		System.out.println("인스턴스로부터 메서드 호출");
	}
}

public class C055_SingletonPattern {

	public static void main(String[] args) {
//		Singleton s = new Singleton();	//err
		
		Singleton s1 = Singleton.getInstance();
		s1.printMethod();
		
		Singleton s2 = Singleton.getInstance();
		s2.printMethod();
		
		System.out.println( s1 == s2 );
		
		

	}

}
