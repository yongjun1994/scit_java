package chapter10.interface_part;

// 기사 (Knight) 클래스
public class Knight extends Novice implements Skill {

    private String job; // 직업 이름

    // 생성자
    public Knight(String name, int strength, int dexterity, int intelligence) {
        super(name, strength, dexterity, intelligence);
        this.job = "기사"; // 전직할 때 직업 설정
    }

    // 공격 메소드 오버라이딩
    @Override
    public void attack() {
        System.out.println(getName() + "이(가) 검으로 공격합니다! (힘: " + getStrength() + ")");
    }

    // 스킬 메소드 오버라이딩
    @Override
    public void skill() {
        System.out.println(getName() + "이(가) 강력한 베기 스킬을 사용합니다! (힘 ×2)");
    }

    // 직업명 getter
    public String getJob() {
        return job;
    }
}
