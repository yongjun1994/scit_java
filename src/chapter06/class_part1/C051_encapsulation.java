package chapter06.class_part1;

/*
	멤버변수의 경우 보통 private 키워드를 사용하여 
	외부로부터의 직접적인 접근을 막고,
	getter / setter 라 부르는 멤버 메서드를 만들어 사용함으로써
	내부 데이터에 제한적 접근을 할 수 있게 합니다. 
 */

class Member {
	private String id;
	private String password;
	private String phoneNumber;
	
	public Member(String id, String password, String phoneNumber) {
		this.id = id;
		this.password = password;
		this.phoneNumber = phoneNumber;
	}

	// 회원 ID는 변경되지 않으므로 getter 만 존재(읽기 전용)
	public String getId() {
		return id;
	}
	// 회원 비밂번호는 변경만 가능하므로 setter만 존재
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public void memberInfo(String pwCheck) {
		if (this.password.equals(pwCheck)) {
			System.out.println("[ 회원 정보 ]");
			System.out.println(" *아이디 : " + this.id);
			System.out.println(" *전화번호: " 
								+ this.phoneNumber);
		}
	}
}


public class C051_encapsulation {

	public static void main(String[] args) {
		Member member = new Member("홍길동", "111", 
							"010-1111-2222");
//		member.id = "이순신";	//err
		System.out.println( member.getId() );
		System.out.println( member.getPhoneNumber() );
		member.memberInfo("111");
		
		
	}

}
