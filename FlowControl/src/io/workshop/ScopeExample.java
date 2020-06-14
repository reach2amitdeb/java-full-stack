package io.workshop;

public class ScopeExample {
	
	private int i = 1; //instance variable
	
	public void firstMethod() {
		int i = 4, j = 5; //local variable
		
		this.i = i + j;
		secondMethod(7);
	}

	public void secondMethod(int i) { //local variable
		int j = 8;
		this.i = i + j;
	}

	@Override
	public String toString() {
		return "i = " + i;
	}
	
	
}
