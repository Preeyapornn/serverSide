import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.Scanner;

@WebServlet(name = "plusPageServlet", value = "/plusPage")
public class plusPageServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    request.getRequestDispatcher("/plusPage.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int num1 = Integer.parseInt(request.getParameter("num1"));
        int num2 = Integer.parseInt(request.getParameter("num2"));
        int result = num1 + num2;
        int question = num1 + num2;

//        plusPage plus = new plusPage(num1, num2);
//        int result = (int) num1+num2;
       request.setAttribute("result", result);
        HttpSession session = request.getSession();
        session.setAttribute("question", question);
        request.getRequestDispatcher("/plusPage.jsp").forward(request,response);

    }
}
