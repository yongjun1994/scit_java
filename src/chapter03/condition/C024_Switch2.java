package chapter03.condition;

public class C024_Switch2 {

	public static void main(String[] args) {
		// 병합 처리
		int days;
		int month = 5;
		
		switch (month) {
			case 2:
				days = 28;
				break;
			case 4: case 6: case 9: case 11:
				days = 30;
				break;
			default:
				days = 31;
				break;
		}
		System.out.println(month + "월은 " + days + "일까지");

	}

}
