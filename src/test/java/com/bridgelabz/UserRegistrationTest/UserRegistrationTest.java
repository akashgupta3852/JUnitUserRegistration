package com.bridgelabz.UserRegistrationTest;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple UserRegistration.
 */
public class UserRegistrationTest {
	
	@Test
	public void givenFirstName_WhenProper_ShouldReturnTrue() {
		UserRegistration userRegistration =  new UserRegistration("Akash","Gupta","akashgupta3852@gmail.com","91 9559473852","AS@#A7123");
		boolean result = userRegistration.checkFirstName(userRegistration.firstName);
		Assert.assertEquals(true,result);
	}
	
	@Test
	public void givenFirstName_WhenWithSpChars_ShouldReturnFalse() {
		UserRegistration userRegistration =  new UserRegistration("Ak@sh","Gupta","akashgupta3852@gmail.com","91 9559473852","AS@#A7123");
		boolean result = userRegistration.checkFirstName(userRegistration.firstName);
		Assert.assertEquals(false,result);
	}
	
	@Test
	public void givenFirstName_WhenShort_ShouldReturnFalse() {
		UserRegistration userRegistration =  new UserRegistration("Ak","Gupta","akashgupta3852@gmail.com","91 9559473852","AS@#A7123");
		boolean result = userRegistration.checkFirstName(userRegistration.firstName);
		Assert.assertEquals(false,result);
	}
	
	@Test
	public void givenFirstName_WhenWithNumericChars_ShouldReturnFalse() {
		UserRegistration userRegistration =  new UserRegistration("Akash123","Gupta","akashgupta3852@gmail.com","91 9559473852","AS@#A7123");
		boolean result = userRegistration.checkFirstName(userRegistration.firstName);
		Assert.assertEquals(false,result);
	}	
	
	@Test
	public void givenLastName_WhenProper_ShouldReturnTrue() {
		UserRegistration userRegistration =  new UserRegistration("Akash","Gupta","akashgupta3852@gmail.com","91 9559473852","AS@#A7123");
		boolean result = userRegistration.checkLastName(userRegistration.lastName);
		Assert.assertEquals(true,result);
	}
	
	@Test
	public void givenLastName_WhenWithSpChars_ShouldReturnFalse() {
		UserRegistration userRegistration =  new UserRegistration("Akash","Gupt@","akashgupta3852@gmail.com","91 9559473852","AS@#A7123");
		boolean result = userRegistration.checkLastName(userRegistration.lastName);
		Assert.assertEquals(false,result);
	}
	
	@Test
	public void givenLastName_WhenShort_ShouldReturnFalse() {
		UserRegistration userRegistration =  new UserRegistration("Akash","Gu","akashgupta3852@gmail.com","91 9559473852","AS@#A7123");
		boolean result = userRegistration.checkLastName(userRegistration.lastName);
		Assert.assertEquals(false,result);
	}
	
	@Test
	public void givenLastName_WhenWithNumericChars_ShouldReturnFalse() {
		UserRegistration userRegistration =  new UserRegistration("Akash","Gupta123","akashgupta3852@gmail.com","91 9559473852","AS@#A7123");
		boolean result = userRegistration.checkLastName(userRegistration.lastName);
		Assert.assertEquals(false,result);
	}	
	
	@Test
	public void givenEmailAddress_WhenProper_ShouldReturnTrue() {
		UserRegistration userRegistration =  new UserRegistration("Akash","Gupta","akashgupta3852@gmail.com","91 9559473852","AS@#A7123");
		boolean result = userRegistration.checkEmailAddress(userRegistration.emailId);
		Assert.assertEquals(true,result);
	}
	
	@Test
	public void givenEmailAddress_WhenNotProper_ShouldReturnFalse() {
		UserRegistration userRegistration =  new UserRegistration("Akash","Gupta","akashgupta3852@gmail..com","91 9559473852","AS@#A7123");
		boolean result = userRegistration.checkEmailAddress(userRegistration.emailId);
		Assert.assertEquals(false,result);
	}
	
	@Test
	public void givenMobileNumber_WhenProper_ShouldReturnTrue() {
		UserRegistration userRegistration =  new UserRegistration("Akash","Gupta","akashgupta3852@gmail.com","91 9559473852","AS@#A7123");
		boolean result = userRegistration.checkMobileNumber(userRegistration.mobileNum);
		Assert.assertEquals(true,result);
	}
	
	@Test
	public void givenMobileNumber_WhenNotProper_ShouldReturnFalse() {
		UserRegistration userRegistration =  new UserRegistration("Akash","Gupta","akashgupta3852@gmail.com","91 955947385","AS@#A7123");
		boolean result = userRegistration.checkMobileNumber(userRegistration.mobileNum);
		Assert.assertEquals(false,result);
	}
	
	@Test
	public void givenPassword_WhenProper_ShouldReturnTrue() {
		UserRegistration userRegistration =  new UserRegistration("Akash","Gupta","akashgupta3852@gmail.com","91 9559473852","AbZWcKfghw854asfgdh@");
		boolean result = userRegistration.checkPassword(userRegistration.password);
		Assert.assertEquals(true,result);
	}
	
	@Test
	public void givenPassword_WhenShort_ShouldReturnFalse() {
		UserRegistration userRegistration =  new UserRegistration("Akash","Gupta","akashgupta3852@gmail.com","91 9559473852","Abch$67");
		boolean result = userRegistration.checkPassword(userRegistration.password);
		Assert.assertEquals(false,result);
	}
	
	@Test
	public void givenPassword_WhenNotProper_ShouldReturnFalse() {
		UserRegistration userRegistration =  new UserRegistration("Akash","Gupta","akashgupta3852@gmail.com","91 9559473852","13213HGGSAabcdHIdffgh");
		boolean result = userRegistration.checkPassword(userRegistration.password);
		Assert.assertEquals(false,result);
	}

}