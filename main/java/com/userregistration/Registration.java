package com.userregistration;
import java.util.regex.Pattern;

@FunctionalInterface
interface RegistrationValidation{
    boolean inputValidation(String pattern, String name);
        }
public class Registration {
    public static final String NAME_PATTERN = "[A-Z][a-z]{3,}";
    public static final String EMAIL_PATTERN ="[a-z\\+\\-\\_\\.a-z0-9]{3,}\\@[a-z]*\\.[a-z]{1,3}\\.[a-z]{2,3}";
    public static final String MOBILE_NUMBER_PATTERN = "(\\+91)?[6-9]{1}[0-9]{9}";
    public static final String PASSWORD_RULE4_PATTERN = "(?=.*[A-Z])(?=.*[0-9])(?=.*\\W)[a-zA-Z0-9\\#]{8,}";

    RegistrationValidation validation = (String pattern, String name) ->  Pattern.matches(pattern, name);

    public boolean firstNameValidation(String firstName) throws UserValidationException {
        try {
            return validation.inputValidation(NAME_PATTERN, firstName);
        }catch(Exception e) {
            throw new UserValidationException("Invalid Input Details Should have One Cap and Min. Three Char");
        }
    }
    public boolean lastNameValidation(String lastName) throws UserValidationException {
        try {
            return validation.inputValidation(NAME_PATTERN, lastName);
        }catch(Exception e) {
            throw new UserValidationException("Invalid Input Details Should have One Cap and Min. Three Char");
        }
    }
    public boolean emailValidation(String email) throws UserValidationException {
        try {
            return validation.inputValidation(EMAIL_PATTERN,email);
        }catch(Exception e) {
            throw new UserValidationException("Invalid Entered email id format");
        }
    }
    public boolean mobileNumberValidation(String number) throws UserValidationException {
        try {
            return validation.inputValidation(MOBILE_NUMBER_PATTERN, number);
        }catch(Exception e) {
            throw new UserValidationException("Invalid mobile number should contain 10 digit with proper");
        }
    }
    public boolean passwordRuleValidation(String password) throws UserValidationException {
        try {
            return validation.inputValidation(PASSWORD_RULE4_PATTERN, password);
        }catch(Exception e) {
            throw new UserValidationException("Invalid Input Password should contain one numeric,one caps,and one special char");
        }
    }
}
