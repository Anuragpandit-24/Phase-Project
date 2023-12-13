package com.example;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpServlet;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Hard-coded login values (replace with your own logic)
        String validEmail = "user@example.com";
        String validPassword = "password123";

        String email = request.getParameter("email");
        String password = request.getParameter("password");

        if (validEmail.equals(email) && validPassword.equals(password)) {
            // Successful login
            response.sendRedirect("dashboard.html");
        } else {
            // Invalid login
            response.sendRedirect("error.html");
        }
    }

}
