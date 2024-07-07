<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="blue">

    <%
    int a = Integer.parseInt(request.getParameter("number1"));
    int b = Integer.parseInt(request.getParameter("number2"));

    int k=a+b;


    out.println("Sum of two numbers is: "+k);

    %>


</body>
</html>