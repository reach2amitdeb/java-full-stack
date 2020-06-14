package io.workshop;

public class LoopDemo {

	public static void main(String[] args) {
		
		for(int i=0;i<=10;i++) {
			System.out.println(i + " squared is " + (i*i));
		}
		
		System.out.println("the while loop");
		int i = 0;
		while(i<10) {
			System.out.println(i + " squared is "+ (i*i));
			i++;
		}
		
		System.out.println("the do while loop");
		i = 0;
		do {
			System.out.println(i + " squared is "+ (i*i));
			i++;
		}while(i<10);
		
		// for each loop --> arrays
		//foreach() method java 8 collections
			
	}

}
