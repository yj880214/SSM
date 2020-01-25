package com.whxh.controller;

import com.github.pagehelper.PageInfo;
import com.whxh.entity.Student;
import com.whxh.service.StudentService;
import com.whxh.util.ParamsStu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class StuController {
//查询所有
 @Autowired
 private StudentService studentService;
 @RequestMapping(value = "/selectStudentAll")
 public String selectStudentAll(Model model,ParamsStu params){
//  List<Emp> empList=empService.selectEmpAll();
  List<Student> studentList=studentService.selectStudentAll(params);
  //分页对象
  PageInfo pageInfo=new PageInfo(studentList);
//  将分页信息放到域中
  model.addAttribute("par",params);
  model.addAttribute("pageInfo",pageInfo);

  return "list";  //视图解析器：  /jsp/list.jsp
 }
//删除
 @RequestMapping("/deleteStudent/{id}")
 public String deleteStudent(@PathVariable int id){
  //实现删除：调用service方法
  studentService.deleteStudent(id);
//  删除数据后，同时返回更新结果页面,使用重定向
  return "redirect:/selectStudentAll";
 }
//修改一条：1、查询一条 ，并且展示到页面（根据id查询，select）
 //        2、编辑修改，提交保存  （update）
 //1,查询一条后，进入到编辑页面
 @RequestMapping("/updateStudentEdit/{id}")
 public String upadateEmpEdit(Model model,@PathVariable int id){
  //实现查询一条
  Student student=studentService.updateStudentEdit(id);
  //查询的数据放到域中
  model.addAttribute("student",student);
  return "edit";
 }

 //2,编辑页面完成后，提交 执行修改
 @RequestMapping("/updateStudent")
 public String upadateStudent(Student student){
  //实现修改
  studentService.upadateStudent(student);
  //修改完毕，重定向，更新结果页面
  return "redirect:/selectStudentAll";
 }
 //添加：1、进入添加页面，编辑
 @RequestMapping("/insertStudentEdit")
 public String insertStudentEdit(){
  //添加完毕，重定向更新结果页面
  return "add";
 }
 //2、提交添加请求，实现
 @RequestMapping("/insertStudent")
 public String insertStudent(Student student){
  //执行添加，调用service添加方法-dao-持久化
  studentService.insertStudent(student);
  //添加完毕，重定向更新结果页面
  return "redirect:/selectStudentAll";
 }

}
