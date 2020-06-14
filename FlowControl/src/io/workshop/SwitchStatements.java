package io.workshop;

public class SwitchStatements {

	public static void main(String[] args) {
		
		String gender = "male";
		switch(gender) {
			case "female":
			case "FEMALE": 
				System.out.println("Gender is female.");
				break;
			case "male": 
			case "MALE":
				System.out.println("Gender is male");
				break;
			
			default:
				System.out.println("I don't know the gender");
		}
	}

}
