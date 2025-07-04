package chapter07.array;

public class C064_enhancedForLoop2 {

	public static void main(String[] args) {
		int[][] score = {
			{ 77, 56, 70, 82 },
			{ 87, 23, 14, 23 },
			{ 44, 24, 75, 89 }
		};
		for (int[] student : score) {
			for (int subject : student) {
				System.out.print(subject + " ");
			}
			System.out.println();
		}

	}

}
