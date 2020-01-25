<%--
  Created by IntelliJ IDEA.
  User: EDZ
  Date: 2019/11/21
  Time: 14:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" action="${pageContext.request.contextPath}/insertStudent">
    <input type="hidden" name="id" />
    学生姓名：<input type="text" name="name" /> <br/> <br/>
    班级编号：<input type="text" name="classid" /> <br/> <br/>
    教师姓名：<input type="text" name="teacher" /> <br/> <br/>
    学生成绩：<input type="text" name="score" /><br/><br/>
    <input type="submit" value="增加">
</form>
</body>
</html>
