package chapter06.class_part1;

public class Class_Example01 {

	public static void main(String[] args) {
		// 인스턴스 생성 및 메서드 호출
		Character c1 = new Character("감자", "평민");
		c1.skill();
		c1.info();
		
		Character c2 = new Character("고구마", "마법사"
							, 2, 3, 3, 10);
		c2.skill();
		c2.info();
		
		System.out.println("================");
		
		// printf 출력 서식
		int i = 123;
		double d = 3.14;
		String str4 = "문자열";
		System.out.printf("i=%d, d=%f, str=%s \n"
				, i, d, str4);
//		System.out.printf("i=%d, d=%f, str=%s \n"
//				, str4, i, d);	//err
		
		//인덱스 지정자: 포맷지정자 앞에 위치하며 출력할 값의 순서를 지정하는데 사용
		System.out.printf("i=%3$d, d=%2$f, str=%1$s  \n"
				, str4, d, i);
		System.out.printf("정수= %1$d, i= %1$d  \n"
				, i, 1000);
		
		d = 3.14159265;
		System.out.printf("__%d__\n"   , i);
		System.out.printf("__%5d__\n"  , i); //5자리
		System.out.printf("__%-5d__\n" , i); //5자리인데 왼쪽부터
		System.out.printf("__%05d__\n" , i); //5자리인데 빈자리는 0 출력
		System.out.printf("__%6.2f__\n", d); //소수점 포함한 6자리에 소수부는 2자리까지
		System.out.printf("__%8.4f__\n", d); //소수점 포함한 8자리에 소수부는 4자리까지
		
		
	}

}
