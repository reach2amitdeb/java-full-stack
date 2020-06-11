package io.workshop.test;

public class PrimitiveCasting {

	public static void main(String[] args) {
		long bigValue = 99L;
		//int squashed = bigValue;
		int squashed = (int) bigValue; //explicit casting
		
		double z = 3.1415F; //implicit casting
		
		float z1 = 3.1415F;
		
		int captureValue = Integer.parseInt("4");
		
		System.out.println(captureValue);

	}

}
