<%--
  Created by IntelliJ IDEA.
  User: cvt11
  Date: 17/01/19
  Time: 4:14 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Customer Registration</title>
    <style>
        .error{
            color: red;}
    </style>
</head>
<body>

<br><br>
    <form:form action="processForm" modelAttribute="customer">
        First Name  : <form:input path="firstName" />

        <br><br>
        Last Name(*)   : <form:input path="lastName" />
                     <form:errors path="lastName" cssClass="error"/>

        <br><br>
        FreePasses  : <form:input path="freePass" />
                         <form:errors path="freePass" cssClass="error"/>

        <br><br>
        Course Code  : <form:input path="courseCode" />
        <form:errors path="courseCode" cssClass="error"/>

        <br><br>
                     <input type="submit" value="Submit"/>

    </form:form>

</body>
</html>
