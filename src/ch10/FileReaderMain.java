package ch10;

import java.io.*;


public class FileReaderMain {

	public static void main(String[] args) throws IOException{
//		자바의 특징: GC가 존재하여 사용되지 않는 변수, 메서드,객체, 등을 자동으로 메모리에서 삭제함 지씨=가비치 킬러 쓰레기 청소부
//				File 클래스: 외부 파일을 연결
				File file = new File("F:\\workspace\\java102\\reader.txt");
				FileReader fr = null;
//				FileReader fr = new FileReader(file);
		try {
			fr = new FileReader(file);
//			File file = new File("F:\\workspace\\java102\\reader.txt");
//			FileReader fr = new FileReader(file);
			int i = 0;
			
			while((i = fr.read()) != -1) {
				System.out.print((char)i);
			}
//			fr.close();
			
		}
		catch(IOException e){
			System.out.println("파일을 읽는 도중 오류가 발생");
//			e.printStackTrace();
		}
		finally {
			try {
				if(fr != null) {
					fr.close();
				}
				
			} catch(IOException e) {
				e.printStackTrace();
			}
			
		}

	}

}
