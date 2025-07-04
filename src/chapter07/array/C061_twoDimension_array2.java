package chapter07.array;

public class C061_twoDimension_array2 {

	public static void main(String[] args) {
		int[][] score = {
			{ 77, 56, 70, 82 },
			{ 99, 96, 89, 88 },
			{ 81, 69, 62, 80 }
		};
		
		int classSum = 0;
		for (int i = 0; i < score.length; i++) {
			int sum = 0;
			for (int j = 0; j < score[0].length; j++) {
				sum += score[i][j];
			}
			System.out.println((i + 1) + "반 > 총점: "
					+ sum + ", 평균: " 
					+ (float) sum / score[0].length);
			classSum += sum;
		}
		System.out.println("학급 전체 평균: "
				+ (float) classSum / 
				(score.length * score[0].length));

	}

}
