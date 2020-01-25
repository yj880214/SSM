package com.whxh.service;

import com.github.pagehelper.PageHelper;
import com.whxh.entity.Student;
import com.whxh.mapper.StudentMapper;
import com.whxh.util.ParamsStu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StuServiceImpl implements StudentService {
 @Autowired
 private StudentMapper studentMapper;
 //查询所有
 @Override
 public List<Student> selectStudentAll(ParamsStu params) {

  if (params.getPageNum()==0){
    params.setPageNum(1);
  }

  PageHelper.startPage(params.getPageNum(),params.getPageSize());
  //pageNum当前页，pageSize 每页条数
  return studentMapper.selectStudentAll(params);
 }

 @Override
 public void deleteStudent(int id) {
   studentMapper.deleteStudent(id);
 }

 @Override
 public Student updateStudentEdit(int id) {
    return studentMapper.updateStudentEdit(id);
 }

 @Override
 public void upadateStudent(Student student) {
  studentMapper.upadateStudent(student);
 }

 @Override
 public void insertStudent(Student student) {
  studentMapper.insertStudent(student);
 }


}
