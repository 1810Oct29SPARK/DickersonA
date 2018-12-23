package Services;

import java.util.List;

import Beans.Credentials;
import Beans.Employee;
import Beans.Invoice;
import ProjectDAO.CredentialsDAOImpl;
import ProjectDAO.CredsUt;
import ProjectDAO.EmployeesDAOImpl;

public class Authserv {

	public Authserv() {
		
	}
	public Employee isValidEmployee(Credentials credentials) {
		Employee e = null;
		EmployeesDAOImpl ed = new EmployeesDAOImpl();
		String user= credentials.getUsername();
		String pass= credentials.getPassword();
		if (user != null && pass != null) {
		
			List<Employee> emplist = ed.getEmployee();
			for (Employee emp: emplist) {
				
				if(user.equals(credentials.getUsername()) && pass.equals(credentials.getPassword())){
					e=emp;
					System.out.println(e);
				}
			}
		}
		
	
		return e;
}
	public Employee isValidEmployee(String username,String password) {
		Employee e = null;
		Invoice i = new Invoice();
		CredsUt cu = new CredsUt();
		CredentialsDAOImpl cd = new CredentialsDAOImpl();
		EmployeesDAOImpl ed = new EmployeesDAOImpl();
		Credentials c =new Credentials();
		if (username != null && password != null) {
			if(cu.isEmployee(username, password)) {
				e = ed.getEmployeeByID(cd.getEmployeeByUsername(username));
			}
			
		}
	return e;
	}
}