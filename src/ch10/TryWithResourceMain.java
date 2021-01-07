package ch10;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourceMain {

	public static void main(String[] args) throws Exception {
		File file = new File("F:\\\\workspace\\\\java102\\\\reader.txt");
		
		FileReader fr = null;
		
		try {
			fr = new FileReader(file);
			
			int i = 0;
			
			while ((i = fr.read()) != -1) {
				System.out.print((char)i);
			}
//			throw 강제로 예외 발생
			throw new Exception();
		}
		catch(IOException e) {
			System.out.println("일반 예외처리가 되었ㅅ브니다.");
		}
		finally {
			try {
				if(fr != null) {
					fr.close();
					System.out.println("파일을 닫습니다.");
				}
			}
			catch(IOException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("\n----------try With Resouce--------\n");
		
		try(FileInputStream fis = new FileInputStream("F:\\workspace\\java102\\reader.txt")){
			fis.read();
			
			throw new Exception();
			
		}
		catch(IOException e) {
			System.out.println("예외 처리가 실행되었습니다.");
		}

	}

}


























