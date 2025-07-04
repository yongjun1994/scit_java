package chapter14.exception;

import java.util.Scanner;

class DashException extends Exception {
	public DashException(String message) {
		super(message);
	}
}

class LengthException extends Exception {
	public LengthException(String message) {
		super(message);
	}
}

public class Exception_Example_Class {

	public static void main(String[] args) {
		/*
		 * 주민등록번호 입력 받기 14자리가 아니거나 7
		 * 번째 문자열이 - 가 아닐 경우 
		 * 		* 14 자리를 입력해주세요. > LengthException
		 * 		* -를 입력해주세요. > DashException 
		 * 위의 텍스트를 출력하는 예외를 발생하여 예외처리할 것
		 */

		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("주민등록번호를 입력하세요: ");
			String ssn = scan.nextLine();
			
			if (ssn.length() != 14) {
				throw new LengthException("* 14자리를 입력해 주세요.");
			} else if (ssn.charAt(6) != '-') {
				throw new DashException("* -를 입력해주세요.");
			}
		} catch (LengthException e) {
			System.out.println(e.getMessage());
		} catch (DashException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
