package io.workshop.domain;

public class TestPrimitiveArray {

	public static void main(String[] args) {
		
		PrimitiveArray array = new PrimitiveArray();
		char[] characters = array.createArray();
		//System.out.println(characters);
		array.printElements(characters);
	}

}
