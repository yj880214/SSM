package com.whxh.mapper;

import com.whxh.entity.Student;
import com.whxh.util.ParamsStu;

import java.util.List;

public interface StudentMapper {
 //查询所有
   public List<Student> selectStudentAll(ParamsStu params);
//根据id删除学生
   void deleteStudent(int id);
//根据id查询学生，然后进入编辑页面 展示信息准备修改
   Student updateStudentEdit(int id);
//修改编辑页面，提交执行修改
   void upadateStudent(Student student);
//添加学生
   void insertStudent(Student student);


}
