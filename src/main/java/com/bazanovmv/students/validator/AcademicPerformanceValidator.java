package com.bazanovmv.students.validator;

import com.bazanovmv.students.model.AcademicPerformance;
import com.bazanovmv.students.repository.AcademicPerformanceRepository;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class AcademicPerformanceValidator implements ConstraintValidator<AcademicPerformanceExistsValidator, AcademicPerformance> {

    private AcademicPerformanceRepository academicPerformanceRepository;

    public AcademicPerformanceValidator(AcademicPerformanceRepository academicPerformanceRepositoryRepository) {
        this.academicPerformanceRepository = academicPerformanceRepositoryRepository;
    }

    @Override
    public void initialize(AcademicPerformanceExistsValidator constraintAnnotation) {

    }

    @Override
    public boolean isValid(AcademicPerformance value, ConstraintValidatorContext context) {
//        return true;
        return academicPerformanceRepository
                .findById(value.getId())
                .map((ap) -> ap.equals(value))
                .orElseGet(() -> false) ;
    }

}
