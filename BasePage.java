package com.vstl.oopsInterfaceExample;

public interface BasePage {

	//Interface:- Is used to achieve 100% Abstraction in java in interface, only abstract methods are allowed.
	//All variables declared in interface should be constant. i.e public static final
	//can't create abject of interface, An interface is declared by using the interface keyword.	
	
	public static final String strUrl = "https://www.rgpv.ac.in/Login/StudentLogin.aspx";
	
	abstract void loginToPage();

	abstract void loginCredentials(String string, String string2); 	
}
