package chapter07.array;

public class C059_array4 {

	public static void main(String[] args) {
		int[] score = { 88, 94, 72, 75, 23 };
		
		// 총점, 평균
		int sum = 0;
		for (int i = 0; i < score.length; i++) {
			sum = sum + score[i];
		}
		System.out.println("총점: " + sum);
		System.out.println("평균: " 
				+ (float) sum / score.length);
	}

}
