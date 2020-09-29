package com.bridgelabz.UserRegistrationTest;

import java.util.regex.Pattern;

public class UserRegistration 
{
	private static final String FIRST_NAME_PATTERN="^[A-Z][a-z]{2,}";
	private static final String LAST_NAME_PATTERN="^[A-Z][a-z]{2,}";
	
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
    
}
