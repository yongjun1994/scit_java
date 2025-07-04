package chapter04.loop;

public class Loop_Example06 {

	public static void main(String[] args) {
/*
		1번			2번
		*			*****
		**			****
		***			***
		****		**
		*****		*
 */
		//1-1
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//1-2
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (j <= i)
					System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("========");
		//2-1
		for (int i = 5; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int i = 5; i > 0; i--) {
			for (int j = 5; j > 0; j--) {
				if (j <= i)
					System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
