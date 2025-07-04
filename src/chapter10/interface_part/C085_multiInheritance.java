package chapter10.interface_part;

class HandPhone {
	void call() { System.out.println("전화를 건다"); }
	void receive() { System.out.println("전화를 받는다"); }
}
interface Camera { void takepicture(); }
interface Game { void playGame(); }
class HandPhoneGameCamera extends HandPhone
	implements Camera, Game {
	@Override
	public void playGame() {
		System.out.println("찰칵. 사진을 찍는다.");
		
	}
	@Override
	public void takepicture() {
		System.out.println("게임을 실행한다.");
		
	}
	
}
public class C085_multiInheritance {
	public static void main(String[] args) {
		HandPhoneGameCamera myphone = new HandPhoneGameCamera();
		
		myphone.call();
		myphone.receive();
		myphone.playGame();
		myphone.takepicture();

	}
}

interface A {}
interface B {}
class C {}
class D extends C implements A, B {}
interface E extends A, B {}

