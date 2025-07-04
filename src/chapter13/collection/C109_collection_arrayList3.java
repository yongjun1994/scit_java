package chapter13.collection;

import java.util.ArrayList;

//record : 데이터 변경 불가능한 불변 객체 사용
record Student(String name, int stdNum) {}

public class C109_collection_arrayList3 {

	public static void main(String[] args) {
		ArrayList<Student> stList = new ArrayList<>();
		stList.add( new Student("홍길동", 20251001) );
		stList.add( new Student("이순신", 20251002) );
		stList.add( new Student("강감찬", 20251003) );
		
		for (int i = 0; i < stList.size(); i++) {
			String result = String.format("이름: %s, 학번: %s"
					, stList.get(i).name()
					, stList.get(i).stdNum());
			System.out.println(result);
		}
		
		for (Student s : stList) {
			System.out.println(s);
		}
	}

}
