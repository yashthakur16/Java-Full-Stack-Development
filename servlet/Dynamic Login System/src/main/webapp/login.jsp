<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <h1>Login Page</h1>
    <form action="login" method="post">
        <label for="username">Username: </label> 
        <input type="text" name="username" placeholder="username" required="required" /><br>
        <label for="password">Password: </label>
        <input type="password" name="password" placeholder="password" required="required" /><br>
        <input type="submit" value="Login" /><br>
    </form>
</body>
</html>