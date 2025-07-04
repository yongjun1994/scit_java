package chapter14.exception;

// 사용자 정의 예외 클래스
class NegativeException extends Exception {
	
	NegativeException() {
		super("음수는 안되요");
	}
}

public class C125_user_exception {

	public static void main(String[] args) throws Exception {
		int sum = 0;

		try {
			sum = calcSum(-100);
			System.out.println(sum);
		} catch (NegativeException e) {
			e.printStackTrace();
		}
	}
	
	private static int calcSum(int to) 
			throws Exception{
		if (to < 0) {
			throw new NegativeException();
		}
		int sum = 0;
		for (int i = 1; i <= to; i++) {
			sum += i;
		}
		return sum;
	}

}
