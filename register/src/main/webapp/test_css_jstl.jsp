<%--
  Created by IntelliJ IDEA.
  User: preeyaporn
  Date: 5/10/2022 AD
  Time: 14:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
  <div style="padding: 10px;display: block;width: 50%;margin: auto">
    <c:forEach begin="1" end="100" var="value">
    <div class="box">${value}&nbsp</div>
    </c:forEach></div>

    <title>Test CSS and JSTL</title>
    <style>
        .box {
            border: lightgray 1px inset;
            background-color: plum;
            text-align: right;
            border-radius: 4px;
            width: 35px;
            height: 20px;
            margin: 4px;
            display: inline-block;
            padding: 2px 8px 2px 2px;
        }
    </style>
</head>
<body>

</body>
</html>
