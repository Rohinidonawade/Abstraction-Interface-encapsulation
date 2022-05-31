package com.vstl.oopsAbstractionExample;

public class TestAbstractExample {

	public static void main(String[] args) {
		
		PageFactory.getobjBankLoginPage().doLogin("Rani Patil", "Belgaum");
		PageFactory.getobjBankLoginPage().loginCredentials("Rani", "Rani@98");
		PageFactory.getobjBankLogin().getBranchDetails();
		
System.out.println("********************");
		
		PageFactory.getobjBankLogin().doLogin("Raju Bhuvi", "Gokak");
		PageFactory.getobjBankLogin().loginCredentials("Raji", "Raju@123");
		PageFactory.getobjBankLogin().getBranchDetails();
	}
}