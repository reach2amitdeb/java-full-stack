package io.workshop.test;

import io.workshop.domain.Dog;

public class TestDog {

	public static void main(String[] args) {
		//create Dog object
		Dog dog = new Dog(); //invoke explicit constructor
		
		//accessing object members
		//dog.getWeight = 42; //only permissible if weight is public
		//dog.setWeight(42);
		
		System.out.println("The dog weight is : " + dog.getWeight());
	}

}
