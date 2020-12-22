package org.vaadin.example;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import com.vaadin.guice.annotation.PackagesToScan;
import com.vaadin.guice.server.GuiceVaadinServlet;

@WebServlet(name = "Guice-Vaadin-Servlet", urlPatterns = "/*")
@PackagesToScan({ "org.vaadin.example", "org.vaadin.example.service" })
public class MyServlet extends GuiceVaadinServlet {
    private static final long serialVersionUID = 1L;

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("TEST 123");
        // servletConfig.getServletContext().setInitParameter("productionMode",
        // "false");
        super.init(servletConfig);
    }
}
