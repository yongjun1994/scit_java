package chapter12_generic;

class Coffee {}
class Juice {}

class BeverageBox {
	private Object[] beverage;
	
	public BeverageBox(Object[] beverage) {
		this.beverage = beverage;
	}
	
	public Object getBeverage(int index) {
		return beverage[index];
	}
}

class BeverageBox2<T> {
	private T[] beverage;
	
//	static T t;  // static에서 사용 불가
	
	public BeverageBox2(T[] beverage) {
		this.beverage = beverage;
//		T t = new T(); // T타입 인스턴스 생성 불가
	}
	
	public T getBeverage(int index) {
		return beverage[index];
	}
}

public class C099_generic1 {

	public static void main(String[] args) {
		Coffee[] arr = {
				new Coffee(),
				new Coffee()
		};
		BeverageBox box = new BeverageBox(arr);
		
		Coffee coffee = (Coffee) box.getBeverage(0);
//		Juice juice   = (Juice)  box.getBeverage(1); // err
		
		// 제네릭 사용
		BeverageBox2<Coffee> box2 = new BeverageBox2<>(arr);
		
		Coffee coffee2 = box2.getBeverage(0);
//		Juice juice2 = box2.getBeverage(1); // 컴파일 시점에서 에러 발생시킴
		
	}

}
