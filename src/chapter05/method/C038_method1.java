package chapter05.method;

public class C038_method1 {

	public static void main(String[] args) {
		// 1~10 합
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum = sum + i;
		}
		System.out.println("1~10 = " + sum);
		//메서드 호출
		System.out.println("1~10 = " + calcSum(1, 10));
		System.out.println("15~100 = " + calcSum(15, 100));
	}
	
	//메서드 정의
	public static int calcSum(int from, int to) {
		int sum = 0;
		for (int i = from; i <= to; i++) {
			sum += i;
		}
		return sum;
	}
	

}
