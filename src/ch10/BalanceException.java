package ch10;


public class BalanceException extends Exception {
	
//	생성자 2개 필요
//	기본 생성자, 매개변수가 있는 생성자
	public BalanceException() {
		
	}

	public BalanceException(String message) {
		super(message);
	}

}
