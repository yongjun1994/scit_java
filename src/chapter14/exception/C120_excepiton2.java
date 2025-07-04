package chapter14.exception;

public class C120_excepiton2 {

	public static void main(String[] args) {
		// 다중 예외 처리
		int a, b, c;
		a = 5;
		b = 0;
		int[] ar = {1,2,3,4,5};
		
		try {
			c = a / b;	// 1
			System.out.println("c = " + c);
			ar[5] = 100;	// 2
		} catch (ArithmeticException e) {
			System.out.println("0으로 나누기 예외 발생");
		} catch (ArrayIndexOutOfBoundsException e){
			System.out.println("첨자가 배열 범위를 넘어섰습니다.");
		} catch (Exception e) {
			// 예외가 발생했을 때 해당 예외가 발생한 위치와
			// 호출 스택의 흐름을 출력하는 데 사용되는 메서드
			e.printStackTrace();
			
			System.out.println("========");
			
			// 예외에 대한 상세 메시지를 반환
			System.out.println( e.getMessage());
		}
		
		System.out.println("프로그램 실행 완료");
	}

}
