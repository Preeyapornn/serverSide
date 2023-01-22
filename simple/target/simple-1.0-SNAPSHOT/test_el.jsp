<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: preeyaporn
  Date: 28/9/2022 AD
  Time: 14:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Test El</title>
</head>
<body>
<%
    String name = request.getParameter("name");
%>
<h2> Name = <%= name %> ( Scripting )</h2>
<h2> Name = ${param.name} ( El )</h2>

<%--<h2>Name = ${param.name}</h2><br> ได้ผลลับเหทือนกันแต่เป็นภาษา el--%>
Favorite Subjects: <br>
${paramValues.fav[0]}<br/>
${paramValues.fav[1]}<br/>
${paramValues.fav[2]}<br/>
<hr/>
Favorite Subjects (loop): <br>
<c:forEach items = "${paramValues.fav}" var="f">
${f}<br/>
</c:forEach>
<h2>Header</h2>
Your browser: ${header["User-Agent"]}<br/>
<%--Your browser: ${header.User-Agent}<br/>--%>
Host: ${header.host}<br/>
Connection: ${header.connection}<br/>
Accept: ${header.Accept}<br/>
Session Id: ${cookie.JSESSIONID.value}
</body>
</html>
