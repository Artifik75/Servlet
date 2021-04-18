package com.company.servlets;

import com.company.controller.Book;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "UserLoginServlet", urlPatterns = {"/userlogin"})
public class UserLoginServlet extends javax.servlet.http.HttpServlet {
    private Map<Integer,String> mapa;
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {


        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("USER PAGE");
        out.println("</body></html>");

        String login = request.getParameter("login");
        String password = request.getParameter("password");


        if(checkUser(password)){
            this.getServletContext().setAttribute("zalogowany", "true");
            RequestDispatcher userDispatcher = request.getRequestDispatcher("/dashboard");
            userDispatcher.forward(request, response);
        }
        else{
            response.sendRedirect("loginFailed.jsp");
        }
    }

    @Override
    public void init() throws ServletException {

        mapa = new HashMap<>();
        mapa.put(1,"user1");
        mapa.put(2,"user2");
        mapa.put(3,"user3");
        mapa.put(4,"user4");
        mapa.put(5,"user5");
        super.init();
    }

    private Boolean checkUser(String pass){
        System.out.println(mapa.size());
        for(int i = 0;i<=mapa.size();i++)
        {
            System.out.println(mapa.get(i));
            if(pass.equals(mapa.get(i)))
            {
                return true;
            }
        }
        return false;

    }



}


