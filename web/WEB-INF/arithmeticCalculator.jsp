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
            First: <input type="text" name="first"><br>
            Second: <input type="text" name="second"><br>
            <input type="button" value="+">
            <input type="button" value="-">
            <input type="button" value="*">
            <input type="button" value="%">
            <br><br>           
        </form>
        <p>Result: ${calc}</p>
    </body>
</html>
