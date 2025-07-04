package chapter01.data;

public class C006_DataType {

	public static void main(String[] args) {
/*
		[ 데이터 타입 ]
		1. 기본형 데이터타입
			- 정수형 : byte(1), short(2), int(4), long(8)
			- 실수형 : float(4), double(8)
			- 논리형 : boolean(1)
			- 문자형 : char(2)
		2. 참조형 데이터타입
			- 기본형 데이터타입이 아닌 모든 "객체"
				class, enum, array, interface ...
 */

		// 기본형 데이터타입
		byte a = 127;	//128 err
		short b = 12345;
		int c = 1234567890;
		long d = 123456789000L; // l or L
		char e = 'A';
		float f = 3.14F;	// f or F
		double g = 3.14;
		boolean h = true;	// true or false
		
		var v1 = 'B';
		var v2 = 123;
		
		String s = "안녕하세요";
		String n = null;
		
		System.out.println("byte   : " + a );
		System.out.println("short  : " + b );
		System.out.println("int    : " + c );
		System.out.println("long   : " + d );
		System.out.println("char   : " + e );
		System.out.println("float  : " + f );
		System.out.println("double : " + g );
		System.out.println("boolean: " + h );
		System.out.println("var1   : " + v1);
		System.out.println("var2   : " + v2);
		System.out.println("String : " + s );
		System.out.println("null   : " + n );
		
		// 문자형 타입의 정수화
		char alpha = 'A';
		System.out.println(alpha);
		System.out.println( (int) alpha );
		
		// 정수형 타입의 문자화
		int beta = 66;
		System.out.println(beta);
		System.out.println( (char) beta );
		
		System.out.println( (char) (alpha + 1) );
		System.out.println( (char) (beta + 1) );
		
	}

}
