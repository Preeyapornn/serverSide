package sit.int202.simple.servlets;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.Enumeration;

@WebServlet(name = "TestRequestParameterServlet", value = "/TestReqParam")
public class TestRequestParameterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/favorite_subjects.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        Enumeration<String> paramNames = request.getParameterNames();
//        while (paramNames.hasMoreElements()){
//            String name  = paramNames.nextElement();
//            String value = request.getParameter(name);
//            System.out.println(name + ": " + value);
//        }
//        System.out.println("------------------------");
            String favSubjects[]  = request.getParameterValues("fav_subjects");
            if(favSubjects == null){
                response.sendError(HttpServletResponse.SC_BAD_REQUEST,
                        "Missing favorite subject parameter");
                return;
        }
            request.getRequestDispatcher("/favorite_subjects.jsp").forward(request, response);
//            if (favSubjects != null){
//                System.out.println("Favorite Subjects:");
//                for (String subject : favSubjects){
//                    System.out.println("\t" + subject);
//                }
//            } else {
//                System.out.println("No Request Parameter for Favorite Subject !!!");
//            }

    }
}

