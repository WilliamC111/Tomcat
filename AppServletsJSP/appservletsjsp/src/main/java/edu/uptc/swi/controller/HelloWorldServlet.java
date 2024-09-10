package edu.uptc.swi.controller;


import java.io.IOException;
import java.io.PrintWriter;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/HelloWorld")
public class HelloWorldServlet extends HttpServlet{
    private static final long serialVersionUID = 1L;


    public HelloWorldServlet() {
        super();
    }
    public void init(){


    }


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       PrintWriter out;
        out = resp.getWriter();
        resp.setContentType("text/html");
        out.println("<html>");
        out.println("<head><title>Ejemplo de Servlet</title></head>");
        out.println("<body>");
        out.println("<h1>Hola Mundo</h1>");
        out.println("</body></html>");
    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }


}
