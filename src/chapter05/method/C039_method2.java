package chapter05.method;

public class C039_method2 {

	public static void main(String[] args) {
		// 메서드 호출부
		method01();
		String result = method02();
		System.out.println(result);
		method03(100);
		System.out.println( method04(1, 2) );
	}
	
	/*
		메서드 정의부 (생성)
		접근지정자 키워드 [리턴타입] 메서드명 (파라미터타입 변수명1, ...)
		{
			명령어..
			return [값];
		}
	 */
	
	//1. 데이터를 받아오지도 데이터를 반환하지도 않는 메서드
	//파라미터X, 반환값X
	//void > 반환할게 없으면 반환하지 않겠다라는 의미로 void라는 명시적 표현
	public static void method01(   ) {
		System.out.println("단순 명령어 실행,"
				+ "아무 값도 받아오지 않았고, "
				+ "println만 실행할뿐 어떤 값도 반환하지 않는다.");
		return;
	}
	
	//2. 데이터를 받아오지는 않지만 데이터를 반환하는 메서드
	//파라미터X, 반환값O
	public static String method02(  ) {
		System.out.println("2번째 메서드 출력");
		String result = "반환값";
		return result;
	}
	
	//3. 데이터를 받아오지만 데이터를 반환하지는 않는 메서드
	//파라미터O, 반환값X
	public static void method03(int a) {
		System.out.println("받아온 파라미터 값은: "
				+ a + "이지만 받아만 왔을 뿐 반환하지 않음");
	}
	
	//4. 데이터를 받아오기도 데이터를 반환하기도 하는 메서드
	//파라미터O, 반환값O
	public static int method04(int a, int b) {
		int sum = a + b;
		return sum;
	}
	
	

}
