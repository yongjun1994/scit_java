package chapter00.basic;

import java.util.Scanner;

public class Basic_Example01 {

	public static void main(String[] args) {
		//스캐너 클래스를 불러오기 & 객체 생성
		Scanner scan = new Scanner(System.in);
		
		//정수 입력 받을 변수 초기화
		int num = 0;
		System.out.println("정수를 입력해 주세요: ");
		num = scan.nextInt();
		System.out.println("입력한 정수: " + num);
		//문자열 이어붙이기( 문자열 + 문자열 or 변수 or 값 )
		
		//실수 입력 받을 변수 초기화
		double dNum = 0;
		System.out.println("실수를 입력해 주세요: ");
		dNum = scan.nextDouble();
		System.out.println("입력한 실수: " + dNum);
		
		//문자열
		String text = "";
		System.out.println("문자열을 입력해 주세요:");
		text = scan.next();
		System.out.println("입력한 문자열: " + text);
		
	}

}
