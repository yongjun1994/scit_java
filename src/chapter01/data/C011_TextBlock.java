package chapter01.data;

public class C011_TextBlock {

	public static void main(String[] args) {
		// 텍스트 블럭
		// """ 로 여러 줄 문자열을 표현 가능
		// \n, \' .. 등의 탈출문자 없이 문자열 처리 가능
		// \s 단일공백문자 삽입
		// \  개행방지
		String human = """
				이름: 김상형    \s
				나이: 39 \
				직업: 프로그래머\s
				""";
		System.out.println(human);
		
		System.out.println("==============");
		
		String str = "HTML example\n" + 
				"""
				<body>
					<p>문단</p>
				</body>
				""".stripIndent();
		System.out.println(str);
		
		String json = """
				{
					"name": "홍길동",
					"age": 30,
					"city": "Seoul"
				}
				""";
		System.out.println(json);
		
		String sql = """
				SELECT * FROM users
				WHERE age > 20
				ORDER BY name;
				""";
		System.out.println(sql);

	}

}
