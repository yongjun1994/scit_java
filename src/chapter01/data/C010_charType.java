package chapter01.data;

public class C010_charType {

	public static void main(String[] args) {
		// 문자형(char)
		char ch = '한';
		char ch2 = '\uD55C';
		System.out.println(ch);
		System.out.println(ch2);
		int i = ch;
		System.out.println(i);
		
/*
		탈출 문자 (escape sequence)
		\n : 개행
		\t : 수평 tab
		\\ : \ 문자열로 출력
		\' : ' 출력
		\" : " 출력
 */
		System.out.println(" 안 녕 하 \n 세 요 ");
		System.out.println(" 안 녕 하 \t 세 요 ");
		System.out.println(" 안 녕 하 \' 세 요 ");
		System.out.println(" 안 녕 하 \" 세 요 ");
		System.out.println(" 안 녕 하 \\ 세 요 ");

		// 탈출문자를 사용한 문자열
		String str = "아름다운 이땅에 금수강산에 " +
					"단군 할아버지가 \"터\" 잡으시고\n" +
					"\'홍익인간\' 뜻으로 나라 세우니 " +
					"대대손손 훌륭한 인물도 많아.";
		System.out.println(str);
		
		// 텍스트 블럭(text block)
		// java15 도입
		// 여는 따옴표 다음에는 공백 및 주석 외의 다른 문자열 사용 불가
		String str2 = """
				아름다운 이땅에 금수강산에
				단군 할아버지가 "터" 잡으시고
				'홍익인간' 뜻으로 나라 세우니
				대대손손 훌륭한 인물도 많아.
				""";
		System.out.println(str2);
		
		
	}

}
