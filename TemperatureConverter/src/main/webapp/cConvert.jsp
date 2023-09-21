<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <title>Celsius to Fahrenheit Converter</title>
</head>
<body>
    <h1>Celsius to Fahrenheit Converter</h1>
    <form action="cConvertServlet" method="post">
        Enter temperature in Celsius: <input type="text" name="celsius">
        <input type="submit" value="Convert">
    </form>
</body>
</html>
