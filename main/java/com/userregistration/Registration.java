package com.userregistration;
import java.util.regex.Pattern;

public class Registration {
    public static final String NAME_PATTERN = "[A-Z][a-z]{3,}";
    public static final String EMAIL_PATTERN ="[a-z\\+\\-\\_\\.a-z0-9]{3,}\\@[a-z]*\\.[a-z]{1,3}\\.[a-z]{2,3}";
    public static final String MOBILE_NUMBER_PATTERN = "(\\+91)?[6-9]{1}[0-9]{9}";
    public static final String PASSWORD_RULE1_PATTERN = "[a-z]{8,}";
    public boolean firstNameValidation(String firstName){
        Pattern pattern = Pattern.compile(NAME_PATTERN);
        return pattern.matcher(firstName).matches();
    }
    public boolean lastNameValidation(String lastName){
        Pattern pattern = Pattern.compile(NAME_PATTERN);
        return pattern.matcher(lastName).matches();
    }
    public boolean emailValidation(String email){
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        return pattern.matcher(email).matches();
    }
    public boolean mobileNumberValidation(String number){
        Pattern pattern = Pattern.compile(MOBILE_NUMBER_PATTERN);
        return pattern.matcher(number).matches();
    }
    public boolean passwordRuleOneValidation(String password){
        Pattern pattern = Pattern.compile(PASSWORD_RULE1_PATTERN);
        return pattern.matcher(password).matches();
    }
}
