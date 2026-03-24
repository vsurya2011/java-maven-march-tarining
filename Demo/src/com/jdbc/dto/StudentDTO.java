package com.jdbc.dto;

import com.jdbc.enums.Gender;

import java.time.LocalDate;
public class StudentDTO {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String name;

    @Override
    public String toString() {
        return "StudentDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", regno=" + regno +
                ", gender=" + gender +
                ", email='" + email + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }

    private int regno;
    private Gender gender;
    private String email;
    private LocalDate dateOfBirth;

}
