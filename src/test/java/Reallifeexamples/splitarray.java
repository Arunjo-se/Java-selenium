package Reallifeexamples;

public class splitarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String passwordText ="Please use temporary password 'rahulshettyacademy' to Login.";


		String[] passwordArray = passwordText.split("'");

		System.out.println("0th index: " + passwordArray[0]);
		
		String password = passwordArray[1];
		
		System.out.println(password);

	}

}
