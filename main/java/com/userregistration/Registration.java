package com.userregistration;
import java.util.regex.Pattern;

public class Registration {
    public static final String NAME_PATTERN = "[A-Z][a-z]{3,}";
    public static final String EMAIL_PATTERN ="[a-z\\+\\-\\_\\.a-z0-9]{3,}\\@[a-z]*\\.[a-z]{1,3}\\.[a-z]{2,3}";
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
}
