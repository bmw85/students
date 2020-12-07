package com.bazanovmv.students.validator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = AcademicPerformanceExistsCheck.class)
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface AcademicPerformanceExistsValidator3 {
    String message() default "AcademicPerformance not exists";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};

}


/*package com.therealdanvega.validator;

        import javax.validation.Constraint;
        import javax.validation.Payload;
        import java.lang.annotation.Documented;
        import java.lang.annotation.Retention;
        import java.lang.annotation.Target;

        import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
        import static java.lang.annotation.ElementType.FIELD;
        import static java.lang.annotation.ElementType.METHOD;
        import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Documented
@Constraint(validatedBy = StateValidatorCheck.class)
@Target({ METHOD, FIELD, ANNOTATION_TYPE })
@Retention(RUNTIME)
public @interface StateValidator {
    String message() default "{com.therealdanvega.state.message}";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
    String value() default "";
}*/

/*
package javax.validation.constraints;
        import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
        import static java.lang.annotation.ElementType.CONSTRUCTOR;
        import static java.lang.annotation.ElementType.FIELD;
        import static java.lang.annotation.ElementType.METHOD;
        import static java.lang.annotation.ElementType.PARAMETER;
        import static java.lang.annotation.ElementType.TYPE_USE;
        import static java.lang.annotation.RetentionPolicy.RUNTIME;

        import java.lang.annotation.Documented;
        import java.lang.annotation.Repeatable;
        import java.lang.annotation.Retention;
        import java.lang.annotation.Target;

        import javax.validation.Constraint;
        import javax.validation.Payload;
        import javax.validation.constraints.NotBlank.List;

@Documented
@Constraint(validatedBy = { })
@Target({ METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER, TYPE_USE })
@Retention(RUNTIME)
@Repeatable(javax.validation.constraints.NotBlank.List.class)
public @interface NotBlank {

    String message() default "{javax.validation.constraints.NotBlank.message}";

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };

    */
/**
     * Defines several {@code @NotBlank} constraints on the same element.
     *
     * @see javax.validation.constraints.NotBlank
     *//*

    @Target({ METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER, TYPE_USE })
    @Retention(RUNTIME)
    @Documented
    public @interface List {
        javax.validation.constraints.NotBlank[] value();
    }
}
*/
