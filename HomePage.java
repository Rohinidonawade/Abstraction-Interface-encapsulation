package com.vstl.oopsInterfaceExample;

public class HomePage implements BasePage{

	String strName = "Sudha";
	String strPassword = "Sudha@123";
	
	@Override
	public void loginToPage() {
		
		System.out.println("Open the Home page");
	}
    
	public void loginCredentials(String strUserName, String strPassword) {
		strName = strUserName;
		System.out.println("User name is :" +strUserName);
		
		strPassword = strPassword;
		System.out.println("Password is :" +strPassword);
	
	}
}
