package io.workshop.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidationUsingRegEx {

	public static void main(String[] args) {
		
		List<String> emails = new ArrayList<>();
		
		emails.add("vinod@gmail.com");
		emails.add("kumar@gmail.com");
		
		//invalid emails
		emails.add("vinodhgmail.com");
		emails.add("@kumar.io");
		
		String regex = "^(.+)@(.+)$";
		
		Pattern pattern = Pattern.compile(regex);
		
		for(String email: emails) {
			Matcher matcher = pattern.matcher(email);
			System.out.println(email + " : " + matcher.matches());
		}
	}

}
