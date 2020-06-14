package io.workshop.domain;

public class TwoDimentionalArrays {

	public static void main(String[] args) {
		
		int[][] twoDim = new int[5][];
		
//		twoDim[0] = new int[1]; // 1st array 1 element
//		twoDim[1] = new int[2]; // 2nd array 2 elements
//		twoDim[2] = new int[3]; // 3rd array 3 elements
//		twoDim[3] = new int[4]; // 4th array 4 elements
//		twoDim[4] = new int[5]; // 5th array 5 elements
		
		twoDim[0] = new int[] {1}; // 1st array 1 element
		twoDim[1] = new int[] {1,2}; // 2nd array 2 elements
		twoDim[2] = new int[] {1,2,3}; // 3rd array 3 elements
		twoDim[3] = new int[] {1,2,3,4}; // 4th array 4 elements
		twoDim[4] = new int[] {1,2,3,4,5};// 5th array 5 elements
		
		//display
		for(int i=0;i<twoDim.length;i++) {
			for(int j=0;j<twoDim[i].length;j++) {
				System.out.print(twoDim[i][j]+ " ");
			}
			System.out.println();
		}
		// for enchanced loop
//		for(int[] array: twoDim) {
//			for(int element: array) {
//				System.out.print(element + " ");
//			}
//			System.out.println();
//		}
	}

}
