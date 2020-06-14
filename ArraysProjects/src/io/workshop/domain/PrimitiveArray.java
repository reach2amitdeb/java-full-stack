package io.workshop.domain;

public class PrimitiveArray {
	public char[] createArray() {
		//declare array
		char[] s;
		
		//creating array
		s = new char[26];
		
		//initialize an array
		for(int i=0;i<s.length;i++) {
			s[i] = (char)('A' + i);
		}
		
		return s;
	}

	public void printElements(char[] characters) {
		//Array Bounds
//		for(int i=0;i<characters.length;i++) {
//			System.out.println(characters[i]);
//		}
		
		for(char element: characters) {
			System.out.println(element);

		}
	}
	
}
