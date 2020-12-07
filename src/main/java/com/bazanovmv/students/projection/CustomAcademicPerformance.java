package com.bazanovmv.students.projection;

import com.bazanovmv.students.model.Student;
import org.springframework.data.rest.core.config.Projection;

@Projection(
        name = "customAcademicPerformance",
        types = { Student.class })
public interface CustomAcademicPerformance {
    String toString();
}
