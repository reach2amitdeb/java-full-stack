package io.workshop.domain;

public class TestReferenceArray {

	public static void main(String[] args) {
		
		ReferenceArray array = new ReferenceArray();
		Point[] p = array.createArray();
		System.out.println(p); // ---> toString
	}

}
