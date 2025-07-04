package chapter12_generic;

import java.util.ArrayList;

public class C100_generic2 {

	public static void main(String[] args) {
		
		ArrayList arNum = new ArrayList();
		arNum.add(1);
		arNum.add("문자열");
		
		int value = (int) arNum.get(0);
		System.out.println(value);
//		int temp = (int) arNum.get(1);	// err
		
		ArrayList<Integer> arNum2 = new ArrayList<>();
		arNum2.add(1);
//		arNum2.add("문자열"); // err
		int value2 = arNum2.get(0);
		System.out.println(value2);
		
	}
}
