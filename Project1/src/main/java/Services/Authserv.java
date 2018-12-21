package Services;

import Beans.Credentials;
import Beans.Employee;
import ProjectDAO.EmployeesDAO;
import ProjectDAO.EmployeesDAOImpl;

public class Authserv {

	public Authserv() {
		
	}
	public Employee isValidEmployee(Credentials credentials, String username, String password) {
		Employee e = null;
		String user= credentials.getUsername();
		String pass= credentials.getPassword();
		if (user != null && pass != null) {
		if (user.equals(username) && pass.equals(password)) {
			e = new Employee(e.getEmployeeid(),e.getFirstname(),e.getLastname(),e.getCompanyposition(),e.getEmpmanager());
			
		}
		
	}
		return e;
}
}