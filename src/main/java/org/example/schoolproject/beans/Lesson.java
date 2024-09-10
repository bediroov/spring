package org.example.schoolproject.beans;

import org.springframework.stereotype.Component;

@Component
public class Lesson {

    private String subject;
    private Integer term;

    public Lesson() {
    }

    public Lesson(String subject, Integer term) {
        this.subject = subject;
        this.term = term;
    }

    @Override
    public String  toString() {
        return "Lesson{" +
                "subject='" + subject + '\'' +
                ", term=" + term +
                '}';
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Integer getTerm() {
        return term;
    }

    public void setTerm(Integer term) {
        this.term = term;
    }
}
