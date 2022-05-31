package com.vstl.oopsEncapsulation;

public class FaceBook {

	//Encapsulation:- wrapping code and data together into a single unit.
	//User can create fully encapsulation class by making all the data member of class private. 
	// Use setter & getter methods to set and get data in it.
	//usage:- *By providing setter getter you can make class read and write.
	//*It provides you the control over the data.
	//*We can achieve data hiding Bcz other class will not able to access the data through private data members.
			
	  private String strUrl = " ";
	  private String strFirstName = " ";
	  private String strLastName = " ";
	  private String strMobileNumber = " ";
	  private String strPassword = " ";
	  private int intDateOfBirth = 1998;
	  private String strGender = " ";
	
	public String getStrUrl() {
		return strUrl;
	}
	public void setStrUrl(String strUrl) {
		this.strUrl = strUrl;
	}
	public String getStrFirstName() {
		return strFirstName;
	}
	public void setStrFirstName(String strFirstName) {
		this.strFirstName = strFirstName;
	}
	public String getStrLastName() {
		return strLastName;
	}
	public void setStrLastName(String strLastName) {
		this.strLastName = strLastName;
	}
	public String getStrMobileNumber() {
		return strMobileNumber;
	}
	public void setStrMobileNumber(String strMobileNumber) {
		this.strMobileNumber = strMobileNumber;
	}
	public String getStrPassword() {
		return strPassword;
	}
	public void setStrPassword(String strPassword) {
		this.strPassword = strPassword;
	}
	public int getIntDateOfBirth() {
		return intDateOfBirth;
	}
	public void setIntDateOfBirth(int intDateOfBirth) {
		this.intDateOfBirth = intDateOfBirth;
	}
	public String getStrGender() {
		return strGender;
	}
	public void setStrGender(String strGender) {
		this.strGender = strGender;
	}	
}


