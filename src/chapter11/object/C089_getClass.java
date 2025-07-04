package chapter11.object;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class C089_getClass {
	
	public static void main(String[] args) {
		Human kim = new Human(29, "김상형");
		
		// Class 클래스
		// 클래스 자체를 객체처럼 다룰 수 있게 해주는 클래스
		// 1. Object의 getClass() 이용
		// 어떤 클래스인지 찾아옴
		Class cls = kim.getClass();
		System.out.println("cls: " + cls.toString());
		
		// 2. 직접 class 파일 대입
		Class cls2 = Human.class;
		System.out.println("cls2: " + cls2.getName());
		
		// 3. 클래스 이름으로 가져오기
		Class cls3;
		try {
			cls3 = Class.forName("chapter11.object.Human");
			System.out.println("cls3: " + cls3.getName());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// 클래스의 이름을 반환
		System.out.println(kim.getClass().getName());
		
		// 슈퍼클래스의 Class 객체를 반환
		Object obj = cls.getSuperclass();
		System.out.println(obj instanceof Object);
		System.out.println(obj instanceof Human);
		System.out.println("슈퍼 클래스: "
				+ cls.getSuperclass().getName());
		
		// Human 클래스에 선언된 모든 멤버변수 목록 가져오기
		System.out.print("멤버 변수: ");
		Field[] fields = cls.getDeclaredFields();
		for (Field f : fields) {
			System.out.println(f.getName() + " ");
		}
		System.out.println();
		
		// Human 클래스에 선언된 모든 멤버베서드 목록 가져오기
		System.out.print("멤버 메서드: ");
		Method[] methods = cls.getDeclaredMethods();
		for (Method m : methods) {
			System.out.println(m.getName() + " ");
		}
	}
}
