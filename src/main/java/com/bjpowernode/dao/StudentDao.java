package com.bjpowernode.dao;

import com.bjpowernode.entity.Student;

import java.util.List;
import java.util.Map;

public interface StudentDao {
    List<Map<String,Object>> selectAllStudent();
    int insertStudent(Student student);
}
