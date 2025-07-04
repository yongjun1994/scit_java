package chapter10.interface_part;

// 도적 (Thief) 클래스
public class Thief extends Novice implements Skill {

	private String job; // 직업 이름

	// 생성자
	public Thief(String name, int strength, int dexterity, int intelligence) {
		super(name, strength, dexterity, intelligence);
		this.job = "도적"; // 직업 설정
	}

	// 공격 메소드 오버라이딩
	@Override
	public void attack() {
		System.out.println(getName() + "이(가) 단검으로 빠르게 공격합니다! (민첩: " + getDexterity() + ")");
	}

	// 스킬 메소드 오버라이딩
	@Override
	public void skill() {
		System.out.println(getName() + "이(가) 그림자 베기 스킬을 사용합니다! (민첩 ×2)");
	}

	// 직업명 getter
	public String getJob() {
		return job;
	}
}
