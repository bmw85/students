package com.bazanovmv.students.validator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({ FIELD })
@Retention(RUNTIME)
@Constraint(validatedBy = AcademicPerformanceValidator.class)
@Documented
public @interface AcademicPerformanceExists {

    String message() default "{AcademicPerformance.invalid}";

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };

}



/*
package com.bazanovmv.students.validator;

import org.hibernate.annotations.Target;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = AcademicPerformanceValidator.class)
public @interface AcademicPerformanceExists {
    String message() default "{com.bazanovmv.validator.AcademicPerformanceExists.message}";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};

}

*/
