package com.flightbooking.servlets;
import java.io.IOException;
import java.sql.SQLException;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.sql.ConnectionEvent;


@WebServlet("/UserLogin")
public class LoginOfUser<ConnectionUtil> extends HttpServlet {
private static final long serialVersionUID = 1L;
protected void doPost(HttpServletRequest request, HttpServletResponse response) 
throws ServletException, IOException {
String email=request.getParameter("email");
String password=request.getParameter("password");
ConnectionUtil dao=(ConnectionUtil) new ConnectionEvent(null, null);
Object user=((Object) dao);
HttpSession session=request.getSession();
if(user!=null) {
session.setAttribute("user", user);
response.sendRedirect("HomePage.jsp");
}
else {
session.setAttribute("message", "Invalid Details");
response.sendRedirect("UserPage.jsp");
}
}}
