package chapter08.inheritance;

// 부모 클래스, 상위 클래스, 슈퍼 클래스
class A {
	String name;
	private int age;
	
	public void method() {
		System.out.println("부모 메서드");
		System.out.println(name + " 입니다.");
	}
}
// 자식 클래스, 하위 클래스, 서브 클래스
class B extends A {
	
	@Override
	public void method() {
		System.out.println("자식 메서드");
		System.out.println(name + " 입니다.");
	}
}


public class C071_inheritance {
	public static void main(String[] args) {

		A a = new A();
		a.name = "홍길동";
		a.method();
		
		B b = new B();
		b.name = "이순신";
		b.method();
		
	}
}
