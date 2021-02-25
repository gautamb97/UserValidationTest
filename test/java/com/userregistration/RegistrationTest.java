package com.userregistration;
import org.junit.Assert;
import org.junit.Test;

public class RegistrationTest {
    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue(){
        Registration validation = new Registration();
        boolean firstName = false;
        try {
            firstName = validation.firstNameValidation("Gautam");
        } catch (UserValidationException e) {
        }
        Assert.assertEquals(true,firstName);
    }
    @Test
    public void givenFirstName_WhenNotProper_ShouldReturnFalse(){
        Registration validation = new Registration();
        boolean firstName = false;
        try {
            firstName = validation.firstNameValidation("gautam");
        } catch (UserValidationException e) {
        }
        Assert.assertEquals(false,firstName);
    }
    @Test
    public void givenFirstName_WhenNotProper_LessThanThreeChar_ShouldReturnFalse(){
        Registration validation = new Registration();
        boolean firstName = false;
        try {
            firstName = validation.firstNameValidation("Ga");
        } catch (UserValidationException e) {
        }
        Assert.assertEquals(false,firstName);
    }
    @Test
    public void givenFirstName_WhenNotProper_ShouldThrowException(){
        Registration validation = new Registration();
        try {
            validation.firstNameValidation("gautam");
        } catch (UserValidationException e) {
            Assert.assertEquals("Invalid Input Details Should have One Cap and Min. Three Char",e.getMessage());
        }
    }
    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue(){
        Registration validation = new Registration();
        boolean lastName = false;
        try {
            lastName = validation.lastNameValidation("Biswal");
        } catch (UserValidationException e) {
        }
        Assert.assertEquals(true,lastName);
    }
    @Test
    public void givenLastName_WhenNotProper_ShouldReturnFalse(){
        Registration validation = new Registration();
        boolean lastName = false;
        try {
            lastName = validation.lastNameValidation("biswal");
        } catch (UserValidationException e) {
        }
        Assert.assertEquals(false,lastName);
    }
    @Test
    public void givenLastName_WhenNotProper_LessThanThreeChar_ShouldReturnFalse(){
        Registration validation = new Registration();
        boolean lastName = false;
        try {
            lastName = validation.lastNameValidation("Bi");
        } catch (UserValidationException e) {
        }
        Assert.assertEquals(false,lastName);
    }
    @Test
    public void givenLastName_WhenNotProper_ShouldThrowException(){
        Registration validation = new Registration();
        try {
            validation.lastNameValidation("biswal");
        } catch (UserValidationException e) {
            Assert.assertEquals("Invalid Input Details Should have One Cap and Min. Three Char",e.getMessage());
        }
    }
    @Test
    public void givenMobileNumber_WhenProper_ShouldReturnTrue(){
        Registration validation = new Registration();
        boolean mobileNumber = false;
        try {
            mobileNumber = validation.mobileNumberValidation("+919754321234");
        } catch (UserValidationException e) {
        }
        Assert.assertEquals(true,mobileNumber);
    }
    @Test
    public void givenMobileNumber_WhenNotProper_ShouldReturnFalse(){
        Registration validation = new Registration();
        boolean mobileNumber = false;
        try {
            mobileNumber = validation.mobileNumberValidation("87908765");
        } catch (UserValidationException e) {
        }
        Assert.assertEquals(false,mobileNumber);
    }
    @Test
    public void givenMobileNumber_WhenNotProper_ShouldThrowException(){
        Registration validation = new Registration();
        try {
            validation.mobileNumberValidation("+919754321234");
        } catch (UserValidationException e) {
            Assert.assertEquals("Invalid mobile number should contain 10 digit with proper",e.getMessage());
        }
    }
    @Test
    public void givenPasswordRule_WhenProper_ShouldReturnTrue(){
        Registration validation = new Registration();
        boolean password = false;
        try {
            password = validation.passwordRuleValidation("A1#cdefgh");
        } catch (UserValidationException e) {
        }
        Assert.assertEquals(true,password);
    }
    @Test
    public void givenPasswordRule_WhenNotProper_ShouldReturnFalse(){
        Registration validation = new Registration();
        boolean password = false;
        try {
            password = validation.passwordRuleValidation("ab1Cnd");
        } catch (UserValidationException e) {
        }
        Assert.assertEquals(false,password);
    }
    @Test
    public void givenPasswordRule_WhenNotProper_ShouldThrowException(){
        Registration validation = new Registration();
        try {
            validation.passwordRuleValidation("ab1Cnd");
        } catch (UserValidationException e) {
            Assert.assertEquals("Invalid Input Password should contain one numeric,one caps,and one special char",e.getMessage());
        }
    }
}
