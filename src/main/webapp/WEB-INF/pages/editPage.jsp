<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <c:if test="${empty user.id}">
        <title>Add</title>
    </c:if>
    <c:if test="${!empty user.id}">
        <title>Edit</title>
    </c:if>
</head>
<body>
<c:if test="${empty user.id}">
    <c:url value="/add" var="var"/>
</c:if>
<c:if test="${!empty user.id}">
    <c:url value="/edit" var="var"/>
</c:if>
<form action="${var}" method="POST">
    <c:if test="${!empty user.id}">
        <input type="hidden" name="id" value="${user.id}">
    </c:if>

    <label for="title">Title</label>
    <input type="text" name="name" id="title">

    <c:if test="${empty user.id}">
        <input type="submit" value="Add new user">
    </c:if>
    <c:if test="${!empty user.id}">
        <input type="submit" value="Edit user">
    </c:if>
</form>
</body>
</html>