package org.example.model;

import java.time.LocalDate;

public class Student {
    private String name;
    private int credits;
    private LocalDate dateOfBirth;

    public Student(String name, int credits, LocalDate dateOfBirth) {
        this.name = name;
        this.credits = credits;
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Student{");
        sb.append("name='").append(name).append('\'');
        sb.append(", credits=").append(credits);
        sb.append(", dateOfBirth=").append(dateOfBirth);
        sb.append('}');
        return sb.toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
