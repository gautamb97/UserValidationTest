package com.userregistration;
import java.util.regex.Pattern;

public class Registration {
    public static final String NAME_PATTERN = "[A-Z][a-z]{3,}";
    public boolean firstNameValidation(String firstName){
        Pattern pattern = Pattern.compile(NAME_PATTERN);
        return pattern.matcher(firstName).matches();
    }
    public boolean lastNameValidation(String lastName){
        Pattern pattern = Pattern.compile(NAME_PATTERN);
        return pattern.matcher(lastName).matches();
    }
}
