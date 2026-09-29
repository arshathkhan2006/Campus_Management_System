<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>List of Students</title>
</head>

<body>
    <h1>Campus Management System</h1>
    <ul>
        <% for (Student student : students) { %>
            <li><%= Student %></li>
        <% } %>
    </ul>
    <br/>
    <a href="/student.html">Add New Student</a>
</body>
</html>