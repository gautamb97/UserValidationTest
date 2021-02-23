package com.userregistration;
import org.junit.Assert;
import org.junit.Test;

public class RegistrationTest {
    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue(){
        Registration validation = new Registration();
        boolean firstName = validation.firstNameValidation("Gautam");
        Assert.assertEquals(true,firstName);
    }
    @Test
    public void givenFirstName_WhenNotProper_ShouldReturnFalse(){
        Registration validation = new Registration();
        boolean firstName = validation.firstNameValidation("gautam");
        Assert.assertEquals(false,firstName);
    }
    @Test
    public void givenFirstName_WhenNotProper_LessThanThreeChar_ShouldReturnFalse(){
        Registration validation = new Registration();
        boolean firstName = validation.firstNameValidation("Ga");
        Assert.assertEquals(false,firstName);
    }
    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue(){
        Registration validation = new Registration();
        boolean lastName = validation.firstNameValidation("Biswal");
        Assert.assertEquals(true,lastName);
    }
    @Test
    public void givenLastName_WhenNotProper_ShouldReturnFalse(){
        Registration validation = new Registration();
        boolean lastName = validation.lastNameValidation("biswal");
        Assert.assertEquals(false,lastName);
    }
    @Test
    public void givenLastName_WhenNotProper_LessThanThreeChar_ShouldReturnFalse(){
        Registration validation = new Registration();
        boolean lastName = validation.lastNameValidation("Bi");
        Assert.assertEquals(false,lastName);
    }
    @Test
    public void givenMobileNumber_WhenProper_ShouldReturnTrue(){
        Registration validation = new Registration();
        boolean mobileNumber = validation.mobileNumberValidation("+919754321234");
        Assert.assertEquals(true,mobileNumber);
    }
    @Test
    public void givenMobileNumber_WhenNotProper_ShouldReturnFalse(){
        Registration validation = new Registration();
        boolean mobileNumber = validation.mobileNumberValidation("87908765");
        Assert.assertEquals(false,mobileNumber);
    }
    @Test
    public void givenPasswordRule_WhenProper_ShouldReturnTrue(){
        Registration validation = new Registration();
        boolean password = validation.passwordRuleValidation("A1#cdefgh");
        Assert.assertEquals(true,password);
    }
    @Test
    public void givenPasswordRule_WhenNotProper_ShouldReturnFalse(){
        Registration validation = new Registration();
        boolean password = validation.passwordRuleValidation("ab1Cnd");
        Assert.assertEquals(false,password);
    }
}
