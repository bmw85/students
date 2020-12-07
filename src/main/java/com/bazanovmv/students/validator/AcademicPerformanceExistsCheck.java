package com.bazanovmv.students.validator;

import com.bazanovmv.students.repository.AcademicPerformanceRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class AcademicPerformanceExistsCheck implements ConstraintValidator<AcademicPerformanceExistsValidator3, Long> {

    @Autowired
    AcademicPerformanceRepository academicPerformanceRepository;

    @Override
    public boolean isValid(Long value, ConstraintValidatorContext context) {
        return academicPerformanceRepository.findById(value) != null;
    }

    @Override
    public void initialize(AcademicPerformanceExistsValidator3 constraintAnnotation) {

    }
}
/*
package com.therealdanvega.validator;

        import com.therealdanvega.City;

        import javax.validation.ConstraintValidator;
        import javax.validation.ConstraintValidatorContext;

public class StateValidatorCheck implements ConstraintValidator<StateValidator, String> {

    private String state;

    @Override
    public void initialize(StateValidator constraint) {
        this.state = constraint.value();
    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        if( s.equalsIgnoreCase( this.state ))
            return true;

        return false;
    }
}*/
