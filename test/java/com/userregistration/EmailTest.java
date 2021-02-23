package com.userregistration;
import org.junit.Assert;
import org.junit.Test;

public class EmailTest {
   @Test
    public void givenEmail_WhenProper_ShouldReturnTrue(){
        Registration validation = new Registration();
        boolean emailVerification = validation.emailValidation("gau_tam@edu.co.in");
        Assert.assertEquals(true,emailVerification);
    }
    @Test
    public void givenEmail_WhenNotProper_ShouldReturnFalse(){
        Registration validation = new Registration();
        boolean emailVerification = validation.emailValidation("gau_tam@edu");
        Assert.assertEquals(false,emailVerification);
    }
    @Test
    public void givenEmail_WhenNotProper_NotHavingAtTheRate_ShouldReturnFalse(){
        Registration validation = new Registration();
        boolean emailVerification = validation.emailValidation("gau_tam.gmail.com");
        Assert.assertEquals(false,emailVerification);
    }
    @Test
    public void givenEmail_WhenNotProper_NotHavingDot_ShouldReturnTrue(){
        Registration validation = new Registration();
        boolean emailVerification = validation.emailValidation("gau_tam@educom");
        Assert.assertEquals(false,emailVerification);
    }
    @Test
    public void givenEmail_WhenNotProper_NotStartWithCaps_ShouldReturnFalse(){
        Registration validation = new Registration();
        boolean emailVerification = validation.emailValidation("Gau_tam@edu.co.in");
        Assert.assertEquals(false,emailVerification);
    }
    @Test
    public void givenEmail_WhenNotProper_NotHavingDomain_ShouldReturnFalse(){
        Registration validation = new Registration();
        boolean emailVerification = validation.emailValidation("gautam@");
        Assert.assertEquals(false,emailVerification);
    }
}
