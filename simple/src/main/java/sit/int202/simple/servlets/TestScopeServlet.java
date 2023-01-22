package sit.int202.simple.servlets;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "TestScopeServlet", value = "/TestScope")
public class TestScopeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("rc", "This is Request Scope Attribute");

        HttpSession session = request.getSession();
        session.setAttribute("sc", "This is Session Scope Attribute");


        ServletContext servletContext = getServletContext();
        servletContext.setAttribute("ac", "This is Application Scope Attribute");

        servletContext.getRequestDispatcher("/test_scope.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
