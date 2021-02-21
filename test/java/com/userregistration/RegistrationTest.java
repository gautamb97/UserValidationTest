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
}
