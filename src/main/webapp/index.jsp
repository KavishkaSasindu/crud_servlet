<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<form action="addUser" method="post">
    username : <input type="text" name="username" id="username">
    email : <input type="email" name="email" id="email">
    job : <input type="text" name="job" id="job">
    age : <input type="text" name="age" id="age">

    <button type="submit">AddUser</button>
    <button type="reset">Cancel</button>
</form>
</body>
</html>