package chapter14.exception;

import java.util.Scanner;

class LengthException extends Exception {
	public LengthException(String message) {
		super(message);
	}
}

class DashException extends Exception {
	public DashException(String message) {
		super(message);
	}
}

public class Exception_Example {

	public static void main(String[] args) {
		/*
		 * 주민등록번호 입력 받기 14자리가 아니거나 7
		 * 번째 문자열이 - 가 아닐 경우 
		 * 		* 14 자리를 입력해주세요. > LengthException
		 * 		* -를 입력해주세요. > DashException 
		 * 위의 텍스트를 출력하는 예외를 발생하여 예외처리할 것
		 */

		Scanner sc = new Scanner(System.in);

		System.out.print("주민등록번호를 입력하세요 (예: 123456-1234567): ");
		String input = sc.nextLine();

		try {
			validateJumin(input);
			System.out.println("정상적으로 입력되었습니다.");
		} catch (LengthException e) {
			System.out.println("14자리를 입력해주세요.");
		} catch (DashException e) {
			System.out.println("-를 입력해주세요.");
		}

		sc.close();
	}

	// 입력 검증 메서드
	public static void validateJumin(String jumin) throws LengthException, DashException {
		if (jumin.length() != 14) {
			throw new LengthException("주민등록번호는 14자리여야 합니다.");
		}

		if (jumin.charAt(6) != '-') {
			throw new DashException("7번째 문자는 반드시 '-'여야 합니다.");
		}
	}
}
