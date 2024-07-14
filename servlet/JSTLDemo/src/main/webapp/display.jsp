<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>

<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <sql:setDataSource var="db" driver="com.mysql.cj.jdbc.Driver" url="jdbc:mysql://localhost:3306/db1" user="root" password="yash1616" />
    <sql:query var="rs" dataSource="${db}">
        select * from student_info
    </sql:query>
    <c:forEach items="${rs.rows}" var="student">
        <c:out value="${student.name}"></c:out> : <c:out value="${student.rollno}"></c:out> : <c:out value="${student.marks}"></c:out> 
    </c:forEach>
    </body>
</html>