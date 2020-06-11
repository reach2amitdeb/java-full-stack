package io.workshop.test;

import io.workshop.domain.Dog;

public class PassTestReference {

	public static void main(String[] args) {
		
		//Assign the dog
		Dog d = new Dog(120);
		
		//try to change it
		changeObjectReference(d);
		
		System.out.println(d); //120
		
		//Now change the weight attribute through object refrence
		
		changeObjectAttribute(d);

		System.out.println(d); //400

	}
	
	static void changeObjectReference(Dog d) {
		d = new Dog(220);  //change the reference value
		return;
	}
	
	static void changeObjectAttribute(Dog d) {
		d.setWeight(400);
	}
}
