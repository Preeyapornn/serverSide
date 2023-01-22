<%--
  Created by IntelliJ IDEA.
  User: preeyaporn
  Date: 19/10/2022 AD
  Time: 16:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<html>
<head>
    <title>Office List ::</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
<div class="container-fluit m-4">
    <h2>Classic Models: <span style="color: darkred">Office list</span>
    </h2> <hr/>
    <c:forEach items="${offices}" var="office">
        <div class="row">
    <div class="col-1">${office.officeCode}</div>
    <div class="col-2">${office.city}</div>
    <div class="col-2">${office.state}</div>
    <div class="col-2">${office.country}</div>
    <div class="col-1">${office.postalCode}</div>
    <div class="col-2">${office.phone}</div>
</div>
</c:forEach>
</div>
</body>
</html>
