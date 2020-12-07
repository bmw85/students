/*
package com.bazanovmv.students.repository;

import com.bazanovmv.students.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long>{

    Student findById(long id);

}
*/



package com.bazanovmv.students.repository;

import com.bazanovmv.students.model.AcademicPerformance;
import com.bazanovmv.students.model.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(collectionResourceRel = "students", path = "students")
public interface StudentRepository extends CrudRepository<Student, Long> {
    //List<AcademicPerformance> findByName(@Param("text") String text);

    AcademicPerformance findById(long id);
}
