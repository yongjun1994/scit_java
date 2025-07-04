package chapter15.iostream;

import java.io.FileInputStream;

public class C129_ioStream_in1 {

	public static void main(String[] args) 
			throws Exception 
	{
		// "test.txt"는 파일 경로로, 이 파일이 존재해야 함 
		// 파일이 존재하지 않으면 FileNotFoundException이 발생
		FileInputStream in = new FileInputStream("test.txt");
		
		// in.available() 메서드는 현재 FileInputStream에서 읽을 수 있는 바이트 수를 반환 
		int avail = in.available();
		System.out.println(avail);
		
		byte[] data = new byte[avail];
		// 파일의 처음부터 읽어와 배열의 크기만큼 바이트 데이터를 data에 저장
		in.read(data);
		in.close();
		
		for (byte b : data) {
			System.out.print(b);
		}
	}

}
