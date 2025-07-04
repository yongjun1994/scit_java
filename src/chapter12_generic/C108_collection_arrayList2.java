package chapter12_generic;

import java.util.ArrayList;
import java.util.Arrays;

public class C108_collection_arrayList2 {

	public static void main(String[] args) {
		// Arrays는 배열을 좀더 수월하게 사용하기 위해서 utility list제공 클래스
		ArrayList<Integer> arNum = 
				new ArrayList<>(Arrays.asList(1, 2, 3));
		ArrayList<Integer> arNum2 = 
				new ArrayList<>(Arrays.asList(4, 5, 2));

		// addAll - 합집합
		System.out.print("합집합 => ");
		ArrayList<Integer> arNumAdd = new ArrayList<>(arNum);
		arNumAdd.addAll(arNum2);
		for (Integer i : arNumAdd) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		// removeAll - 차집합
		System.out.print("차집합 => ");
		ArrayList<Integer> arNumRemove = new ArrayList<>(arNum);
		arNumRemove.removeAll(arNum2);
		for (Integer i : arNumRemove) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		// retainAll - 교집합
		ArrayList<Integer> arNumRetain = new ArrayList<>(arNum);
		arNumRetain.retainAll(arNum2);
		System.out.print("교집합 => ");
		for (Integer i : arNumRetain) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		// containAll - 부분집합
		System.out.print("부분집합 => ");
		ArrayList<Integer> arNumContain = new ArrayList<>(arNum);
		if (arNumContain.containsAll(arNum2)) {
			System.out.println("부분집합");
		} else {
			System.out.println("부분집합 아님");
		}
		
	}

}
