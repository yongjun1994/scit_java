package chapter00.basic;

import java.util.Scanner;

public class Basic_Example02 {

	public static void main(String[] args) {
/*
		이름, 나이, 키를 입력받아 출력하세요.
		입력
			이름 : 홍길동
			나이 : 20
			키 : 188.9
		출력결과
			이름은 홍길동이고 나이는 20세, 키는 188.9Cm입니다.
 */
		// 입력을 받기 위해 Scanner import 및 생성
		Scanner sc = new Scanner(System.in);
		String name = "";
		int age = 0;
//		double height = 0.0;
		
		System.out.println("이름: ");
		name = sc.next();
		System.out.println("나이: ");
		age = sc.nextInt();
		System.out.println("키: ");
		double height = sc.nextDouble();
		
		System.out.println(
				"이름은 " + name +
				"이고 나이는 " + age +
				"세, 키는 " + height +
				"Cm 입니다."
				);
	}
}
