<!DOCTYPE html>
<html>
<head>
    <title>Login</title>
    <link rel="stylesheet" href="css/styles.css">
    <script src="js/validation.js"></script>
</head>
<body>
    <form action="LoginServlet" method="post" onsubmit="return validateLoginForm()">
        Username: <input type="text" name="username" /><br>
        Password: <input type="password" name="password" /><br>
        <input type="submit" value="Login" />
        <p><a href="register.jsp">Register</a></p>
    </form>
    <% if (request.getAttribute("error") != null) { %>
        <p><%= request.getAttribute("error") %></p>
    <% } %>
</body>
</html>
