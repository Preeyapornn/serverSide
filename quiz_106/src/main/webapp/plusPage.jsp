<%--
  Created by IntelliJ IDEA.
  User: preeyaporn
  Date: 25/10/2022 AD
  Time: 15:20
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>AdditionQuiz</title>
</head>
<body>
<h1> Addition Quiz status (CorrectCount/TotalCount): ${count}</h1>
<form method="post" action="plusPage">
    What is "${num1}" + ${num2} ?<input type="text" required name="result"><input type="submit">

</form>
<br>
<c: test="${answer != answer? : in  }>
<h3> Preeyaporn Petcharat</h3>
</body>
</html>
