package com.skillnext1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/saveEmployee")
public class EmployeeServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        String name = req.getParameter("name");
        String email = req.getParameter("email");
        double salary = Double.parseDouble(req.getParameter("salary"));

        Employee emp = new Employee();
        emp.setName(name);
        emp.setEmail(email);
        emp.setSalary(salary);

        EmployeeDAO dao = new EmployeeDAO();
        boolean saved = dao.save(emp); 

        if (saved) {
            res.sendRedirect("success.jsp");
        } else {
            res.setContentType("text/html");
            res.getWriter().println("<h3>Database insert failed</h3>");
        }
    }
}
