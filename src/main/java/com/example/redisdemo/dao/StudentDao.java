package com.example.redisdemo.dao;

import com.example.redisdemo.model.Student;

import java.util.Map;

public interface StudentDao {
    void addStudnt(Student s);
    void updateStudent(Student s);
    Student getStudent(int sId);
    Map<Integer,Student> getStudents();
}
