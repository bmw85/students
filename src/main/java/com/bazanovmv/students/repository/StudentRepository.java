package com.bazanovmv.students.repository;

import com.bazanovmv.students.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long>{

    Student findById(long id);

}

