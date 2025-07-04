package chapter13.collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.TreeSet;

public class C110_collection_linkedList1 {

	public static void main(String[] args) {
		LinkedList<String> arName = new LinkedList<>();
		arName.add("윤봉길");
		arName.add("이순신");
		arName.add("안창호");
		arName.add(1, "노무현");

		for (String s : arName) {
			System.out.println(s);
		}

/*
 * 		Iterator
 * 			컬렉션 안에 있는 요소들을 하나씩 순차적으로 꺼내기 위해 만들어진 객체
 * 			컬렉션 안을 탐색하는 방법을 표준화한 객체
 * 		장점
 * 			컬렉션 구조에 상관없이 일관된 접근 방법 제공
 * 			ArrayList, LinkedList, HashSet 등...
 * 		메서드
 * 			hasNext() : 다음에 읽을 요소가 있는지 확인
 * 						다음 요소가 있으면 true, 없으면 false
 * 			next()	  : Iterator의 현재 위치에서 커서를 다음 요소로 이동하고,
 * 						그 요소를 리턴
 * 			remove() :  현재 커서 위치의 요소를 삭제
 */
		// Iterator 반복자
		System.out.println("========");
		Iterator<String> it = arName.iterator();
		
		while (it.hasNext()) {	// 다음 요소가 있는지 확인
			System.out.println(it.next());
		}
		
		// ListIterator 양방향 이동 가능
		System.out.println("=========");
		// listIterator(index) 메서드는 index 위치에서부터 탐색을 시작
		// 하는 ListIterator 객체를 리턴
		ListIterator<String> it2 = 
				arName.listIterator(arName.size());
		while (it2.hasPrevious()) {	// 이전 요소가 있는지 체크
			System.out.println(it2.previous());
		}
		
	}

}
