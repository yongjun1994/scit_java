package chapter06.class_part1;

public class C047_constructor2 {

	public static void main(String[] args) {
		Time t = new Time();
		t.whatTime();
		
		Time t2 = new Time(18, 30);
		t2.whatTime();
		
		Time t3 = new Time(true, 12, 34);
		t3.whatTime();
		
		Time t4 = new Time(true, 10, 12, 34);
		t4.whatTime();
	}

}
