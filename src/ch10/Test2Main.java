package ch10;

import java.util.Scanner;

public class Test2Main {
	
//	무한 반복 됩니다 ㅠㅠㅠㅠㅠㅠㅠㅠㅠ

	public static void main(String[] args) {
		double random = Math.random();
		
		int num1 = (int)(random *99);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int num2 = sc.nextInt();
		
		
		while(num1 != num2) {
			 
			if(num1 < num2) 
				System.out.println(num2+"보다 큰 숫자 입니다.");
			 
			 else if(num1 > num2) 
				 System.out.println(num2+"보다 큰 숫자 입니다.");
			 
			 else
				 break;
			
			if(num1 == num2) {
				System.out.println("정답 입니다.");
				System.out.println("다시 시작 하겟습니까 y / n.");
				String text = sc.next();
				if(text.equals("n")) {
					System.out.println("프로그램 종료");
					System.exit(0);
				}
				else if(text.equals("y"))
					continue;
			}
			sc.close();
			
				
		}
			
	}
		
}











