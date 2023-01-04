package com.example.redisdemo.dao;

import com.example.redisdemo.model.Student;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.Map;
@Repository
public class StudentDaoImpl implements StudentDao{
    private final String Key="Student";
    @Resource(name="rt")
    private HashOperations<String,Integer,Student> opr;
    @Override
    public void addStudnt(Student s) {
      opr.putIfAbsent(Key,s.getSId(),s);
    }

    @Override
    public void updateStudent(Student s) {
        opr.put(Key,s.getSId(),s);
    }

    @Override
    public Student getStudent(int sId) {
        return opr.get(Key,sId);
    }

    @Override
    public Map<Integer, Student> getStudents() {
        return opr.entries(Key);
    }
}
