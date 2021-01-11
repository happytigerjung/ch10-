package ch10;

import java.util.Scanner;

public class Test3Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("몇명입니까");
		int people = sc.nextInt();
		System.out.println("참가자 이름은 무엇입니까");
		
		
		
		System.out.println("게입을 시작합니다");
		
		String str1 = "겨울한파";
		System.out.println("시작 단어는"+str1+"입니다.");
		
		while(true) {
			int end = str1.length();
			
			System.out.println("다음 단어 입력");
			String str2 = sc.nextLine();
			
			if(str1.charAt(end-1) == str2.charAt(0)) {
				str1 = str2;
			}
			else {
				System.out.println("틀렸 습니다. 졌습니다.");
				break;
			}
		}

		

	}

}
