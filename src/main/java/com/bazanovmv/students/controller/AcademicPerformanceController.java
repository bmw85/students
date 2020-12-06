package com.bazanovmv.students.controller;

import com.bazanovmv.students.exception.AcademicPerformanceNotFoundException;
import com.bazanovmv.students.model.AcademicPerformance;
import com.bazanovmv.students.repository.AcademicPerformanceRepository;
import org.springframework.web.bind.annotation.*;

@RestController
public class AcademicPerformanceController {
    private final AcademicPerformanceRepository repository;

    AcademicPerformanceController(AcademicPerformanceRepository repository) {
        this.repository = repository;
    }

    @PutMapping("/performance/{id}")
    AcademicPerformance replaceAcademicPerformance(@RequestBody AcademicPerformance newAcademicPerformance, @PathVariable Long id) {

        return repository.findById(id)
                .map(academicPerformance -> {
                    academicPerformance.setText(newAcademicPerformance.getText());
                    return repository.save(academicPerformance);
                })
                .orElseThrow(() -> new AcademicPerformanceNotFoundException(id));
    }

    @DeleteMapping("/performance/{id}")
    void deleteEmployee(@PathVariable Long id) {
        repository.deleteById(id);
    }

}
