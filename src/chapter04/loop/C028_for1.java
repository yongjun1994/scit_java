package chapter04.loop;

public class C028_for1 {

	public static void main(String[] args) {
		
		int num = 10;
		
		// for
		for (int i = 0; i <= 5; i++) {
			System.out.println(i + "번 학생 성적 처리");
			num = 20;
		}
		System.out.println(20);
//		System.out.println(i);	//err
		
		// 1~100 합
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
		
		// 1~100 짝수 합
		int sum2 = 0;
		for (int i = 0; i <= 100; i = i + 2) {
			sum2 = sum2 + i;
		}
		System.out.println(sum2);
		
		int sum3 = 0;
		for (int i = 0; i <= 100; i++) {
			if (i % 2 != 0)
				continue;
			sum3 = sum3 + i;
		}
		
		

	}

}
