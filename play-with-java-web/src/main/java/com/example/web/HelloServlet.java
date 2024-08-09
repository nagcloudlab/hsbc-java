package com.example.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        // read...

        // process..
        String responseMessage = "Hello, Client!, Welcome to the world of Java Web!";

        // write..
//        PrintWriter out = resp.getWriter();
//        // generate HTML response
//        out.println("<html>");
//        out.println("<body>");
//        out.println("<h1>" + responseMessage + "</h1>");
//        out.println("</body>");
//        out.println("</html>");
//        out.close();

        req.setAttribute("message", responseMessage);
        req.getRequestDispatcher("/hello-response.jsp").forward(req, resp);


    }
}
