package chapter04.loop;

import java.util.Scanner;

public class Loop_Example08 {

	public static void main(String[] args) {
/*
		1번				  2번
		    *		      *********
		   ***		 	   *******
		  *****	            *****
		 *******             ***
		*********             *
		
 		3번 피라미드의 높이를 입력을 받아 다음과 같이 출력하세요
 		1		2		3			4				5
 		*	    *		*			*				*
 			   ***     * *         * *             * *
 			          *****       *   *			  *   *
 			                     *******         *     *
 			                                    *********
 */
		//1-1
		for (int i = 1; i <= 5; i++) {
			for (int j = 0; j < 5-i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < 2*i-1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//1-2
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j < 5 + i; j++) {
                if (j <= 5 - i)		// 공백 출력
                    System.out.print(" ");
                else				// 별 출력
                    System.out.print("*");
            }
            System.out.println();
        }
		
		//1-3
        for (int i = 1; i <= 5; i++) {
            // 공백과 별을 포매팅해서 출력
            String spaces = " ".repeat(5 - i);
            String stars = "*".repeat(2 * i - 1);
            System.out.println(spaces + stars);
        }
		System.out.println("==========");
		
		//2-1
		for (int i = 5; i >= 1; i--) {
			for (int j = 5-i; j > 0; j--) {
				System.out.print(" ");
			}
			for (int k = 2*i-1; k > 0; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//2-2
		for (int i = 5; i >= 1; i--) {
            for (int j = 1; j < 5 + i; j++) {
                if (j <= 5 - i)		// 공백 출력
                    System.out.print(" ");
                else				// 별 출력
                    System.out.print("*");
            }
            System.out.println();
        }
		
		//2-3
		for (int i = 5; i >= 1; i--) {
            // 공백과 별을 포매팅해서 출력
            String spaces = " ".repeat(5 - i);
            String stars = "*".repeat(2 * i - 1);
            System.out.println(spaces + stars);
        }
		System.out.println("==========");
		
		//3번
		Scanner scan = new Scanner(System.in);
		
		System.out.print("높이: ");
		int rows = scan.nextInt(); // 피라미드의 높이

        for (int i = 1; i <= rows; i++) {
            // 공백 출력
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            // 첫 번째 줄 또는 마지막 줄은 전체 별로 출력
            if (i == rows) {
                for (int k = 1; k <= 2 * i - 1; k++) {
                    System.out.print("*");
                }
            } else {
                // 그 외에는 첫 번째와 마지막 별만 출력하고 나머지는 공백으로 채움
                for (int k = 1; k <= 2 * i - 1; k++) {
                    if (k == 1 || k == 2 * i - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            // 줄바꿈
            System.out.println();
        }
	}

}
