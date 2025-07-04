package chapter12_generic;

import java.util.ArrayList;

// 다중타입 한정 (T extends Class A & interface B & interface C)
// 제네릭 클래스나 메서드에서 타입 파라미터에 대해 하나 이상의 타입을 요구할 수 있음
interface Readable {}
interface Closeable {}

class BoxType implements Readable, Closeable {}
class BoxType2 implements Readable {}

class Box<T extends Readable & Closeable> {
	ArrayList<T> list = new ArrayList<T>();
	
	public void add(T item) {
		list.add(item);
	}
}

public class C105_generic_range2 {

	public static void main(String[] args) {
		// 다중타입 한정 (& 사용)
		Box<BoxType> box = new Box<>();
//		Box<BoxType2> box2 = new Box2<>(); // err
		
		// 최상위 Object 클래스여도 할당 불가
//		Box<Object> box3 = new Box <>(); // err

	}

}
