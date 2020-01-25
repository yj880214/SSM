<%--
  Created by IntelliJ IDEA.
  User: EDZ
  Date: 2019/11/18
  Time: 11:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>学生成绩管理系统</title>
    <script type="text/javascript" src="${pageContext.request.contextPath}/jq/jquery-1.11.0.js"></script>
</head>
<style type="text/css">
    td{
        text-align: center;
    }
</style>
<body>
<h1 align="center">学生成绩管理系统</h1>
<%--条件查询/搜索：注意写工具类--%>
<div align="center">
<form id="myForm" action="${pageContext.request.contextPath}/selectStudentAll" method="post">
    姓名：<input type="text" name="name" value="${par.name}" size="6"/>
    班级编号：<input type="text" name="classid" value="${par.classid}"size="6"/>

    老师姓名：<input type="text" name="teacher" value="${par.teacher}"size="6"/> <br/> <br/>
    学生成绩:<input type="text" name="scoreFrom" value="${par.scoreFrom}" size="6"/>
            ---<input type="text" name="scoreTo" value="${par.scoreTo}" size="6"/>
    <%--条件搜索后：分页--%>
     <input id="pn" type="hidden" name="pageNum" value="${pageInfo.pageNum}">
    <%--页面动态设置每页条数--%>
     <input id="ps" type="hidden" name="pageSize" value="${pageInfo.pageSize}">
    <input type="submit" value="搜索">
</form>
</div>
<%--数据展示--%>
<table border="1" align="center">
    <tr>
        <td>学生编号</td>
        <td>学生姓名</td>
        <td>班级编号</td>
        <td>老师姓名</td>
        <td>学生成绩</td>
        <td>操作</td>
    </tr>
    <c:forEach items="${pageInfo.list}" var="stu" varStatus="vs">
        <tr >
            <%--<td>${el.id}</td>--%>
            <%--设置序号正常显示：按照自然顺序。序号=
                序号从1开始+(当前页-1)*每页条数
             --%>
            <td>${vs.count+(pageInfo.pageNum-1)*pageInfo.pageSize}</td>
            <td>${stu.name}</td>
            <td>${stu.classid}</td>
            <td>${stu.teacher}</td>
            <td>${stu.score}</td>
            <td><a href="${pageContext.request.contextPath}/deleteStudent/${stu.id}">删除</a>||
                <a href="${pageContext.request.contextPath}/updateStudentEdit/${stu.id}">修改</a></td>
        </tr>
    </c:forEach>
</table>
<%--分页--%>
<table align="center">
    <tr>
        <td><a href="javascript:toPage(1);">首页</a></td>
        <td><a href="javascript:toPage(${pageInfo.pageNum-1});">上一页</a></td>
        <td><a href="javascript:toPage(${pageInfo.pageNum+1});">下一页</a></td>
        <td><a href="javascript:toPage(${pageInfo.pages});">尾页</a></td>
        <td>设置每页条数
            <select id="pageSize" onchange="toPage(1)">
                <option <c:if test="${pageInfo.pageSize==2}">selected</c:if>>2</option>
                <option <c:if test="${pageInfo.pageSize==5}">selected</c:if>>5</option>
                <option <c:if test="${pageInfo.pageSize==8}">selected</c:if>>8</option>
                <option <c:if test="${pageInfo.pageSize==10}">selected</c:if>>10</option>
                <option <c:if test="${pageInfo.pageSize==12}">selected</c:if>>12</option>
                <option <c:if test="${pageInfo.pageSize==15}">selected</c:if>>15</option>
            </select>
        </td>
        <td>第${pageInfo.pageNum}页/共${pageInfo.pages}页</td>
        <td><a href="${pageContext.request.contextPath}/insertStudentEdit">添加</a></td>
    </tr>
</table>
</body>
   <script type="text/javascript">
       function toPage(pageNum) {
           //pageNum为当前页
           $("#pn").val(pageNum);
           //获取页面设置的每页条数
           var pageSize=$("#pageSize").val();
           //每页条数传给表单，更新每页条数
           $("#ps").val(pageSize);
           //提交表单请求
           $("#myForm").submit();
       }
   </script>
</html>
