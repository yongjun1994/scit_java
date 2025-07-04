package chapter06.class_part1;

class Test1 {
	// 멤버 변수, 인스턴스 변수
	private String name1 = "홍길동";
	// 멤버 변수, 정적 변수(클래스 변수)
	public static final String name2 = "고길동";
	
	// 멤버 메서드
	public void printName() {
		System.out.println(this.name1);
	}
}

public class C052_static1 {

	public static void main(String[] args) {
		Test1 ex = new Test1();
//		System.out.println( ex.name1 );	//err
		ex.printName();
		System.out.println( ex.name2 );
		
		// 정적 멤버 변수는 인스턴스의 생성없이 클래스의 이름으로 호출 가능
		System.out.println( Test1.name2 );
		
	}

}
