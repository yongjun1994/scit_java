package chapter09.polymorphism;

class Dog extends Animal {
	void bark() { System.out.println("멍멍"); }
}

class Dove extends Animal {
	void fly() { System.out.println("퍼득"); }
}

public class C080_instanceof {
	public static void main(String[] args) {
		Dog a = new Dog();
		a.move();
		a.bark();
		
		Animal b = new Dog();
		b.move();
//		b.bark();	// Animal 클래스에서는 bark() 메서드 만들지 않음
		
		Animal c = new Dove();
		c.move();
		
		testAnimal(b);
		testAnimal(c);
	}
	
	static void testAnimal(Animal animal) {
		animal.move();
		
//		Dog mydog = (Dog) animal;
//		mydog.bark();
		
		if ( animal instanceof Dog ) {
			Dog mydog = (Dog) animal;
			mydog.bark();
		}
		if ( animal instanceof Dove ) {
			Dove mydove = (Dove) animal;
			mydove.fly();
		}
		
		// 패턴 매칭
		if ( animal instanceof Dog mydog ) {
			mydog.bark();
		}
		if ( animal instanceof Dove mydove ) {
			mydove.fly();
		}
	}

}
