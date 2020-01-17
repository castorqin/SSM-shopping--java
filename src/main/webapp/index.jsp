<%--
  Created by IntelliJ IDEA.
  User: qhj
  Date: 2019/12/25
  Time: 1:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="js/_jquery.js"></script>
    <script>
       function x() {
           $.ajax({
               url: "./first/test",
               dataType:"json",
               type:"post",
               contentType:"application/json;charset=utf-8",
               date:JSON.stringify({"pass":"31886488","password":"123456"}),
               success:function(result){
                alert(result)
               }
           });
       }
    </script>
</head>
<body>
     <a href="/first/test" >这是一个链接</a>
    <img src="img/login.png" onclick="x()">
  <button value="我 我" onclick="x()"></button>

</body>
</html>
