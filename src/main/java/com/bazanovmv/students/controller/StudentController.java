package com.bazanovmv.students.controller;

import com.bazanovmv.students.exception.StudentNotFoundException;
import com.bazanovmv.students.model.Student;
import com.bazanovmv.students.repository.StudentRepository;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class StudentController {
    private final StudentRepository repository;

    public StudentController(StudentRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/students")
    List<Student> all() {
        return repository.findAll();
    }

    @PostMapping("/students")
    Student newCustomer(@Valid @RequestBody Student newStudent) {
        return repository.save(newStudent);
    }

    @GetMapping("/students/{id}")
    Student one(@PathVariable Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new StudentNotFoundException(id));
    }

    @PutMapping("/students/{id}")
    Student replaceCustomer(@Valid @RequestBody Student newStudent, @PathVariable Long id) {

        return repository.findById(id)
                .map(student -> {
                    student.setName(newStudent.getName());
                    student.setPerformance(newStudent.getPerformance());
                    return repository.save(student);
                })
                .orElseGet(() -> {
                    newStudent.setId(id);
                    return repository.save(newStudent);
                });
    }

    @DeleteMapping("/students/{id}")
    void deleteCustomer(@PathVariable Long id) {
        repository.deleteById(id);
    }


}


