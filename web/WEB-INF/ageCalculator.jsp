<%-- 
    Document   : agecalculator
    Created on : Jan 26, 2021, 3:13:06 PM
    Author     : Trevor-Erixon
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form method="post" action="age">
            Enter your age: <input type="text" name="age"><br>
            <input type="submit" value="Age Next Birthday">
            <p>${message}</p>
            <a href="/arithmetic">
        </form>
    </body>
</html>
