package chapter07.array;

public class C058_array3 {

	public static void main(String[] args) {
		// 간편한 초기화
		int[] score = { 88, 99, 70, 55, 100 };
		for (int i = 0; i < score.length; i++) {
			System.out.print(score[i] + " ");
		}
		System.out.println();
		
		// 재할당
		score = new int[] {1,2,3,4,5,6,7,8,9};
		for (int i = 0; i < score.length; i++) {
			System.out.print(score[i] + " ");
		}
	}

}
