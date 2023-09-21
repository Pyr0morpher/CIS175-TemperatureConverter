<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <title>Fahrenheit to Celsius Converter</title>
</head>
<body>
    <h1>Fahrenheit to Celsius Converter</h1>
    <form action="fConvertServlet" method="post">
        Enter temperature in Fahrenheit: <input type="text" name="fahrenheit">
        <input type="submit" value="Convert">
    </form>
</body>
</html>
