package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.fasterxml.jackson.databind.ObjectMapper;

import Beans.Employee;
@WebServlet ("/session")
public class Session extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// grab current session, if it exists
		/*response.setContentType("application/json");
		HttpSession session = request.getSession(false);
		if (session != null && session.getAttribute("username") != null) {
			try {
				int Employeeid = Integer.parseInt(session.getAttribute("Employeeid").toString());
				String firstname = session.getAttribute("FirstName").toString();
				String lastname = session.getAttribute("LastName").toString();
				String pos = session.getAttribute("CompanyPosition").toString();
				String repto = session.getAttribute("EmployeeManager").toString();
				response.getWriter().write((new ObjectMapper()).writeValueAsString(e));
			} catch (Exception e) {
				e.printStackTrace();
				response.getWriter().write("{\"session\":null}");
			}
		} else {
			response.getWriter().write("{\"session\":null}");
		}*/
		// grab current session, if it exists
				response.setContentType("application/json");
				HttpSession session = request.getSession(false);
				if (session != null && session.getAttribute("username") != null) {
					try {
						int empid = Integer.parseInt(session.getAttribute("Employeeid").toString());
						String firstname = session.getAttribute("FirstName").toString();
						String lastname = session.getAttribute("LastName").toString();
						String pos = session.getAttribute("CompanyPosition").toString();
						String repto = session.getAttribute("EmployeeManager").toString();
						Employee e = new Employee(empid, firstname, lastname, pos,repto);

						response.getWriter().write((new ObjectMapper()).writeValueAsString(e));
					} catch (Exception e) {
						e.printStackTrace();
						response.getWriter().write("{\"session\":null}");
					}
				} else {
					response.getWriter().write("{\"session\":null}");
				}
	}

}
