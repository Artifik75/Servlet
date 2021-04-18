package com.company.servlets;

import com.company.controller.Book;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "WelcomeServlet",urlPatterns = "/app")
public class WelcomeServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        try {
            String login = (String) this.getServletContext().getAttribute("zalogowany");
            if (!(login == null) && login.equals("true")) {
                RequestDispatcher dashboardDispatcher = request.getRequestDispatcher("/dashboard");
                dashboardDispatcher.forward(request, response);
            } else {
                response.sendRedirect("login.jsp");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}