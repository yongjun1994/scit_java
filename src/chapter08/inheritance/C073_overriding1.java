package chapter08.inheritance;

/*
	메서드 오버라이딩 조건
	1. 상속관계에서만 가능
	2. 부모가 가지고 있는 메서드의 파라미터의 타입, 개수, 순서가 동일해야 하고,
	   메서드의 이름도 동일해야하고, 리턴타입도 동일해야 함
	3. 부모 <= 자식 범위의 접근제어자를 사용해야 함
 */
public class C073_overriding1 {
	public static void main(String[] args) {

		class A {
			int num = 10;
			public void methodA() {
				System.out.println("A : " + num);
			}
		}
		
		class B extends A {
			int num = 100;
			@Override
			public void methodA() {
				System.out.println("B : " + this.num);
			}
		}
		
		// 다형적 변수
		A a = new A();
		A b = new B();
		B c = new B();
		
		// 멤버변수는 데이터 참조 타입에 따라 값이 결정
		// 메서드는 생성 타입에 따라 호출이 결정
		System.out.println(a.num);
		System.out.println(b.num);
		System.out.println(c.num);
		
		a.methodA();
		b.methodA();
		c.methodA();
		
		
		
	}
}
