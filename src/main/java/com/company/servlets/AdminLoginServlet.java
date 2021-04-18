package com.company.servlets;

import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "AdminLoginServlet", urlPatterns = {"/adminlogin"})

public class AdminLoginServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("ADMIN PAGE");
        out.println("</body></html>");

        String login = request.getParameter("login");
        String password = request.getParameter("password");


        if(login.equals("admin")&& password.equals("admin")){
            this.getServletContext().setAttribute("zalogowany", "true");
            RequestDispatcher adminDispatcher = request.getRequestDispatcher("/dashboard");
            adminDispatcher.forward(request, response);
        }
        else{
            response.sendRedirect("loginFailed.jsp");
        }
    }
}


