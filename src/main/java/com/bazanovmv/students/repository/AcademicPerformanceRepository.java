/*
package com.bazanovmv.students.repository;

import com.bazanovmv.students.model.AcademicPerformance;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AcademicPerformanceRepository extends JpaRepository<AcademicPerformance, Long>{

    List<AcademicPerformance> findByText(String text);

    AcademicPerformance findById(long id);
}
*/



package com.bazanovmv.students.repository;

import com.bazanovmv.students.model.AcademicPerformance;
import com.bazanovmv.students.projection.CustomAcademicPerformance;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;


@RepositoryRestResource(collectionResourceRel = "performance", path = "performances", excerptProjection = CustomAcademicPerformance.class)
public interface AcademicPerformanceRepository extends CrudRepository<AcademicPerformance, Long> {
    List<AcademicPerformance> findByText(@Param("text") String text);

    AcademicPerformance findById(@PathVariable @Param("id") long id);
}
