package sit.int202.classicmodelweb.servlets;

import at.favre.lib.crypto.bcrypt.BCrypt;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import sit.int202.classicmodelweb.entities.Customer;
import sit.int202.classicmodelweb.repositories.CustomerRepository;

import java.io.IOException;

@WebServlet(name = "LoginServlet", value = "/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String password = request.getParameter("password");
        String userName = request.getParameter("userName");
        if(userName==null || userName.trim().length()==0) {
            response.sendError(HttpServletResponse.SC_BAD_REQUEST);
            return;
        }
        System.out.println(password);
        System.out.println(userName);
        CustomerRepository customerRepository = new CustomerRepository();
        Customer customer = customerRepository.findByName(userName);
        if (customer==null) {
            response.sendError(HttpServletResponse.SC_FORBIDDEN);
        } else {
            BCrypt.Result result = BCrypt.verifyer().verify(password.toCharArray(), customer.getPassword());
            if (!result.verified || !result.validFormat) {
                response.sendError(HttpServletResponse.SC_UNAUTHORIZED);
            } else {
                request.getSession().setAttribute("user", customer);
            }
        }
    }
}
