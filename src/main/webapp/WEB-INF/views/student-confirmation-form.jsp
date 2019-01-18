<%--
  Created by IntelliJ IDEA.
  User: cvt11
  Date: 17/01/19
  Time: 2:26 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Student Confirmation Form</title>
</head>
<body>
<h3>The Student is Confirmed :<h2>${student.firstName} ${student.lastName}</h2></h3>
<h4>Country : ${student.country}</h4>

Favourite Programming Language : ${student.favLang}

<br>
Operating Systems :

<ul>
    <c:forEach var="temp" items="${student.operatingSystems}">
        <li>${temp}</li>
    </c:forEach>
</ul>

</body>
</html>
