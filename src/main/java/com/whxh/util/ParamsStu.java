package com.whxh.util;

//分页工具类
public class ParamsStu {
  private int pageNum;   //当前页
  private int pageSize=5;//每页条数

//  条件查询
 private String name;
 private String classid;
 private String teacher;
 private Integer scoreFrom;
 private Integer scoreTo;

 public int getPageNum() {
  return pageNum;
 }

 public void setPageNum(int pageNum) {
  this.pageNum = pageNum;
 }

 public int getPageSize() {
  return pageSize;
 }

 public void setPageSize(int pageSize) {
  this.pageSize = pageSize;
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

 public Integer getScoreFrom() {
  return scoreFrom;
 }

 public void setScoreFrom(Integer scoreFrom) {
  this.scoreFrom = scoreFrom;
 }

 public Integer getScoreTo() {
  return scoreTo;
 }

 public void setScoreTo(Integer scoreTo) {
  this.scoreTo = scoreTo;
 }

 @Override
 public String toString() {
  return "ParamsStu{" +
   "pageNum=" + pageNum +
   ", pageSize=" + pageSize +
   ", name='" + name + '\'' +
   ", classid=" + classid +
   ", teacher='" + teacher + '\'' +
   ", scoreFrom=" + scoreFrom +
   ", scoreTo=" + scoreTo +
   '}';
 }
}
