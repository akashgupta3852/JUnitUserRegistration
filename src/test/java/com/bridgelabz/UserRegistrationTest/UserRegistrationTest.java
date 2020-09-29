package com.bridgelabz.UserRegistrationTest;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple UserRegistration.
 */
public class UserRegistrationTest {
	
	@Test
	public void givenFirstName_WhenProper_ShouldReturnTrue() {
		UserRegistration userRegistration =  new UserRegistration();
		boolean result = userRegistration.checkFirstName("Akash");
		Assert.assertEquals(true,result);
	}
	
	@Test
	public void givenFirstName_WhenWithSpChars_ShouldReturnFalse() {
		UserRegistration userRegistration =  new UserRegistration();
		boolean result = userRegistration.checkFirstName("Ak@sh");
		Assert.assertEquals(false,result);
	}
	
	@Test
	public void givenFirstName_WhenShort_ShouldReturnFalse() {
		UserRegistration userRegistration =  new UserRegistration();
		boolean result = userRegistration.checkFirstName("Ak");
		Assert.assertEquals(false,result);
	}
	
	@Test
	public void givenFirstName_WhenWithNumericChars_ShouldReturnFalse() {
		UserRegistration userRegistration =  new UserRegistration();
		boolean result = userRegistration.checkFirstName("Akash123");
		Assert.assertEquals(false,result);
	}	
	
	@Test
	public void givenLastName_WhenProper_ShouldReturnTrue() {
		UserRegistration userRegistration =  new UserRegistration();
		boolean result = userRegistration.checkLastName("Gupta");
		Assert.assertEquals(true,result);
	}
	
	@Test
	public void givenLastName_WhenWithSpChars_ShouldReturnFalse() {
		UserRegistration userRegistration =  new UserRegistration();
		boolean result = userRegistration.checkLastName("Gupt@");
		Assert.assertEquals(false,result);
	}
	
	@Test
	public void givenLastName_WhenShort_ShouldReturnFalse() {
		UserRegistration userRegistration =  new UserRegistration();
		boolean result = userRegistration.checkLastName("Gu");
		Assert.assertEquals(false,result);
	}
	
	@Test
	public void givenLastName_WhenWithNumericChars_ShouldReturnFalse() {
		UserRegistration userRegistration =  new UserRegistration();
		boolean result = userRegistration.checkLastName("Gupta123");
		Assert.assertEquals(false,result);
	}	
}