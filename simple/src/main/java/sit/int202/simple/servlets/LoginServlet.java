package sit.int202.simple.servlets;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "LoginServlet", value = "/Login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String user = request.getParameter("user");
        String password = request.getParameter("password");
        if( user == null || password == null || !"sitfirst".equals(password)){
            response.sendError(HttpServletResponse.SC_UNAUTHORIZED, "Please Login First ! ! !");
            return;
        }
        HttpSession session = request.getSession();
        session.setAttribute("user",user);
        request.getRequestDispatcher("/WEB-INF/page1.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
