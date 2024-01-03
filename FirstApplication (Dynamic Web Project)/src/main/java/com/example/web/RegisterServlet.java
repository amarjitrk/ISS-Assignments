package com.example.web;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class RegisterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Here you would add the logic to register a user.
        // For this example, simply redirect to the login page.
        // In a real application, you would store the user details in a database.

        response.sendRedirect("login.jsp");
    }
}
