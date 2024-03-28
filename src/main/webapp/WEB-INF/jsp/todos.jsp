<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <c:forEach var="task" items="${tasks}">
        <!-- display task details here -->
        <p>Name: <spring:eval expression="task.name" /></p>
        <!-- add more details as needed -->
    </c:forEach>
</body>
</html>