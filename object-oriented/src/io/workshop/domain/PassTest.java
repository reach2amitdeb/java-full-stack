package io.workshop.domain;

public class PassTest {

	public static void main(String[] args) {
		//create a primitive type
		int val = 11;
		//try to change it
		changeInt(val);	
		
		System.out.println("Int Value Is : " +val);
	}
	
	public static void changeInt(int value) {
		value = 55;
	//	return;    implicit return
	}

}
