package chapter01.data;

public class C012_ImplicitConversion {

	public static void main(String[] args) {
		// 형 변환(작 > 큰 .. 자동 형변환 or 묵시적 형변환)
		byte bNum = 10;
		int iNum = bNum;
		
		System.out.println(bNum);
		System.out.println(iNum);
		
		int iNum2 = 20;
		float fNum = iNum2;
		
		System.out.println(iNum2);
		System.out.println(fNum);

	}

}
