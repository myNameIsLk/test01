package com.bjpowernode.service;

import com.bjpowernode.entity.Student;

import java.util.List;
import java.util.Map;

public interface StudentService {
    int addStudent(Student student);
    List<Map<String,Object>> findStudents();
}
