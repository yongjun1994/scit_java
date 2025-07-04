package chapter07.array;

public class C060_twoDimension_array1 {

	public static void main(String[] args) {
		int[][] score = {
			{ 77, 56, 70, 82 },
			{ 99, 96, 89, 88 },
			{ 81, 69, 62, 80 }
		};
		
		for (int i = 0; i < score.length; i++) {
			System.out.print((i + 1) + "번 학생의 성적: ");
			for (int j = 0; j < 4; j++) {
				System.out.print(score[i][j] + " ");
			}
			System.out.println();
		}
		

	}

}
