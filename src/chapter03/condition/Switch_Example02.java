package chapter03.condition;

import java.util.Scanner;

public class Switch_Example02 {

	public static void main(String[] args) {
/*
		사칙연산 계산기
		정수 2개와 연산자(+, -, *, /)를 입력받아 결과를 출력한다.
		단, 나눗셈 연산시 분모가 0일 경우 "0으로 나눌 수 없습니다"를 출력한다.
		출력 결과 :
			연산자 (+, -, *, /): /		연산자 (+, -, *, /): +
			정수1 입력: 3				정수1 입력: 3
			정수2 입력: 0				정수2 입력: 10
			0으로 나눌 수 없습니다.		결과: 13
 */

		Scanner scan = new Scanner(System.in);
		
		System.out.print("(+, -, *, /) :");
		String op = scan.next();
		System.out.print("정수1: ");
		int a = scan.nextInt();
		System.out.print("정수2: ");
		int b = scan.nextInt();
		
		double result = 0;
		switch (op) {
			case "+": result = a + b;		break;
			case "-": result = a - b;		break;
			case "*": result = a * b;		break;
			case "/":
				if (b == 0) {
					System.out.println("0으로 나눌 수 없습니다.");
					System.exit(0);
				}
				result = a / b;
				break;
			default: System.out.println("잘못 입력했습니다.");
		}
		System.out.println("결과: " + result);
		
		
		
		
	}

}
