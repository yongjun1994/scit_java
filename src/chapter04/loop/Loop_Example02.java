package chapter04.loop;

import java.util.Scanner;

public class Loop_Example02 {

	public static void main(String[] args) {
/*
		정수 5개를 입력받아 그 합을 출력하시오
		출력 결과 :
			정수 입력: 1
			정수 입력: 2
			정수 입력: 3
			정수 입력: 4
			정수 입력: 5
			15
 */
		Scanner scan = new Scanner(System.in);
		
		int num;
		int sum = 0;
		for (int i = 10; i < 15; i++) {
			System.out.print("정수 입력: ");
			num = scan.nextInt();
			sum = sum + num;
		}
		System.out.println(sum);
		

	}

}
