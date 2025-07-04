package chapter04.loop;

public class C030_for3 {
	
	

	public static void main(String[] args) {
/*
		* 지역변수 & 전역변수
		지역 변수(Local Variable)
			메서드, 생성자 또는 블럭 내에서 선언되고, 범위는 해당 블록 끝날때까지
			메서드가 종료되면 메모리에서 사라짐
			명시적인 초기화가 필요
		전역 변수(Global Variable)
			클래스 내부에 선언되고, 클래스의 모든 메서드에서 접근 가능
			객체가 존재하는 동안 계속 유지
			명시적으로 초기화되지 않으면 기본값으로 자동 초기화
 */
		int a = 10;
		System.out.println("main에서 a 출력: " + a);
		
		if (true) {
			int b = 20;
			System.out.println("if문에서 a 출력: " + a);
			System.out.println("if문에서 b 출력: " + b);
			for (int c = 0; c < 1; c++) {
				System.out.println("for문에서 a 출력: " + a);
				System.out.println("for문에서 b 출력: " + b);
				System.out.println("for문에서 c 출력: " + c);
			}
//			System.out.println(c);  //err
		}
		
//		System.out.println(b);	//err
		

	}

}
