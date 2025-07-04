package chapter04.loop;

import java.util.Scanner;

public class C035_dowhile {

	public static void main(String[] args) {
		// do-while
		// 입력하는 값들의 합 구하기
		Scanner scan = new Scanner(System.in);
		int num;
		int sum = 0;
		
//		System.out.print("숫자를 입력하세요(끝낼 때 0): ");
//		num = scan.nextInt();
//		while (num != 0) {
//			System.out.print("숫자를 입력하세요(끝낼 때 0): ");
//			num = scan.nextInt();
//			sum = sum + num;
//		}
		
		do {
			System.out.print("숫자를 입력하세요(끝낼 때 0): ");
			num = scan.nextInt();
			sum = sum + num;
		} while (num != 0);
		
		System.out.println("합계: " + sum);

	}

}
