package com.bazanovmv.students.validator;

import com.bazanovmv.students.model.AcademicPerformance;
import com.bazanovmv.students.repository.AcademicPerformanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

//@Service
//@Component
public class AcademicPerformanceValidator implements ConstraintValidator<AcademicPerformanceExistsValidator, AcademicPerformance> {
    @Autowired
    private AcademicPerformanceRepository academicPerformanceRepository;

    @Override
    public void initialize(AcademicPerformanceExistsValidator constraintAnnotation) {
    }

    @Override
    public boolean isValid(AcademicPerformance value, ConstraintValidatorContext context) {
//        return true;
        return academicPerformanceRepository
                .findById(value.getId())
                .map((ap) -> ap.equals(value))
                .orElseGet(() -> false);
    }

}
