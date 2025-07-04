package chapter02.operator;

import java.util.Scanner;

public class Oper_Example04 {

	public static void main(String[] args) {
/*
		정수 3개를 입력받아 각 변수(kor, eng, math)에 값을 넣고,
		총합(sum)과 평균(avg)을 출력하세요.
		평균값은 소수점을 포함한 점수로 출력하세요.
		hint. 평균에 소수점 구하기 -> 연산 중에 자동 형변환 참고.
		출력결과 :
			kor점수: 80
			eng점수: 75
			math점수: 35
			총합: 190 평균: 63.333333333333336		
 */
		Scanner scan = new Scanner(System.in);
		
		System.out.print("국어 점수: ");
		int kor = scan.nextInt();
		System.out.print("영어 점수: ");
		int eng = scan.nextInt();
		System.out.print("수학 점수: ");
		int math = scan.nextInt();
		
		int sum = kor + eng + math;
		double avg = sum / 3.0;
		
		System.out.println("총합: " + sum + ", 평균: " + avg);
	}

}
