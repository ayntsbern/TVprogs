<%--
  Created by IntelliJ IDEA.
  User: thehe
  Date: 17.07.2019
  Time: 23:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Программа для канала</title>
    <style>
        table {
            font-family: arial, sans-serif;
            border-collapse: collapse;
            width: 100%;
        }

        td, th {
            border: 1px solid #dddddd;
            text-align: left;
            padding: 8px;
        }

        tr:nth-child(even) {
            background-color: #dddddd;
        }
    </style>
</head>
<body>
<%-- <form action="/programme>" method="POST"> --%>
<a href= "<spring:url value="/" />">Вернуться к списку</a>
    <table>
        <tr>
            <th>Время</th>
            <th>Название</th>
            <th>Удалить передачу</th>
            <th>Изменить передачу</th>
        </tr>
            <c:forEach var="programme" items="${programmeList}">
            <tr>
                <td>${programme.time}</td>
                <td>${programme.progtitle}</td>
                <td><a href="<spring:url value="/delete/${id}/${programme.time}" />">Удалить</a></td>
                <td><a href="<spring:url value="/update-page/${id}/${programme.id}/${programme.time}/${programme.progtitle}" />">Изменить</a></td>
            </tr>
            </c:forEach>
    </table>
<a href= "<spring:url value="/add-new-programme/${id}" />">Добавить новую телепередачу</a>
</body>
</html>