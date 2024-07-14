<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome page</title>
</head>
<body>

    <%

    response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");

    if(session.getAttribute("username") == null)
    {
        response.sendRedirect("login.jsp");
    }
    %>
    <h1>Welcome ${username} to the first page</h1>
    <h2>Click the button to go to the videos page</h2>
    <form action="videos.jsp">
        <input type="submit" value="Go to the second page" />
    </form>
    <form action="logout">
        <input type="submit" value="logout">
    </form>
</body>
</html>