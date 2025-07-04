package chapter04.loop;

public class Loop_Example07 {

	public static void main(String[] args) {
/*
		3번			4번
		    *		*****
		   **		 ****
		  ***		  ***
		 ****		   **
		*****			*
*/
		//3-1
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5-i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//3-2
		for (int i = 4; i >= 0; i--) {
			for (int j = 0; j < 5; j++) {
				if (j < i)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println();
		}
		
		//3-3
		for (int i = 1; i <= 5; i++) {
			System.out.print(" ".repeat(5-i));
			System.out.println("*".repeat(i));
		}
		
/*		
		printf 출력 서식
		%b : boolean 형식으로 출력 
		%d : 정수 형식으로 출력
		%f : 소수점 형식으로 출력
		%c : 문자형식으로 출력 
		%s : 문자열 형식으로 출력
*/
		//3-4
		for (int i = 1; i <= 5; i++) {
			System.out.printf("%5s%n"
					, "*".repeat(i));
		}
		
		System.out.println("=========");
		//4-1
		for (int i = 5; i >= 1; i--) {
			for (int j = 1; j <= 5-i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//4-2
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j < i)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println();
		}
		
		//4-3
		for (int i = 5; i >= 1; i--) {
			System.out.print(" ".repeat(5-i));
			System.out.println("*".repeat(i));
		}
		
		//4-4
		for (int i = 5; i >= 1; i--) {
			System.out.printf("%5s%n"
					, "*".repeat(i));
		}
		

	}

}
