package com.whxh.entity;

public class Student {
   private Integer id;
   private String name;
   private String classid;
   private String teacher;
   private Integer score;

 public Student() {
 }

 public Student(Integer id, String name, String classid, String teacher, Integer score) {
  this.id = id;
  this.name = name;
  this.classid = classid;
  this.teacher = teacher;
  this.score = score;
 }

 public Student(String name, String classid, String teacher, Integer score) {
  this.name = name;
  this.classid = classid;
  this.teacher = teacher;
  this.score = score;
 }

 public Integer getId() {
  return id;
 }

 public void setId(Integer id) {
  this.id = id;
 }

 public String getName() {
  return name;
 }

 public void setName(String name) {
  this.name = name;
 }

 public String getClassid() {
  return classid;
 }

 public void setClassid(String classid) {
  this.classid = classid;
 }

 public String getTeacher() {
  return teacher;
 }

 public void setTeacher(String teacher) {
  this.teacher = teacher;
 }

 public Integer getScore() {
  return score;
 }

 public void setScore(Integer score) {
  this.score = score;
 }

 @Override
 public String toString() {
  return "Student{" +
   "id=" + id +
   ", name='" + name + '\'' +
   ", classid='" + classid + '\'' +
   ", teacher='" + teacher + '\'' +
   ", score=" + score +
   '}';
 }
}
