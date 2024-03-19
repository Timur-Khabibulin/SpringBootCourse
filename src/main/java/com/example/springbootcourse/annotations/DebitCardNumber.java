package com.example.springbootcourse.annotations;

import com.example.springbootcourse.validators.DebitCardNumberValidator;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = DebitCardNumberValidator.class)
@Documented
public @interface DebitCardNumber {
    String message() default "{Debit card number is invalid}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
