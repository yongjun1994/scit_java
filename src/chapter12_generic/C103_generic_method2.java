package chapter12_generic;

class GenericTest<T, U> {
	// 클래스의 제네릭타입으로 운영되는 제네릭 메서드
	void method1(T t, U u) {
		System.out.println(t + ", " + u);
	}
	
	// 독립적인 제네릭타입으로 운영되는 제네릭 메서드
	<K, V> void method2(K k, V v) {
		System.out.println(k + ", " + v);
	}
}

public class C103_generic_method2 {

	public static void main(String[] args) {
		GenericTest<String, Integer> gt = new GenericTest<>();
		gt.method1("안녕", 123);
//		gt.method1(123, "안녕"); // err
		gt.method2(3.14, 999);
		
		// 명시적인 제네릭 타입을 통한 메서드 호출
		gt.<Integer, Long>method2(30, 200L);
		
	}

}
