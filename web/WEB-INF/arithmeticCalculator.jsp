<%-- 
    Document   : arithmeticCalculator
    Created on : Jan 26, 2021, 3:48:32 PM
    Author     : 815822
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
        <form>
            First: <input type="text" name="firstInt"><br>
            Second: <input type="text" name="secondInt"><br>
            <input type="button" value="+" name="inputType">
            <input type="button" value="-" name="inputType">
            <input type="button" value="*" name="inputType">
            <input type="button" value="%" name="inputType">
            <br>
            <p>Result: ${calc}</p>
            <p><a href="age">Age Calculator</a></p>
        </form>
    </body>
</html>
