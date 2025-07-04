package chapter01.data;

public class C009_Precision {
	public static void main(String[] args) {
		// 정밀도
		// 제한된 메모리로 수치를 표현하므로 수학의 실수와 완전히 같지 않음
		// 표현 가능한 수의 크기의 제한, 유효 자릿수 한계
		float value = 5.123456789f;		//약 7자리
		System.out.println(value);
		double value2 = 12345.123456789; //약 15자리
		System.out.println(value2);
		double pi = 3.141592132412412432424;
		System.out.println(pi);

	}

}
