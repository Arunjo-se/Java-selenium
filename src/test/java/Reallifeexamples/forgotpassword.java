package Reallifeexamples;

import java.util.ArrayList;

public class forgotpassword {
	

	
	public Boolean lp = false;
	public String fpass;
	
	ArrayList<String> lpp = new ArrayList<String>();

	
	public void loginpassword(String fpass) {
		
		
		lpp.add(fpass);
		
		System.out.println("login password: "+ lpp.get(0));
		
	}
	
	public void forgotpassword1() {
		
		String fpass1 = "fpass";
		
		this.fpass = fpass1;
		
	//	fpass = "fpassword";
		
		lpp.set(0, fpass);
		
		System.out.println("login password: "+ lpp.get(0));

		
		
		
		
	}



}
