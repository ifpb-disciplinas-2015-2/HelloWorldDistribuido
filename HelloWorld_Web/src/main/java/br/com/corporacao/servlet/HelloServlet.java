package br.com.corporacao.servlet;

import java.io.IOException;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class HelloServlet extends HttpServlet {

    @EJB
   //private HelloWorld helloWorld;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nome = request.getParameter("nome");
        
                  
        HttpSession session = request.getSession();

        session.setAttribute("hello", null);
        RequestDispatcher dispatcher = request.getRequestDispatcher("HelloJSP.jsp");

        dispatcher.forward(request, response);
    }

}
