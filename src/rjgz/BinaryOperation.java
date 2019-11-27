package rjgz;

import java.util.Random;

public abstract class BinaryOperation {
	public static void main(String[] args) {
		for(int i = 0; i < 50; i++) {
			SubstrctOperation a = new SubstrctOperation();
			a.substrctOperation();
		}
		System.out.println("++++++++++++++++++++++++++");
		for(int i = 0; i < 50; i++) {
			AdditionOperation b = new AdditionOperation();
			b.additionOperation();
		}
		System.out.println("++++++++++++++++++++++++++");
		for(int i = 0; i < 50; i++) {
			Mix c = new Mix();
			c.mix();
		}
	}
	public abstract void additionOperation() ;
	public abstract void substrctOperation() ;
	public abstract void mix() ;
}
class AdditionOperation extends BinaryOperation{
	public void additionOperation() {
		Random ran = new Random();
		int x,y;
		x = ran.nextInt(100);
		y = ran.nextInt(100);
		System.out.println(""+x + "+" + y + "=" +(x + y));
	}
	public void substrctOperation() {
		
	}
	public void mix() {
		
	}
}
class SubstrctOperation extends BinaryOperation{
	public void additionOperation() {
		
	}
	public void substrctOperation() {
		Random ran = new Random();
		int x,y;
		x = ran.nextInt(100);
		y = ran.nextInt(100);
		System.out.println(""+x + "-" + y + "=" +(x + y));
	}
	public void mix() {
		
	}
}
class Mix extends BinaryOperation{
	public void additionOperation() {
	}
	public void substrctOperation() {
	}
	public void mix() {
		int x,y;
		char lofg = '+';
		Random ran = new Random();
		if(ran.nextInt(2) == 1) {
			lofg = '+';
			x = ran.nextInt(100);
			y = ran.nextInt(100);
			System.out.println(""+x + lofg + y + "=" +(x + y));
		}
		else {
			lofg = '-';
			x = ran.nextInt(100);
			y = ran.nextInt(100);
			System.out.println(""+x + lofg + y + "=" +(x - y));
		}	
	}
}