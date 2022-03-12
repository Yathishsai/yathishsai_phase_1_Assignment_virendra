package com.flightbooking.servlets;
import java.io.IOException;
import java.rmi.ConnectIOException;
import java.sql.SQLException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/FlightList")
public class ListOfFlights extends HttpServlet {
private static final long serialVersionUID = 1L;
 
protected void doPost(HttpServletRequest request, HttpServletResponse 
response) throws ServletException, IOException {
String from=request.getParameter("from");
String to=request.getParameter("to");
String departure=request.getParameter("departure");
ConnectIOException dao = new ConnectIOException(departure);

HttpSession session=request.getSession();
session.getAttribute("flights");
response.sendRedirect("FlightList.jsp");
}
}