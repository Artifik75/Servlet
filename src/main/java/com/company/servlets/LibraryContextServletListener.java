package com.company.servlets;
import com.company.controller.Book;
import javax.servlet.*;
import javax.servlet.annotation.WebListener;
@WebListener
public class LibraryContextServletListener implements ServletContextListener, ServletContextAttributeListener {
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        ServletContext ctx = servletContextEvent.getServletContext();
        ctx.setAttribute("book1", new Book("Duchy minionych lat. Wiosenne przebudzenie.", "Jax, Joanna ", 2020));
        ctx.setAttribute("book2", new Book("Harry Potter i Czara Ognia", "J.K. Rowling", 2000));
        ctx.setAttribute("book3", new Book("Opowieści z Narni", "C.S. Lewis", 1950));
        ctx.setAttribute("book4", new Book("Przykład", "Jan Kowalski", 1994));
    }
    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
    }
    @Override
    public void attributeAdded(ServletContextAttributeEvent servletContextAttributeEvent) {
    }
    @Override
    public void attributeRemoved(ServletContextAttributeEvent servletContextAttributeEvent) {
    }
    @Override
    public void attributeReplaced(ServletContextAttributeEvent servletContextAttributeEvent) {
    }
}