package com.vstl.oopsAbstractionExample;

public abstract class BankLoginPage {

	//Abstract:- which is declared with the class.
	//*Is a process of hiding the implementation details and showing only functionality to user.
	
	public abstract void doLogin(String strName, String strBranch);
	
	public abstract void loginCredentials(String strUserName, String strPassword);
	
	
	//*It needs to be extended and its method implemented Abstract class cannot be instantiated.
	
	public void getBranchDetails() {
		int intMin_Balance = 100;
		System.out.println("The amount is :" +intMin_Balance);
		
	}
}
