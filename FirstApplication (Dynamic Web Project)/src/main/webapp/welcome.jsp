<!DOCTYPE html>
<html>
<head>
    <title>Welcome</title>
</head>
<body>
    <h1>Welcome, <%= session.getAttribute("user") %></h1>
    <a href="LogoutServlet">Logout</a>
</body>
</html>
