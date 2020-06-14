package io.workshop.domain;

public class ReferenceArray {
	
	public Point[] createArray() {
		//declared an array
		Point[] p;
		//create an array
		p = new Point[10];
		//initialize an array
		for(int i=0;i<10;i++) {
			p[i] = new Point(i, i+1);
		}
		return p;
		
	}

}
