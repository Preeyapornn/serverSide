package sit.int202.simple.servlets;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import sit.int202.simple.entities.Subject;
import sit.int202.simple.repositories.SubjectRepository;

import java.io.IOException;
import java.util.List;

@WebServlet(name = "SubjectListServlet", value = "/SubjectListServlet")
public class SubjectListServlet extends HttpServlet {
    private List<Subject> subjects;
    private int requestCount;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    //    List<Subject> subjects =  new SubjectRepository().findAll();

        System.out.println("SubjectList was called "+ ++requestCount+ " time(s)");
        request.setAttribute("subjects",subjects);
        // request.getRequestDispatcher("/subject_listing.jsp").forward(request,response);
       getServletContext().getRequestDispatcher("/subject_listing.jsp").forward(request,response);

    }

    @Override
    public void destroy() {
        super.destroy();
        System.out.println("\n--------------------------------------");
        System.out.println("SubjectListServlet has die ! ! !");
        System.out.println("--------------------------------------\n");
    }

    @Override
    public void init() throws ServletException {
        super.init();
        System.out.println("\n--------------------------------------");
        System.out.println("SubjectListServlet has die ! ! !");
        System.out.println("--------------------------------------\n");
        this.subjects =  new SubjectRepository().findAll();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
