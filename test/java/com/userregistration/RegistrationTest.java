package com.userregistration;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RegistrationTest {
    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue(){
        Registration validation = new Registration();
        boolean firstName = validation.firstNameValidation("Gautam");
        Assertions.assertEquals(true,firstName);
    }
    @Test
    public void givenFirstName_WhenNotProper_ShouldReturnFalse(){
        Registration validation = new Registration();
        boolean firstName = validation.firstNameValidation("gautam");
        Assertions.assertEquals(false,firstName);
    }
    @Test
    public void givenFirstName_WhenNotProper_LessThanThreeChar_ShouldReturnFalse(){
        Registration validation = new Registration();
        boolean firstName = validation.firstNameValidation("Ga");
        Assertions.assertEquals(false,firstName);
    }
    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue(){
        Registration validation = new Registration();
        boolean lastName = validation.firstNameValidation("Biswal");
        Assertions.assertEquals(true,lastName);
    }
    @Test
    public void givenLastName_WhenNotProper_ShouldReturnFalse(){
        Registration validation = new Registration();
        boolean lastName = validation.lastNameValidation("biswal");
        Assertions.assertEquals(false,lastName);
    }
    @Test
    public void givenLastName_WhenNotProper_LessThanThreeChar_ShouldReturnFalse(){
        Registration validation = new Registration();
        boolean lastName = validation.lastNameValidation("Bi");
        Assertions.assertEquals(false,lastName);
    }
    @Test
    public void givenMobileNumber_WhenProper_ShouldReturnTrue(){
        Registration validation = new Registration();
        boolean mobileNumber = validation.mobileNumberValidation("+919754321234");
        Assertions.assertEquals(true,mobileNumber);
    }
    @Test
    public void givenMobileNumber_WhenNotProper_ShouldReturnFalse(){
        Registration validation = new Registration();
        boolean mobileNumber = validation.mobileNumberValidation("87908765");
        Assertions.assertEquals(false,mobileNumber);
    }
    @Test
    public void givenPasswordRule1_WhenProper_ShouldReturnTrue(){
        Registration validation = new Registration();
        boolean password = validation.passwordRuleOneValidation("abcdefgh");
        Assertions.assertEquals(true,password);
    }
    @Test
    public void givenPasswordRule1_WhenNotProper_ShouldReturnFalse(){
        Registration validation = new Registration();
        boolean password = validation.mobileNumberValidation("abcnd");
        Assertions.assertEquals(false,password);
    }
}
