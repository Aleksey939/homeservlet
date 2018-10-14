package org.itstep;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class HomeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        PrintWriter writer = resp.getWriter();

        String a=req.getParameter("a");
        String b=req.getParameter("b");
        String op=req.getParameter("op");
        
        switch (op){
            case "add": int aInt = Integer.parseInt(a);
                         int bInt = Integer.parseInt(b);
                         writer.println(aInt + bInt);
        }
    }
}
