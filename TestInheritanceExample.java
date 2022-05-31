package com.vstl.oopsInterfaceExample;

public class TestInheritanceExample {

	public static void main(String[] args) {

		BasePage objBasePage = new HomePage();		
		System.out.println("open URL:" +objBasePage.strUrl);
		objBasePage.loginToPage();
		objBasePage.loginCredentials("Rohini", "Rohi@123");
	
System.out.println("***************");

	    BasePage objAnotherBasePage = new StudentPortalPage();		
	    System.out.println("open URL:" +objAnotherBasePage.strUrl);
        objAnotherBasePage.loginToPage();
	    objAnotherBasePage.loginCredentials("Rani", "Rani@123");
	}
 }

