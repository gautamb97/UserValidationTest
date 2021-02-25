package com.userregistration;
import org.junit.Assert;
import org.junit.Test;

public class EmailTest {
   @Test
    public void givenEmail_WhenProper_ShouldReturnTrue(){
        Registration validation = new Registration();
       boolean emailVerification = false;
       try {
           emailVerification = validation.emailValidation("gau_tam@edu.co.in");
       } catch (UserValidationException e) {
       }
       Assert.assertEquals(true,emailVerification);
    }
    @Test
    public void givenEmail_WhenNotProper_ShouldReturnFalse(){
        Registration validation = new Registration();
        boolean emailVerification = false;
        try {
            emailVerification = validation.emailValidation("gau_tam@edu");
        } catch (UserValidationException e) {
        }
        Assert.assertEquals(false,emailVerification);
    }
    @Test
    public void givenEmail_WhenNotProper_NotHavingAtTheRate_ShouldReturnFalse(){
        Registration validation = new Registration();
        boolean emailVerification = false;
        try {
            emailVerification = validation.emailValidation("gau_tam.gmail.com");
        } catch (UserValidationException e) {
        }
        Assert.assertEquals(false,emailVerification);
    }
    @Test
    public void givenEmail_WhenNotProper_NotHavingDot_ShouldReturnTrue(){
        Registration validation = new Registration();
        boolean emailVerification = false;
        try {
            emailVerification = validation.emailValidation("gau_tam@educom");
        } catch (UserValidationException e) {
        }
        Assert.assertEquals(false,emailVerification);
    }
    @Test
    public void givenEmail_WhenNotProper_NotStartWithCaps_ShouldReturnFalse(){
        Registration validation = new Registration();
        boolean emailVerification = false;
        try {
            emailVerification = validation.emailValidation("Gau_tam@edu.co.in");
        } catch (UserValidationException e) {
        }
        Assert.assertEquals(false,emailVerification);
    }
    @Test
    public void givenEmail_WhenNotProper_NotHavingDomain_ShouldReturnFalse(){
        Registration validation = new Registration();
        boolean emailVerification = false;
        try {
            emailVerification = validation.emailValidation("gautam@");
        } catch (UserValidationException e) {
        }
        Assert.assertEquals(false,emailVerification);
    }
    @Test
    public void givenEmail_WhenNotProper_ShouldThrowException(){
        Registration validation = new Registration();
        try {
            validation.emailValidation("gautam@");
        } catch (UserValidationException e) {
            Assert.assertEquals("Invalid Entered email id format",e.getMessage());
        }
    }
}
