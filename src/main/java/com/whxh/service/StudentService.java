package com.whxh.service;

import com.whxh.entity.Student;
import com.whxh.util.ParamsStu;

import java.util.List;

public interface StudentService {
 //查询所有
 public List<Student> selectStudentAll(ParamsStu params);

 void deleteStudent(int id);

 Student updateStudentEdit(int id);

 void upadateStudent(Student student);

 void insertStudent(Student student);

}
