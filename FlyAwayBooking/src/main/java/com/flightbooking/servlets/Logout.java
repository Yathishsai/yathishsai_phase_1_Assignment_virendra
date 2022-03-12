package com.flightbooking.servlets;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/Logout")
public class Logout<HttpServletRequest> extends HttpServlet {
private static final long serialVersionUID = 1L;
protected <HttpServletResponse> void doGet(HttpServletRequest request, HttpServletResponse response) 
throws ServletException, IOException {
HttpSession session=((javax.servlet.http.HttpServletRequest) request).getSession();
session.setAttribute("user", null);
((javax.servlet.http.HttpServletResponse) response).sendRedirect("HomePage.jsp");
}
}
