<%--
  Created by IntelliJ IDEA.
  User: EDZ
  Date: 2019/11/21
  Time: 11:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改的编辑页面</title>
</head>
<body>
   <%--<form method="post" action="${pageContext.request.contextPath}/updateEmp">--%>
   <form method="post" action="${pageContext.request.contextPath}/updateStudent">
   学生姓名：<input type="text" name="name" value="${student.name}"/> <br/> <br/>
       班级编号：<input type="text" name="classid" value="${student.classid}"/> <br/> <br/>
       老师姓名：<input type="text" name="teacher" value="${student.teacher}"/> <br/> <br/>
       学生成绩：<input type="text" name="score" value="${student.score}"/><br/><br/>

       <input type="hidden" name="id" value="${student.id}"/>

       <input type="submit" value="提交修改">
   </form>
</body>
</html>
