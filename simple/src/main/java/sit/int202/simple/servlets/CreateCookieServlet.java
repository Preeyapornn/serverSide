package sit.int202.simple.servlets;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "TestCookieServlet", value = "/CreateCookie")
public class CreateCookieServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String bg = request.getParameter("bg");
        String fg = request.getParameter("fg");
        if (bg == null) {
            bg = "yellow";
        }
        if (fg == null) {
            fg = "darkblue";
        }
        Cookie a = new Cookie("background-color", bg);
        Cookie b = new Cookie("foreground-color", fg);
        a.setMaxAge(7 * 60 * 60 * 24);
        b.setMaxAge(7 * 60 * 60 * 24);
        response.addCookie(a);
        response.addCookie(b);
        response.getWriter().println("<html><body>Cookie has been created !!</body></html>");
    }
        @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
