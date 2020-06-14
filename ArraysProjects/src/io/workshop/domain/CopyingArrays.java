package io.workshop.domain;

import java.util.Arrays;

public class CopyingArrays {

	public static void main(String[] args) {
		//original array
		int[] myArray = {1,2,3,4,5,6};
		
		//new larger array
		int[] hold = {10,9,8,7,6,5,4,3,2,1};
		
		System.out.println(Arrays.toString(hold));
		//copy all of the myArray to hold array
		//starting with the 0th index.
		System.arraycopy(myArray, 0, hold, 0, myArray.length);
		System.out.println(Arrays.toString(hold));
	}

}
