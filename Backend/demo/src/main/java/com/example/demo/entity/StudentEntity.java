package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "students")
public class StudentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "studentid")
    private Integer StudentId;

    @Column(name="studentname")
    private String StudentName;

    public StudentEntity(Integer studentId, String studentName) {
        StudentId = studentId;
        StudentName = studentName;
    }

    public StudentEntity() {

    }

    public Integer getStudentId() {
        return StudentId;
    }

    public void setStudentId(Integer studentId) {
        StudentId = studentId;
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String studentName) {
        StudentName = studentName;
    }

    @Override
    public String toString() {
        return "StudentEntity{" +
                "StudentId=" + StudentId +
                ", StudentName='" + StudentName + '\'' +
                '}';
    }
}
