package com.bazanovmv.students.validator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = AcademicPerformanceValidator.class)
@Target({ElementType.FIELD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface AcademicPerformanceExistsValidator {
    String message() default "AcademicPerformance not exists";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};

}