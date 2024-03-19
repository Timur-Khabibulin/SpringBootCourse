package com.example.springbootcourse.annotations;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

import java.lang.annotation.*;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@NotNull(message = "Value should not be null")
@Min(value = 0, message = "Value should be more than 0")
@Max(value = 100, message = "Value should be less than 100")
@Constraint(validatedBy = {})
@Documented
public @interface MyValidationAnnotation {
    String message() default "{Value is invalid}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
