package com.example.redisdemo.dao;

import com.example.redisdemo.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class RedisTest implements CommandLineRunner {
    @Autowired
    public StudentDao studentDao;
    @Override
    public void run(String... args) throws Exception {
        studentDao.addStudnt(new Student(1,"Cat",300.50));
        studentDao.addStudnt(new Student(2,"Cat",300.50));
        studentDao.getStudent(1);
        studentDao.updateStudent(new Student(1,"rat",220.50));
        studentDao.getStudents().forEach((k,v)->System.out.println(k+" "+v));
    }
}
