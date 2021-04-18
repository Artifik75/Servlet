package com.company.servlets;

import com.company.controller.Book;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

@WebServlet(name = "DashboardServlet", urlPatterns = "/dashboard")
public class DashboardServlet extends HttpServlet {
    public static HashMap<Integer, Book> map;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    if(!((request.getParameter("title")) == null)){
        map.put(map.size(),new Book(request.getParameter("title"),
                (request.getParameter("author")),(Integer.parseInt(request.getParameter("year")))));
    }else {
        PrintWriter out = response.getWriter();
        System.out.println((request.getParameter("usun")));
        map.remove(Integer.parseInt(request.getParameter("usun")));
    }
        response.sendRedirect("dashboard.jsp");
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        PrintWriter out = response.getWriter();
        map = new HashMap<>();
        map.put(0, (Book)this.getServletContext().getAttribute("book1"));
        map.put(1, (Book)this.getServletContext().getAttribute("book2"));
        map.put(2, (Book)this.getServletContext().getAttribute("book3"));
        map.put(3, (Book)this.getServletContext().getAttribute("book4"));

        response.sendRedirect("dashboard.jsp");
    }
}

