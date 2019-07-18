<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: thehe
  Date: 18.07.2019
  Time: 18:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8"%>
<html>
<head>
    <title>Изменить телепередачу</title>
</head>
<body>
    <c:url var="addUrl" value="/update/${id}/${progId}"/>
    <form action="${addUrl}" method="GET">
        <label>Время</label>
        <input type="text" name="newtime" value="${time}">
        <label>Название</label>
        <input type="text" name="newprogTitle" value="${progTitle}">
        <input type="submit" value="Изменить телепередачу">
    </form>
</body>
</html>


