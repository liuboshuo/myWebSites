<%--
  Created by IntelliJ IDEA.
  User: liushuo
  Date: 16/9/16
  Time: 下午5:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
    <title>上传</title>
</head>
<body>

<form action="uploadPic" method="post" enctype="multipart/form-data">
    <input type="file" name="pic">
    <input type="submit" value="提交">
</form>
</body>
</html>
