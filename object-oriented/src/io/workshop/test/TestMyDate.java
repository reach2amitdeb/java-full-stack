package io.workshop.test;

import io.workshop.domain.MyDate;

public class TestMyDate {

	public static void main(String[] args) {
		MyDate mydate = new MyDate();
		
		mydate.setDay(12);
		mydate.setMonth(3);
		mydate.setYear(6);
		
		System.out.println("The day is : "+mydate.getDay());
		System.out.println("The month is : "+mydate.getMonth());
		System.out.println("The year is : "+mydate.getYear());


	}

}
