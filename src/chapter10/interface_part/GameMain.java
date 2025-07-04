package chapter10.interface_part;

import java.util.Scanner;

public class GameMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		GameMain_Method gm = new GameMain_Method(scan); // Scanner 넘겨주기

		while (true) {
			gm.printMenu();
			System.out.print("메뉴 선택: ");

			// 숫자 입력 (오류 방지)
			int num;
			try {
				num = Integer.parseInt(scan.nextLine()); // nextLine()으로 안전하게 받기
			} catch (NumberFormatException e) {
				System.out.println("숫자만 입력하세요.");
				continue;
			}

			switch (num) {
			case 1:
				gm.createCharacter();
				break;
			case 2:
				gm.printCharacterInfo();
				break;
			case 3:
				gm.changeJob();
				break;
			case 4:
				gm.attack();
				break;
			case 5:
				gm.useSkill();
				break;
			case 0:
				System.out.println("게임을 종료합니다.");
				scan.close();
				return;
			default:
				System.out.println("잘못된 입력입니다. 다시 선택하세요.");
			}
		}
	}
}
