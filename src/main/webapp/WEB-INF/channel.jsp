<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Программа телепередач</title>
    <style>
        table {
            font-family: arial, sans-serif;
            border-collapse: collapse;
            width: fit-content;
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
<table>
    <tr>
        <th>Название</th>
    </tr>
    <c:forEach var="channel" items="${channelList}">
        <tr>
            <td><a href="<spring:url value="/programme/${channel.id-1}" />">${channel.title}</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>