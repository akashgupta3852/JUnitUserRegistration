package com.bridgelabz.UserRegistrationTest;

import java.util.regex.Pattern;

public class UserRegistration 
{
	private static final String FIRST_NAME_PATTERN="^[A-Z][a-z]{2,}";
	private static final String LAST_NAME_PATTERN="^[A-Z][a-z]{2,}";
	private static final String EMAIL_ADDRESS_PATTERN="^[a-zA-Z0-9]+([+_.-][a-zA-Z0-9]+)*[@][a-zA-Z0-9]+[.][a-zA-Z]{2,4}([.][a-zA-Z]{2,4})?$";
	private static final String MOBILE_NUMBER_PATTERN="^[0-9]{2}[\\s]{1}[6-9][0-9]{9}$";
	
    public void printWelcome()
    {
        System.out.println( "Welcome to User Registration Problem with JUnit Testing" );
    }
    
    public boolean checkFirstName(String fName) {
    	Pattern pattern = Pattern.compile(FIRST_NAME_PATTERN);
    	return pattern.matcher(fName).matches();
    }
    
    public boolean checkLastName(String lName) {
    	Pattern pattern = Pattern.compile(LAST_NAME_PATTERN);
    	return pattern.matcher(lName).matches();
    }
    
    public boolean checkEmailAddress(String emailAddress) {
    	Pattern pattern = Pattern.compile(EMAIL_ADDRESS_PATTERN);
    	return pattern.matcher(emailAddress).matches();
    }
    
    public boolean checkMobileNumber(String mobileNumber) {
    	Pattern pattern = Pattern.compile(MOBILE_NUMBER_PATTERN);
    	return pattern.matcher(mobileNumber).matches();
    }
    
}
