<%-- 
    Document   : arithmeticCalculator
    Created on : Jan 26, 2021, 3:48:32 PM
    Author     : Trevor Erixon
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form method="post" action="arithmetic">
            First: <input type="text" name="firstInt" value="${firstInt}"><br>
            Second: <input type="text" name="secondInt" value="${secondInt}"><br>
            <input type="submit" value="+" name="inputType">
            <input type="submit" value="-" name="inputType">
            <input type="submit" value="*" name="inputType">
            <input type="submit" value="%" name="inputType">
            <br>
            <p>Result: ${calc}</p>
            <p><a href="age">Age Calculator</a></p>
        </form>
    </body>
</html>
