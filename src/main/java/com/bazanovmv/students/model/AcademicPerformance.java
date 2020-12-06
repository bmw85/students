package com.bazanovmv.students.model;

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
