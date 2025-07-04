package chapter13.collection;

import java.util.Set;
import java.util.TreeSet;

class Member 
	implements Comparable<Member> 
{
	String name;
	int age;
	
	public Member(String name, int age) {
		this.name= name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Member [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Member o) {
		return this.name.compareTo(o.name);
	}
}

public class C117_comparable {
	public static void main(String[] args) {
/*
		Comparable
		자신과 매개변수 객체를 비교
		compareTo(T o)
 */
		Set<Member> set = new TreeSet<>();
		set.add(new Member("홍길동", 20));
		set.add(new Member("강감찬", 50));
		set.add(new Member("이순신", 35));
		
		for (Member m : set) {
			System.out.println(m);
		}
	}

}
