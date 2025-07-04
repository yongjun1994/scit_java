package chapter15.iostream;

import java.io.FileOutputStream;
import java.io.IOException;

public class C128_ioStream_out {
	
	/*
		자바에서의 I/O (Input/Output) 스트림은 데이터를 읽고 쓰는 방법을 제공하는 클래스
		스트림(Stream)은 데이터를 바이트 단위로 읽거나 쓰는 연속적인 데이터 흐름
		
		입력 스트림(Input Stream)
			입력 스트림은 데이터를 입력받을 때 사용
			
			InputStream: 바이트 단위로 데이터를 읽기 위한 추상 클래스
				FileInputStream: 파일에서 바이트를 읽어옴
				ByteArrayInputStream: 바이트 배열에서 데이터를 읽어옴
				BufferedInputStream: 데이터를 버퍼링하며 읽기 성능을 향상
			
			Reader: 문자 단위로 데이터를 읽기 위한 추상 클래스
				FileReader: 파일에서 문자를 읽어옴
				BufferedReader: 입력 스트림을 버퍼링하며, 한 줄씩 읽기 기능을 제공
				InputStreamReader: 바이트 입력 스트림을 문자 입력 스트림으로 변환
		
		출력 스트림(Output Stream)
			출력 스트림은 데이터를 출력할 때 사용됩 
			
			OutputStream: 바이트 단위로 데이터를 쓰기 위한 추상 클래스
				FileOutputStream: 파일에 바이트를 씀
				ByteArrayOutputStream: 바이트 배열에 데이터를 씀
				BufferedOutputStream: 데이터를 버퍼링하여 쓰기 성능을 향상
			
			Writer: 문자 단위로 데이터를 쓰기 위한 추상 클래스
				FileWriter: 파일에 문자를 씀
				BufferedWriter: 출력 스트림을 버퍼링하며, 더 빠르게 데이터를 씀
				OutputStreamWriter: 바이트 출력 스트림을 문자 출력 스트림으로 변환
		
		- 정리 -
		InputStream/OutputStream: 바이트 단위 I/O를 처리
		Reader/Writer: 문자 단위 I/O를 처리
		버퍼링된 스트림 (BufferedInputStream, BufferedReader 등)은 I/O 성능을 향상
	 */

	public static void main(String[] args) {
		byte[] data = { 8, 9, 0, 6, 2, 9, 9 };
//		char data = 'A';
		FileOutputStream out = null;
		try {
			out = new FileOutputStream("test.txt");	// src 폴더에 test.txt 생성(새로 고침 확인)
			out.write(data);
			System.out.println("Write success");
		}
		catch (IOException e) {
			System.out.println("File output error");
		}
		finally {
			try {
				out.close();
			}
			catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

}
