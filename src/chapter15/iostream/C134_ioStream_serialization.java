package chapter15.iostream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

// Java에서 객체를 직렬화하려면, 해당 객체의 클래스가 java.io.Serializable 인터페이스를 구현해야 함.
class Person implements Serializable{
	/**
	 * 객체 고유 번호
	 * serialVersionUID는 직렬화된 클래스의 버전을 나타내는 고유한 ID
	 * 역직렬화 시 버전 호환성을 확인하는 데 사용. 클래스가 수정되면, serialVersionUID 값도 변경되어야 함.
	 * 동일한 serialVersionUID를 가진 클래스는 동일한 직렬화 버전을 가진다고 간주
	 */
	private static final long serialVersionUID = -5796917796117705757L;
	
	String name;
	String job;
//	transient String job;	// 직렬화 대상 제외 키워드(transient)
	
	public Person() {}
	
	public Person(String name, String job) {
		this.name = name;
		this.job = job;
	}
	
	public String toString() {
		return name + "," + job;
	}
}

public class C134_ioStream_serialization {

	public static void main(String[] args) throws ClassNotFoundException {
/*
	직렬화(serialization)
	
	데이터 직렬화 종류
	 - CSV, XML, JSON 직렬화
	 - Binary 직렬화
	 - Java 직렬화
	 
	개념
		직렬화 (Serialization): 객체를 바이트 스트림으로 변환하는 과정
		역직렬화 (Deserialization): 바이트 스트림을 다시 객체로 복원하는 과정
 */
		Person personAhn = new Person("안재용", "대표이사");
		Person personKim = new Person("김철수", "상무이사");
		
		//직렬화
		try(FileOutputStream fos = new FileOutputStream("serial.out");
			ObjectOutputStream oos = new ObjectOutputStream(fos)){
			oos.writeObject(personAhn);
			oos.writeObject(personKim);
		} catch(IOException e) {
			e.printStackTrace();
		}

		//역직렬화
		try(FileInputStream fis = new FileInputStream("serial.out");
			ObjectInputStream ois = new ObjectInputStream(fis)){
			Person p1 = (Person) ois.readObject();
			Person p2 = (Person) ois.readObject();
			
			System.out.println(p1);
			System.out.println(p2);
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

}
