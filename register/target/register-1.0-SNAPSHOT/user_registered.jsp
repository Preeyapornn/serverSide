
<%--
  Created by IntelliJ IDEA.
  User: preeyaporn
  Date: 12/10/2022 AD
  Time: 14:35
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Your Registered Information</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css"
          integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2"
          crossorigin="anonymous">
</head>
<body>
<c:forEach items="${ courseRegistered.history }" var="entry" varStatus="vs">
    <h2> ${vs.count} : Semester ${entry.key}</h2>
    <c:forEach items="${entry.value}" var="subject">
        ${subject.subjectId}, ${subject.title}, ${subject.credit}<br>
    </c:forEach>
<hr/>

</c:forEach>
<a href="index.jsp">[  T h i s i s H o m e ]</a>
</body>
</html>
