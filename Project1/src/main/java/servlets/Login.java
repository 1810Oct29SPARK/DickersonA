package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Beans.Credentials;
import Beans.Employee;
import Services.Authserv;

@WebServlet ("/Login")
public class Login extends HttpServlet{
		Authserv a = new Authserv();
		String username;
		String password;
		@Override
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			request.getRequestDispatcher("Login.html").forward(request, response);
	}
		@Override
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			HttpSession session = request.getSession();
			response.setContentType("text/html");
			Credentials cd = new Credentials(request.getParameter("username"),request.getParameter("password"));
			Employee e = a.isValidEmployee(request.getParameter("username"), request.getParameter("password"));
		if (e != null) {
			
			session.setAttribute("Employeeid", e.getEmployeeid());
			session.setAttribute("Firstname", e.getFirstname());
			session.setAttribute("Lastname", e.getLastname());
			session.setAttribute("CompanyPosition", e.getCompanyposition());
			session.setAttribute("EmployeeManager", e.getEmpmanager());
			response.sendRedirect("employee");
			}
			else 
			{
				response.sendRedirect("Login");
			}
		}
			
}
