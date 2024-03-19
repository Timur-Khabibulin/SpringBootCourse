package com.example.springbootcourse.validators;

import com.example.springbootcourse.annotations.DebitCardNumber;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.regex.Pattern;

public class DebitCardNumberValidator implements ConstraintValidator<DebitCardNumber, String> {
    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        var pattern = Pattern.compile("\\d{16}");
        return pattern.matcher(value).matches();
    }
}
