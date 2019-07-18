<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: thehe
  Date: 18.07.2019
  Time: 14:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Добавление новой телепередачи</title>
</head>
<body>
<c:url var="addUrl" value="/add/${id}"/>
<form action="${addUrl}" method="GET">
    <label>Время</label>
    <input type="text" name="time">
    <label>Название</label>
    <input type="text" name="progTitle">
    <input type="submit" value="Добавить новую телепередачу">
</form>
</body>
</html>
