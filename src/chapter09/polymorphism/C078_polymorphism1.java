package chapter09.polymorphism;

class Animal {
	void move() { System.out.println("동물이 움직입니다."); }
}

class Human extends Animal {
	void move() { System.out.println("사람이 두 발로 걷습니다."); };
}

class Tiger extends Animal {
	void move() { System.out.println("호랑이가 네발로 뜁니다.");}
}

class Eagle extends Animal {
	void move() { System.out.println("독수리가 하늘을 납니다."); }
}

class Cat extends Animal {
	void move() { System.out.println("고양이가 네발로 걷습니다."); }
}

public class C078_polymorphism1 {
	public static void main(String[] args) {
		
		Animal a = new Animal();
		Animal b = new Human();
		Animal c = new Tiger();
		Animal d = new Eagle();
		a.move();
		b.move();
		c.move();
		d.move();

		
		moveMethod(a);
		moveMethod(b);
		moveMethod(c);
		moveMethod(d);
	}
	
	public static void moveMethod(Animal animal) {
		animal.move();
	}
//	public static void moveMethod(Human human) {
//		human.move();
//	}
//	public static void moveMethod(Tiger tiger) {
//		tiger.move();
//	}
//	public static void moveMethod(Eagle eagle) {
//		eagle.move();
//	}

}
