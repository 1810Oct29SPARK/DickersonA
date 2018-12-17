package ProjectDAO;

import java.util.List;

import Beans.Credentials;
import Beans.Employee;

public interface EmployeesDAO {
	public List<Employee> getEmployeeID();
	public Credentials updateUsername();
	public Credentials updatePassword();
}
