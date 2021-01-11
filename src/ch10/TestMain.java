package ch10;

import java.util.Scanner;

public class TestMain {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("철수 >>");
		String c = sc.next();
		
		Scanner scc = new Scanner(System.in);
		System.out.println("영희 >>");
		String y = scc.next();
		
		switch(c) {
		case "가위":
			break;
		case "바위":
			break;
		case "보":
			break;		
		}
		
		switch(y) {
		case "가위":
			break;
		case "바위":
			break;
		case "보":
			break;	
		}
//		텍스트가 이프엘스 문에서 왜 안먹히는지 도저희 모르겟네요 ㅜㅜㅜㅜㅜㅜ 뭐가 잘못된건지
		if(c == y) {
			System.out.println("비겼습니다.");
		}
		else if((c =="가위" && y =="보") || (c =="바위" && y =="가위") || (c =="보" && y =="바위")) {
			System.out.println("철수가 이겼습니다.");
		}
		else if((y =="가위" && c =="보") || (y =="바위" && c =="가위") || (y =="보" && c =="바위")) {
			System.out.println("영희가 이겼습니다.");
		}
		else {
			System.out.println("잘못입력했습니다.");
		}
	}

}













