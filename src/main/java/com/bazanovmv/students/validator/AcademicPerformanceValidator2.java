package com.bazanovmv.students.validator;

import com.bazanovmv.students.model.AcademicPerformance;
import com.bazanovmv.students.repository.AcademicPerformanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;


@Component("beforeCreateStudentValidator")
public class AcademicPerformanceValidator2 implements Validator {

    @Autowired
    AcademicPerformanceRepository academicPerformanceRepository;

    public AcademicPerformanceValidator2(AcademicPerformanceRepository academicPerformanceRepository) {
        this.academicPerformanceRepository = academicPerformanceRepository;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return AcademicPerformance.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        AcademicPerformance ap = (AcademicPerformance) target;
        if(!academicPerformanceRepository.findById(ap.getId()).isPresent()){
            errors.rejectValue("performance", "performance.notExists");
        }
    }
}
