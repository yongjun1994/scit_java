package chapter13.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class User_method {
	Scanner scan = new Scanner(System.in);
	// 유저 등록 리스트
	List<User> userList = new ArrayList<>();

	public void printMenu() {
		// 메뉴를 출력하는 코드 작성
		System.out.println("===== 유저관리 프로그램 =====");
		System.out.println("1. 유저정보 등록");
		System.out.println("2. 유저정보 조회");
		System.out.println("3. 전체정보 조회");
		System.out.println("0. 종료");
	}

	public void createUser() {
		/*
		 * 유저정보를 등록하는 코드 작성 
		 * 1. 아이디, 비밀번호, 이름, 핸드폰, 주소를 입력받는다. 
		 * 2. User 인스턴스를 생성한다. 
		 * 3. 유저등록 리스트에 같은 아이디가 존재하는지 확인 후 존재하지 않으면 등록
		 */
		System.out.print("아이디: ");
		String id = scan.nextLine();

		// 아이디 중복 체크
		for (User user : userList) {
			if (user.getId().equals(id)) {
				System.out.println("이미 존재하는 아이디입니다. 등록 실패!");
				return; // 등록 중단
			}
		}

		System.out.print("비밀번호: ");
		String pw = scan.nextLine(); 
		// 비밀번호는 문자열로 받는 게 일반적입니다!

		System.out.print("이름: ");
		String name = scan.nextLine();

		System.out.print("핸드폰: ");
		String phone = scan.nextLine(); 
		// 핸드폰 번호도 문자열로 받아야 합니다 
		// (숫자만 받으면 010 앞자리 등 문제 발생)

		System.out.print("주소: ");
		String address = scan.nextLine();

		// User 객체 생성
		User newUser = new User(id, pw, name, phone, address);

		// 리스트에 추가
		userList.add(newUser);

		System.out.println("회원 등록이 완료되었습니다.");
	}

	public void selectUser() {
		/*
		 * 유저정보를 조회하는 코드 작성 
		 * 1. 유저등록 리스트에 유저정보가 존재하는지 확인 
		 * 2. 조회할 아이디, 확인용 비밀번호 입력 받는다. 
		 * 3. 조회할 아이디, 확인용 비밀번호가 유저등록 리스트에 저장된 비밀번호와 일치하면 유저정보 출력
		 */
		if (userList.isEmpty()) {
			System.out.println("등록된 회원이 없습니다.");
			return;
		}

		System.out.print("조회할 아이디를 입력하세요: ");
		String id = scan.nextLine();

		System.out.print("비밀번호를 입력하세요: ");
		String pw = scan.nextLine();

		// 리스트에서 아이디 찾기
		for (User user : userList) {
			if (user.getId().equals(id)) {
				// 아이디는 맞음 -> 비밀번호 검사
				if (user.getPw().equals(pw)) {
					System.out.println("회원정보 조회 성공!");
					System.out.println(user);
					return;
				} else {
					System.out.println("비밀번호가 일치하지 않습니다.");
					return;
				}
			}
		}

		System.out.println("존재하지 않는 아이디입니다.");
	}

	public void selectALL() {
		/*
		 * 유저 전체정보를 조회하는 코드 작성 
		 * 1. 유저등록 리스트에 유저정보가 존재하는지 확인 
		 * 2. 전체정보를 출력 (단, '아이디순'으로 정렬하여
		 * 출력할 것)
		 */
		if (userList.isEmpty()) {
			System.out.println("등록된 회원이 없습니다.");
			return;
		}

		// 리스트를 id 기준으로 오름차순 정렬
		Collections.sort(userList, new Comparator<User>() {
			@Override
			public int compare(User u1, User u2) {
				return u1.getId().compareTo(u2.getId());
			}
		});

		System.out.println("===== 전체 회원 목록 (ID순 정렬) =====");
		for (User user : userList) {
			System.out.println(user);
		}
	}
}
