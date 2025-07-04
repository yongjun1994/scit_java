package chapter14.exception;

public class C122_throw1 {

	public static void main(String[] args) {
//		String name = "빌게이츠";
		String name = null;
		printLength(name);
	}

	private static void printLength(String name) {
		try {
			System.out.println(name.length());
		} catch (NullPointerException e) {
			System.out.println("이름이 무효합니다.");
		}
		
	}
	
	

}
