package chapter08.inheritance;

public class C075_final {

	public static void main(String[] args) {
/*
		final
		  - final 변수 : 상수, 값 변경 불가
		  - final 메서드 : Override 불가
		  - final 클래스 : 상속 불가
 */
		// 다형적 변수
		AA aa = new AA();
		AA ab = new BB();
		BB bb = new BB();
		
		System.out.println(aa.PI);
		System.out.println(ab.PI);
		System.out.println(bb.PI);
//		aa.PI = 1231432.23425;	//err
		
		aa.method();
		aa.finalMethod();
		ab.method();
		ab.finalMethod();
		bb.method();
		bb.finalMethod();
		
	}
}

class AA {
	final static double PI = 3.14;
	
	void method() {
		System.out.println("method");
	}
	
	final void finalMethod() {
		System.out.println("final Method");
	}
}

final class BB extends AA {
	@Override
	void method() {
		System.out.println("method BB");
	}
	
//	@Override
//	final void finalMethod() {	//err
//		System.out.println("final Method BB");
//	}
}

//class CC extends BB{	//err
//	
//}



