package chapter15.iostream;

import java.io.File;
import java.io.FileWriter;

public class C136_file_makedir {

	public static void main(String[] args) throws Exception {
		// File 객체를 생성. 이 객체는 실제로 파일 시스템에서 폴더 또는 파일을 나타낼 수 있음
		File folder = new File("C:\\eclipse_file_directory\\TestFolder");
		
		if (folder.mkdir()) {
			File file = new File("C:\\eclipse_file_directory\\TestFolder\\MyFile.txt");
			
			// 파일이 성공적으로 생성되면 true를 반환하고, 만약 파일이 이미 존재한다면 false를 반환
			if (file.createNewFile()) {
				FileWriter out = new FileWriter(file);
				out.write("테스트 파일");
				out.close();
			}
		}
	}

}
