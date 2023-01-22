<%--
  Created by IntelliJ IDEA.
  User: preeyaporn
  Date: 21/9/2022 AD
  Time: 15:43
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Test Scope</title>
</head>
<body>
<% String pc = "This is Page Scope Attribute"; %>
<h3> Scope Attribute</h3><hr/>
Page Attribute: ${pc}<br>
Request Attribute: ${rc} <br>
Session Attribute: ${sc} <br>
Application Attribute: ${ac} <br>
<a href="index.jsp">[ Home ]</a>
</body>
</html>
