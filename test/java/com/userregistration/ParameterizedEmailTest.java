package com.userregistration;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;


@RunWith(Parameterized.class)
public class ParameterizedEmailTest {
    public String emailVerifying;
    public boolean expectedResult;

    public ParameterizedEmailTest(String emailVerifying, boolean expectedResult){
        this.emailVerifying = emailVerifying;
        this.expectedResult = expectedResult;
    }
    @Parameters
    public static Collection sampleEmailsData(){
        return Arrays.asList(new Object[][]{{ "abc.100@abc.com.au",true},{"abc@abc@gmail.com",false},
                {"abc@gmail.com.1a",false},{"abc_abc123@gmail.co.in",true}});
    }
    @Test
    public void givenSampleEmails_WhenProper_ShouldReturnTrue(){
        Registration validation = new Registration();
        boolean emailVerification = validation.emailValidation(this.emailVerifying);
        Assert.assertEquals(this.expectedResult,emailVerification);
    }
    @Test
    public void givenSampleEmails_WhenNotProper_ShouldReturnFalse(){
        Registration validation = new Registration();
        boolean emailVerification = validation.emailValidation(this.emailVerifying);
        Assert.assertEquals(this.expectedResult,emailVerification);
    }
}
