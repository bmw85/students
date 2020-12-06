package com.bazanovmv.students.exception;

public class StudentNotFoundException extends RuntimeException {
    public StudentNotFoundException(Long id) {
        super("Could not find Student " + id);
    }
}
