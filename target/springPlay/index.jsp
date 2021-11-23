<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<h2>Hello World!</h2>
</body>
<%
    String basePath = request.getScheme()+"://"+
            request.getServerName()+":"+request.getServerPort()+
            request.getContextPath()+"/";
%>
<base href="<%=basePath%>">

<a href="student/add">添加数据</a>
<a href="student/delete">删除数据</a>
<a href="student/modify">修改数据</a>
</html>
