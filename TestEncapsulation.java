package com.vstl.oopsEncapsulation;

public class TestEncapsulation {

	public static void main(String[] args) {

		FaceBook objFaceBook = new FaceBook();
		objFaceBook.setStrUrl("https://www.facebook.com/");
		System.out.println("URL :" +objFaceBook.getStrUrl());
		
		objFaceBook.setStrFirstName("Rani");
		System.out.println("First Name :" +objFaceBook.getStrFirstName());
		
		objFaceBook.setStrLastName("Mukarji");
		System.out.println("Last Name :" +objFaceBook.getStrLastName());
		
		objFaceBook.setStrMobileNumber("7353556896");
		System.out.println("Mobile Number :" +objFaceBook.getStrMobileNumber());
		
		objFaceBook.setStrPassword("Rani@123");
		System.out.println("Password :" +objFaceBook.getStrPassword());
		
		objFaceBook.setIntDateOfBirth(1998);
		System.out.println("Date of birth :" +objFaceBook.getIntDateOfBirth());
		
		objFaceBook.setStrGender("Female");
		System.out.println("Gender :" +objFaceBook.getStrGender());		
	}
}





