package com.bazanovmv.students.exception;

public class AcademicPerformanceNotFoundException extends RuntimeException {
    public AcademicPerformanceNotFoundException(Long id) {
        super("Could not find AcademicPerformance " + id);
    }

}