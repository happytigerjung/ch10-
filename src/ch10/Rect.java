package ch10;

public class Rect {
	protected int x =5;
	public void f() {
		x++;
		System.out.println(x);
	}

}

class SpecialRect extends Rect{
	public void f() {
		System.out.println(super.x);
	}
}

