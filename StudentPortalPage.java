package com.vstl.oopsInterfaceExample;

public class StudentPortalPage implements BasePage{

	@Override
	public void loginToPage() {

        System.out.println("Open Student portal");		
	}

	@Override
	public void loginCredentials(String strUserName, String strPassword) {
      System.out.println("User Name is :" +strUserName);
      System.out.println("Password is :" +strPassword);
		
	}
	
}
