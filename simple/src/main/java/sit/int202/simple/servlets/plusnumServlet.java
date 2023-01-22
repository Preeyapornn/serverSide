package sit.int202.simple.servlets;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "plusnumServlet", value = "/plusnum")
public class plusnumServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doProcess(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       doProcess(request, response);
    }

    private void doProcess(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        String num1Str = request.getParameter("num1");
        String num2Str = request.getParameter("num2");
        double result = Double.valueOf(num1Str) + Double.valueOf(num2Str);
        request.setAttribute("num1", num1Str);
        request.setAttribute("num2", num2Str);
        request.setAttribute("result", result);
        request.getRequestDispatcher("/plusnum.jsp").forward(request, response);

    }
}
