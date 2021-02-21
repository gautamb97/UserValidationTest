package com.userregistration;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EmailTest {
    @Test
    public void givenEmail_WhenProper_ShouldReturnTrue(){
        Registration validation = new Registration();
        boolean emailVerification = validation.emailValidation("gau_tam@edu.co.in");
        Assertions.assertEquals(true,emailVerification);
    }
    @Test
    public void givenEmail_WhenNotProper_ShouldReturnFalse(){
        Registration validation = new Registration();
        boolean emailVerification = validation.emailValidation("gau_tam@edu");
        Assertions.assertEquals(false,emailVerification);
    }
    @Test
    public void givenEmail_WhenNotProper_NotHavingAtTheRate_ShouldReturnFalse(){
        Registration validation = new Registration();
        boolean emailVerification = validation.emailValidation("gau_tam.gmail.com");
        Assertions.assertEquals(false,emailVerification);
    }
    @Test
    public void givenEmail_WhenNotProper_NotHavingDot_ShouldReturnTrue(){
        Registration validation = new Registration();
        boolean emailVerification = validation.emailValidation("gau_tam@educom");
        Assertions.assertEquals(false,emailVerification);
    }
    @Test
    public void givenEmail_WhenNotProper_NotStartWithCaps_ShouldReturnFalse(){
        Registration validation = new Registration();
        boolean emailVerification = validation.emailValidation("Gau_tam@edu.co.in");
        Assertions.assertEquals(false,emailVerification);
    }
    @Test
    public void givenEmail_WhenNotProper_NotHavingDomain_ShouldReturnFalse(){
        Registration validation = new Registration();
        boolean emailVerification = validation.emailValidation("gautam@");
        Assertions.assertEquals(false,emailVerification);
    }
}
