package com.bazanovmv.students.model;


import org.springframework.data.rest.core.config.Projection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/** Успеваемость */

@Entity
public class AcademicPerformance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @NotBlank(message = "Text is mandatory")
    private String text;

    protected AcademicPerformance() {}

    public AcademicPerformance(Long id, String text) {
        this.id = id;
        this.text = text;
    }

    @Override
    public String toString() {
        return String.format(
                "AcademicPerformance[id=%d, text='%s']",
                id, text);
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
