<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>videos Page</title>
</head>
<body>

    <%

    response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
    
    if(session.getAttribute("username") == null)
    {
        response.sendRedirect("login.jsp");
    }
    %>
    <h1>videos page</h1>

    <iframe src="https://www.youtube.com/embed/Fjp2TdlTTIU"></iframe>
    <form action="logout">
        <input type="submit" value="logout">
    </form>
</body>
</html>