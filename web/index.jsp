<%--
  Created by IntelliJ IDEA.
  User: mqxu
  Date: 2019/9/17
  Time: 15:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>首页</title>
    <style type="text/css">
        #top {
            height: 50px;
            background-color: rgb(38, 166, 154);
            color: #FFF;
            font-size: 14px;
            display: flex;
            align-items: center;
            justify-content: space-between;
        }
    </style>
</head>
<body>
<div id="top">
    <span class="logo">书屋</span>
    <span class="logo"><%=session.getAttribute("username")%></span>
</div>
<div class="container"></div>
</body>
</html>
