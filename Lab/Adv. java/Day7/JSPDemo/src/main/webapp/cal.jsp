<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Calculator</title>
</head>
<body>
   <form action="getresult.jsp">
       Number 1: <input type="text" name="num1" /><br/>
       Number 2: <input type="text" name="num2" /><br/>
       <select name="operation">
           <option value="add">Addition</option>
           <option value="sub">Subtraction</option>
           <option value="mul">Multiplication</option>
           <option value="div">Division</option>
       </select><br/>
       <button type="submit">Calculate</button>
   </form>
</body>
</html>
