/*
package com.bazanovmv.students.validator;

import com.bazanovmv.students.repository.AcademicPerformanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class AcademicPerformanceValidator implements Validator {

    @Autowired
    AcademicPerformanceRepository academicPerformanceRepository;

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {

    }
}
*/

package com.bazanovmv.students.validator;

import com.bazanovmv.students.model.AcademicPerformance;
import com.bazanovmv.students.repository.AcademicPerformanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.lang.annotation.Annotation;

public class AcademicPerformanceValidator implements ConstraintValidator<AcademicPerformanceExists, Long> {

    //@Autowired
    AcademicPerformanceRepository academicPerformanceRepository;

    @Override
    public boolean isValid(Long id, ConstraintValidatorContext constraintValidatorContext) {
        return academicPerformanceRepository.findById(id).isPresent();
    }

    @Override
    public void initialize(AcademicPerformanceExists constraintAnnotation) {

    }

  /*
    @Override
    public boolean supports(Class<?> clazz) {
        return AcademicPerformance.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {

        academicPerformanceRepository.findById(target.id)
    }*/
}
