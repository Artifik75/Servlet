package com.company.servlets;

import com.company.type.Rola;

import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "LoginServlet", urlPatterns = {"/login"})
public class LoginServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {


        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("</body></html>");

        String login = request.getParameter("login");
        String password = request.getParameter("password");

        if(login.equals(Rola.USER.toString().toLowerCase())) {
            RequestDispatcher userDispatcher = request.getRequestDispatcher("/userlogin");
            userDispatcher.forward(request, response);
        }
        else{
            RequestDispatcher adminDispatcher = request.getRequestDispatcher("/adminlogin");
            adminDispatcher.forward(request, response);
        }
    }
}