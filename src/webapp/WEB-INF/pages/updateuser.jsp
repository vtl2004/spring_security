<%--
  Created by IntelliJ IDEA.
  User: krvro
  Date: 23.05.2020
  Time: 12:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Update User</title>
</head>
<body>

<h3>${user.toString()}</h3><br>

<form action="/admin/user-update" method="post">
    <input type="hidden" name="id"  value="${param.id}">
    <input type="text" name="username"  value="${param.username}" required>
    <input type="text" name="password"  value="${param.password}" required>
    <input type="text" name="firstName"  value="${param.firstName}" required>
    <input type="text" name="lastName"  value="${param.lastName}" required>
    <input type="text" name="email"  value="${param.email}" required><br>
    <h4>Определите роли для юзера</h4>
    <c:forEach items="${roles}" var="role">

        <input type="checkbox" name="roles" value="${role.getRole()}"> ${role.getRole()}<br><br>
    </c:forEach>

    <input type="submit" value="Update">
</form><br>
<a href="/logout">Logout</a>
</body>
</html>
