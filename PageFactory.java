package com.vstl.oopsAbstractionExample;

public class PageFactory {

	public static BankLoginPage objBankLoginPage = null;
	
	public static String strBankDetails = "HDFCBank";
	
	public static BankLoginPage getobjBankLoginPage() {
		if(strBankDetails.equals("HDFCBank")) {
			objBankLoginPage = new HDFCBankLoginPage();			
		}
		else if(strBankDetails.equals("ICICBank")){
			objBankLoginPage = new ICICBankLoginPage();
		}
		return objBankLoginPage;
	}
	
	
	public static String objBankLogin = "ICICBank" ;
	
	public static BankLoginPage getobjBankLogin() {
		if(objBankLogin.equals("ICICBank")) {
			objBankLoginPage = new ICICBankLoginPage();			
		}
		else if(objBankLogin.equals("HDFCBank")){
			objBankLoginPage = new HDFCBankLoginPage();
		}
		return objBankLoginPage;
        }
}
