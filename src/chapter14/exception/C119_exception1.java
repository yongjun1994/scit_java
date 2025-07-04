package chapter14.exception;

public class C119_exception1 {

	public static void main(String[] args) {
		/*
		 * 	예외처리(Exception Handling)이란
		 * 		프로그램 실행 시 발생할 수 있는 예외의 발생에 대비한 코드를 자성하는 것
		 * 		프로그램의 비정장 종료를 막고, 정상적인 실행상태를 유지하는 것
		 * 
		 * 	프로그램 오류
		 * 		1. 컴파일 에러(compile-time error)
		 * 			컴파일 할 때 발생하는 에러
		 * 		2. 런타임 에러(runtime error)
		 * 			실행 할 때 발생하는 에러
		 * 		3. 논리적 에러(logical error)
		 * 			작성 의도와 다른 결과 동작
		 */

		int a, b, c;
		a = 2;
		b = 0;
//		c = a / b;
//		System.out.println("c = " + c);
		
//		if (b != 0) {
//			c = a / b;
//			System.out.println("c = " + c);
//		} else {
//			System.out.println("0으로 나눌 수 없습니다.");
//		}
		
		try {
			c = a / b; // 이 시점에서 ArithmeticException 발생함
			System.out.println("c = " + c);
		} catch (Exception e) {
			System.out.println("0으로 나눌 수 없습니다.");
			e.printStackTrace();
		}
		
		System.out.println("프로그램 실행 완료");
	}

}
