<%--
  Created by IntelliJ IDEA.
  User: liushuo
  Date: 16/8/14
  Time: 下午5:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>test</title>
    <script type="text/javascript" src="/Res/jquery.js"></script>
    <script type="text/javascript">

        $(function(){
            $("#myButton").click(function(){
                var myText = $("#myText").val();

                var option = {
                        url:"test3",
                        type:"post",
                        dataType:"text",
                        data:{
                            name:myText
                        },
                        success:function(myText){
                            alert(myText);
                        },
                        error:function(){
                            alert("系统错误");
                        }
                };
                $.ajax(option);
            });
        });

    </script>
</head>
<body>
<input type="text" id="myText">
<input type="button" id="myButton" value="提交">
</body>
</html>
