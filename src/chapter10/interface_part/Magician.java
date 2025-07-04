package chapter10.interface_part;

// 마법사 (Magician) 클래스
public class Magician extends Novice implements Skill {

    private String job; // 직업 이름

    // 생성자
    public Magician(String name, int strength, int dexterity, int intelligence) {
        super(name, strength, dexterity, intelligence);
        this.job = "마법사"; // 전직시 직업 설정
    }

    // 공격 메소드 오버라이딩
    @Override
    public void attack() {
        System.out.println(getName() + "이(가) 마법 공격을 합니다! (지능: " + getIntelligence() + ")");
    }

    // 스킬 메소드 오버라이딩
    @Override
    public void skill() {
        System.out.println(getName() + "이(가) 파이어볼 스킬을 사용합니다! (지능 ×2)");
    }

    // 직업명 getter
    public String getJob() {
        return job;
    }
}
