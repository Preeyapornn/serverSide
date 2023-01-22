<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
    <style>


        a:link {

            text-decoration: none;

        }

        a:hover {
            background-color: mediumpurple;
            }

        a{
            color: black;
        }

    </style>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<br>
<a href="TestScope">Test Scope</a><br>
<a href="Page1">Page 1</a><br>
<a href="Page2">Page 2</a><br>
<a href="Page3">Page 3</a><br>



<h2>This is my web app - Petcharat</h2>
<br/>
<a href="hello-servlet">Hello Servlet</a><br/>
<a href="subject_form.html">Add new subject</a><br/>
<a href="plusnum.html">plusnum</a><br/>
<a href="TestReqParam">Select Favorite Subjects</a><br/>
</body>
</html>