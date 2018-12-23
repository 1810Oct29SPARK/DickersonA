package ProjectDAO;

import java.util.List;

import Beans.Employee;
import Beans.Invoice;

public interface EmployeesDAO {
	public void createEmployee(int employeeid, String firstname, String lastname, String companyposition, String empmanager
			);
	public void deleteEmployee(int employeeid);
	public void updateEmployeeName(String orgfirst, String orgsecond, String newfirst, String newsecond, int empid);
    public List<Employee> getEmployee();
	public Employee getEmployeeByID(int id);
}
