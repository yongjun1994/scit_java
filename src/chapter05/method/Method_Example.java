package chapter05.method;

import java.util.Scanner;

public class Method_Example {

	public static void main(String[] args) {
		// 전체 구구단을 출력하는 메서드를 만들어 보기
//		method();
		
		Scanner scan = new Scanner(System.in);
		System.out.print("단: ");
		int num = scan.nextInt();
		methodEx();		//전체 구구단 출력
//		methodEx(num);	//특정 단 출력
	}
	
	public static void methodEx() {
		for (int i = 2; i <= 9; i++) {
			System.out.println("* [" + i + "] 단");
			methodEx(i);
			System.out.println();
		}
	}
	public static void methodEx(int number) {
		for (int i = 1; i <= 9; i++) {
			System.out.println(number + " x " + i
					+ " = " + number * i);
		}
	}
	
	
	
	public static void method() {
		for (int i = 2; i <= 9; i++) {
			System.out.println("* [" + i + "] 단");
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + " x " + j
						+ " = " + i * j);
			}
			System.out.println();
		}
	}

}
