package com.example.demo.servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/simple-servlet")
public class SimpleServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req,
                         HttpServletResponse res) throws IOException {
        res.getWriter().write("OK");
    }
}
