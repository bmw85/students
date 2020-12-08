package com.bazanovmv.students.model;


import com.bazanovmv.students.validator.AcademicPerformanceExistsValidator;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.sql.Date;


/** Класс Студент */
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /** Фамилия Имя Отчество*/
    @NotNull
    @NotBlank(message = "Name is mandatory")
    private String name;

    /** Дата рождения*/
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    @NotNull
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date birthDate;

    /** Успеваемость */
    @ManyToOne
    @JoinColumn(name = "performance_id")
    @AcademicPerformanceExistsValidator
    private AcademicPerformance performance;

    protected Student() {}

    public Student(String name, Date birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public Student(String name, Date birthDate, AcademicPerformance performance) {
        this.name = name;
        this.birthDate = birthDate;
        this.performance = performance;
    }

    @Override
    public String toString() {
        return String.format(
                "Student[id=%d, name='%s', birthDate ='%tF', performance='%s']",
                id, name, birthDate, performance.toString());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AcademicPerformance getPerformance() {
        return performance;
    }

    public void setPerformance(AcademicPerformance performance) {
        this.performance = performance;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
}

