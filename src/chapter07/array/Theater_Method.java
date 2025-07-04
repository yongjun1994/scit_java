package chapter07.array;

import java.util.Scanner;

public class Theater_Method {
	
	//멤버 변수
	private int[][] seats = new int[7][7];
	private final Scanner scan = new Scanner(System.in);

	
	//메뉴를 출력하기 위한 메서드
	public void printMenu() {
		// 1)
//		System.out.println("메뉴의 번호를 선택해 주세요.");
//		System.out.println("=======================");
//		System.out.println("1. 좌석 확인");
//		System.out.println("2. 좌석 예약");
//		System.out.println("0. 종 　　료");		
//		System.out.println("=======================");
//		System.out.print("번호를 선택하세요 : ");
		
		// 2)
		String menu = """
				메뉴의 번호를 선택해 주세요.
				=======================
				1. 좌석 확인
				2. 좌석 예약
				0. 종 　　료
				=======================
				번호를 선택하세요 :
				""";
		System.out.println(menu);
	}
	
	//사용자가 2 를 입력했을 때, 좌석 수를 입력받기 위한 메서드
	public int inputCnt() {
		
		System.out.print("몇개의 좌석을 예약하시겠습니까? : ");				
		int result = scan.nextInt();
		
		return result;
	}
	
	//출력문들을 모아 놓은 메서드
	public void printText(int num) {
		switch (num) {
			case 1:
				System.out.println("프로그램을 종료합니다.");			
				break;
			case 2:
				System.out.println("번호를 잘못 입력하셨습니다.");			
				break;
			case 3:
				System.out.println("◆ 극장 좌석 예약 프로그램◆");			
				break;
		}
	}
	
	//좌석 예약 현황을 출력하는 메서드(배열의 모든 요소 출력)
	public void seatInfo() {
		System.out.println();
		System.out.println("※좌석 예약 정보");
		System.out.println("-----------------------");
		System.out.println("   1 2 3 4 5 6 7");
		System.out.println("-----------------------");
		for (int i = 0; i < seats.length; i++) {
			System.out.print((i+1) + "| ");
			for (int j = 0; j < seats[i].length; j++) {
				System.out.print(seats[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	//정수 하나를 받아와서 그 수 만큼 예약을 진행하는 메서드(해당 인덱스의 배열의 값 변경)
	public void reservationSeats(int cnt) {
		for (int i = 0; i < cnt; i++) {
			System.out.print("예약할 좌석의 행 : ");
			int row = scan.nextInt();
			System.out.print("예약할 좌석의 열 : ");				
			int col = scan.nextInt();
			
			if(seats[row-1][col-1] != 1) {
				seats[row-1][col-1] = 1;
				System.out.println("예약되었습니다.");
			}else {
				System.out.println(row+"행 "+col+"열은 예약된 좌석입니다.");
				i--;
			}
		}
	}
}
