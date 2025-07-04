package chapter10.interface_part;

import java.util.Random;
import java.util.Scanner;

public class GameMain_Method {

	private Scanner scan; // Scanner 객체
	private Novice character; // 현재 생성된 캐릭터 저장용

	// 생성자: Scanner를 받아오기
	public GameMain_Method(Scanner scan) {
		this.scan = scan;
	}

	public void printMenu() {
		System.out.println("===== ABCDE Game =====");
		System.out.println("1. 캐릭터 생성");
		System.out.println("2. 캐릭터 정보");
		System.out.println("3. 전직하기");
		System.out.println("4. 공격하기");
		System.out.println("5. 스킬 사용하기");
		System.out.println("0. 종료");
	}

	public void createCharacter() {
		Random random = new Random();

		System.out.print("캐릭터 이름을 입력하세요: ");
		String name = scan.nextLine();

		int strength, dexterity, intelligence;
		while (true) {
			strength = random.nextInt(10) + 1; // 1~10
			dexterity = random.nextInt(10) + 1;
			intelligence = random.nextInt(10) + 1;

			int total = strength + dexterity + intelligence;
			System.out.println("생성된 스탯 - 힘: " + strength + ", 민첩: " + dexterity + ", 지능: " + intelligence + " (총합: "
					+ total + ")");

			if (total >= 15) {
				System.out.print("이 스탯으로 진행하시겠습니까? (y/n): ");
				String choice = scan.nextLine();
				if (choice.equalsIgnoreCase("y")) {
					break;
				}
			} else {
				System.out.println("스탯 총합이 15 미만입니다. 다시 생성합니다.");
			}
		}

		character = new Novice(name, strength, dexterity, intelligence);
		System.out.println("캐릭터가 생성되었습니다!");
	}

	public void printCharacterInfo() {
		if (character == null) {
			System.out.println("생성된 캐릭터가 없습니다.");
			return;
		}

		System.out.println("===== 캐릭터 정보 =====");
		System.out.println("이름: " + character.getName());
		System.out.println("힘: " + character.getStrength());
		System.out.println("민첩: " + character.getDexterity());
		System.out.println("지능: " + character.getIntelligence());
		// 직업이 있는 경우
		if (character instanceof Knight) {
			System.out.println("직업: " + ((Knight) character).getJob());
		} else if (character instanceof Magician) {
			System.out.println("직업: " + ((Magician) character).getJob());
		} else if (character instanceof Thief) {
			System.out.println("직업: " + ((Thief) character).getJob());
		} else {
			System.out.println("직업: 평민");
		}
	}

	public void changeJob() {
		if (character == null) {
			System.out.println("생성된 캐릭터가 없습니다.");
			return;
		}

		System.out.println("전직할 직업을 선택하세요.");
		System.out.println("1. 기사 (Knight)");
		System.out.println("2. 마법사 (Magician)");
		System.out.println("3. 도적 (Thief)");
		System.out.print("선택: ");
		String choice = scan.nextLine();

		switch (choice) {
		case "1":
			character = new Knight(character.getName(), character.getStrength(), character.getDexterity(),
					character.getIntelligence());
			System.out.println("기사로 전직했습니다!");
			break;
		case "2":
			character = new Magician(character.getName(), character.getStrength(), character.getDexterity(),
					character.getIntelligence());
			System.out.println("마법사로 전직했습니다!");
			break;
		case "3":
			character = new Thief(character.getName(), character.getStrength(), character.getDexterity(),
					character.getIntelligence());
			System.out.println("도적으로 전직했습니다!");
			break;
		default:
			System.out.println("잘못된 입력입니다.");
		}
	}

	public void attack() {
		if (character == null) {
			System.out.println("생성된 캐릭터가 없습니다.");
			return;
		}
		character.attack();
	}

	public void useSkill() {
		if (character == null) {
			System.out.println("생성된 캐릭터가 없습니다.");
			return;
		}

		// 평민(Novice)인 경우 스킬 없음
		if (character instanceof Skill) {
			((Skill) character).skill();
		} else {
			System.out.println("아직 전직하지 않아 스킬을 사용할 수 없습니다.");
		}
	}
}
