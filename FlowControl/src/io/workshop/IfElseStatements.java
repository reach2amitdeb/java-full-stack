package io.workshop;

public class IfElseStatements {

	public static void main(String[] args) {

		int x = 15;
		if(x<10) {
			System.out.println("Are you finished yet ?");
		}else {
			System.out.println("Keep working....");
		}
		
		// complex if, else statements
		int count = getCount();
		if(count < 0) {
			System.err.println("Error : count value is negative.");
		}else if(count > getMaxCount()){
			System.err.println("Error: Count value is too big.");
		}else {
			System.out.println("There will be " +count+ " people for lunch today.");
		}
	}

	private static int getMaxCount() {
		return 100;
	}

	private static int getCount() {
		return 35;
	}

}
