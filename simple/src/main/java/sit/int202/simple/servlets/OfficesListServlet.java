package sit.int202.simple.servlets;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import sit.int202.simple.repositories.OfficesRepository;

import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "OfficesListServlet", value = "/Offices-List")
public class OfficesListServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        OfficesRepository repository = new OfficesRepository();
        try {
            request.setAttribute("offices", repository.findAll());
        } catch (SQLException sqle){
            System.out.println(sqle.toString());
        }
        request.getRequestDispatcher("/offices-list.jsp").forward(request, response);


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
