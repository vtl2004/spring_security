<%--
  Created by IntelliJ IDEA.
  User: krvro
  Date: 23.05.2020
  Time: 12:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Save User</title>
</head>
<body><br><br><br>
<h3>Добавить пользователя</h3>
<form action="/admin/user-save" method="post">
    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
    <input  type="text" name="username" placeholder="login" required><br><br><br>
    <input  type="text" name="password" placeholder="password" required><br><br><br>
    <input type="text" name="firstName" placeholder="Name" required><br><br><br>
    <input type="text" name="lastName" placeholder="Last Name" required><br><br><br>
    <input type="text" name="email" placeholder="email" required><br><br><br><br>
    <h4>Определите роли для юзера</h4>

<c:forEach items="${roles}" var="role">

    <input type="checkbox" name="role" value="${role.getRole()}"> ${role.getRole()}<br><br>
</c:forEach>

<input  type="submit" value="submit">
</form><br>



<br>
<a href="/logout">Logout</a>

</body>
</html>
