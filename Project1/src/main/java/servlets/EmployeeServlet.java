package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet ("/employee")
public class EmployeeServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		System.out.println(session);
		if (session != null && session.getAttribute("Employeeid") != null) {
			System.out.println(session);
			request.getRequestDispatcher("employee.html").forward(request, response);
		} else {
			response.sendRedirect("home");
		}
}
	}
