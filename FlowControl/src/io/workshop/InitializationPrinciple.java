package io.workshop;

public class InitializationPrinciple {
	
	public void doComputation() {
		int x = (int) (Math.random() * 100);
		int y = 0;
		int z;
		
		if(x > 50) {
			y = 9; //initializing y variable
		}
		z = y + x; // possible use before initialization	
		
		
	}

}
