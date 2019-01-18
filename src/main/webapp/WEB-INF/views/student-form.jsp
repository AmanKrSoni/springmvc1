<%--
  Created by IntelliJ IDEA.
  User: cvt11
  Date: 17/01/19
  Time: 2:15 PM
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Student Registration form</title>
</head>
<body>
        <form:form action="processForm" modelAttribute="student">
            First Name  : <form:input path="firstName"/>
            <br><br>

            Last Name   : <form:input path="lastName"/>
            <br><br>

            Country     : <form:select path="country">
                             <form:options items="${student.countryOptions}"/>
                          </form:select>

            <br><br>

            Favourite Programming Language :
                Java <form:radiobutton path="favLang" value="Java"/>
                C# <form:radiobutton path="favLang" value="C#"/>
                PHP <form:radiobutton path="favLang" value="PHP"/>
                Python <form:radiobutton path="favLang" value="Python"/>

            <br><br>
            Operating Systems :
            Linux <form:checkbox path="operatingSystems" value="Linux"/>
            Mac <form:checkbox path="operatingSystems" value="Mac"/>
            Windows <form:checkbox path="operatingSystems" value="Windows"/>
            Ubuntu <form:checkbox path="operatingSystems" value="Ubuntu"/>


            <br><br>
            <input type="submit" value="Submit"/>

        </form:form>

</body>
</html>
