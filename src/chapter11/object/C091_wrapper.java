package chapter11.object;

public class C091_wrapper {

	public static void main(String[] args) {
		
		/*
		 * 	기본형 		Wrapper클래스
		 * 	boolean		Boolean
		 * 	byte		Byte
		 * 	char		Character
		 * 	short		Short
		 * 	int 		Integer
		 * 	long		Long
		 * 	float		Float
		 * 	double		Double
		 */
		
		// 1. Boxing (기본형 > Wrapper) : valueOf 사용
		int i = 1234;
//		Integer wrapint = new Integer(i); // 옛날 방식, 권장 안함
		Integer wrapInt = Integer.valueOf(i); // valueOf()메서드 사용(권장 방식)
		String str = wrapInt.toString();
		System.out.println(str);
		
		// 2. 문자열 > int 변환
		String a = "56", b = "78";
		System.out.println( a + b );
		System.out.println(Integer.parseInt(a)
				+ Integer.parseInt(b));
		
		// 3. Unboxing (Wrapper > 기본형)
		Integer wrapInt2 = Integer.valueOf(629);
		int j = wrapInt2;	// 오토언박싱
		System.out.println(j);
		
		Double wrapDouble = Double.valueOf(3.14);
		double d1 = wrapDouble;	// 오토언박싱
		// 직접 언박싱 후 형 변환
		int d2 = wrapDouble.intValue();
		System.out.println(d1);
		System.out.println(d2);
		
		// 4. Autoboxing
		Integer c = 3;	// 오토박싱
		Integer d = 4;	// 오토박싱
		int e = c + d;	// 오토언박싱 + 연산
		System.out.println(e);
		System.out.println(c instanceof Integer);
		
		Integer f = 12;
		f++;
		System.out.println(f);
		System.out.println(f instanceof Integer);
		
		System.out.printf("int 타입크기=%d, 최소값=%d, 최대값=%d"
				, Integer.SIZE, Integer.MIN_VALUE, Integer.MAX_VALUE);
		System.out.printf("short 타입크기=%d, 최소값=%d, 최대값=%d"
				, Short.SIZE, Short.MIN_VALUE, Short.MAX_VALUE);
		System.out.printf("long 타입크기=%d, 최소값=%d, 최대값=%d"
				, Long.SIZE, Long.MIN_VALUE, Long.MAX_VALUE);
	}
}
