<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css">
    </head>
    </body>
        <h2>Telusko Calculator</h2>

         <form action="add">
                <label for="num1">Enter 1st Number :</label>
                <input type="text" id=num1 name="num1"><br>
                <label for="num2">Enter 2nd Number :</label>
                <input type="text" id="num2" name="num2"><br>
                <input type="submit" value="Submit">
            </form>

    </body>
</html>
