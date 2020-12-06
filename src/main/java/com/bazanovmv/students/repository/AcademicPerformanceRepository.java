package com.bazanovmv.students.repository;

import com.bazanovmv.students.model.AcademicPerformance;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AcademicPerformanceRepository extends JpaRepository<AcademicPerformance, Long>{

    List<AcademicPerformance> findByText(String text);

    AcademicPerformance findById(long id);
}



