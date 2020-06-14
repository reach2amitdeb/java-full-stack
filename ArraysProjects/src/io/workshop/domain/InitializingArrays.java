package io.workshop.domain;

import java.util.Scanner;

public class InitializingArrays {

	public static void main(String[] args) {
		
//		String[] names;
//		names = new String[3];
//		names[0] = "Georginna";
//		names[1] = "Jen";
//		names[2] = "Simon";
		
		//String[] names = {"Georginna", "Jen", "Simon"};
		
		String[] names = new String[10];
		Scanner keyboard = new Scanner(System.in);
		for(int i=0;i<10;i++) {
			names[i] = keyboard.next();
			System.out.println(names[i]);
		}
		
//		int x = keyboard.nextInt();
		
	}

}
