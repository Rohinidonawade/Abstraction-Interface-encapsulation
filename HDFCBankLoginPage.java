package com.vstl.oopsAbstractionExample;

public class HDFCBankLoginPage extends BankLoginPage{

	@Override
	public void doLogin(String strName, String strBranch) {
		
		System.out.println("The holder name is :" +strName);
		System.out.println("The Branch name is :" +strBranch);
	}

	@Override
	public void loginCredentials(String strUserName, String strPassword) {
		
		System.out.println("The user name is :" +strUserName);
		System.out.println("The password name is :" +strPassword);
	}
}
