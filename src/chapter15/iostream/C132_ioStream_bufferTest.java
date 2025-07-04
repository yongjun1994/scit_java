package chapter15.iostream;

import java.io.BufferedReader;
import java.io.FileReader;

public class C132_ioStream_bufferTest {

	public static void main(String[] args) throws Exception{
		// FileReader는 문자 "기반 스트림"으로, 파일에서 문자를 읽어올 수 있음
		// BufferedReader는 문자 "보조 스트림"으로, BufferedReader는 FileReader를 감싸서 버퍼링을 통해 읽기 성능을 개선
		BufferedReader in = new BufferedReader(new FileReader("test.txt"));
		
		char[] text = new char[20];
		int num = in.read(text);
		System.out.println("읽은 문자 개수 = " + num);
		System.out.println(text);
		in.close();
	}

}
