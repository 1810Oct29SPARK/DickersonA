package Beans;

public class Employee {

	public Employee(int employeeid, String firstname, String lastname, String companyposition, String empmanager
			) {
		super();
		this.employeeid = employeeid;
		this.firstname = firstname;
		this.lastname = lastname;
		this.companyposition = companyposition;
		this.empmanager = empmanager;

	}
	public Employee() {
	}
	public Employee(int employeeid) {
		this.employeeid = employeeid;
	}
private int employeeid;
private String firstname;
private String lastname;
private String companyposition;
private String empmanager;

public int getEmployeeid() {
	return employeeid;
}
public void setEmployeeid(int employeeid) {
	this.employeeid = employeeid;
}
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public String getCompanyposition() {
	return companyposition;
}
public void setCompanyposition(String companyposition) {
	this.companyposition = companyposition;
}
public String getEmpmanager() {
	return empmanager;
}
public void setEmpmanager(String empmanager) {
	this.empmanager = empmanager;
}




@Override
public String toString() {
	return "Employee [employeeid=" + employeeid + ", firstname=" + firstname + ", lastname=" + lastname
			+ ", companyposition=" + companyposition + ", empmanager=" + empmanager + "]";
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((companyposition == null) ? 0 : companyposition.hashCode());
	result = prime * result + employeeid;
	result = prime * result + ((empmanager == null) ? 0 : empmanager.hashCode());
	result = prime * result + ((firstname == null) ? 0 : firstname.hashCode());
	result = prime * result + ((lastname == null) ? 0 : lastname.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Employee other = (Employee) obj;
	if (companyposition == null) {
		if (other.companyposition != null)
			return false;
	} else if (!companyposition.equals(other.companyposition))
		return false;
	if (employeeid != other.employeeid)
		return false;
	if (empmanager == null) {
		if (other.empmanager != null)
			return false;
	} else if (!empmanager.equals(other.empmanager))
		return false;
	if (firstname == null) {
		if (other.firstname != null)
			return false;
	} else if (!firstname.equals(other.firstname))
		return false;
	if (lastname == null) {
		if (other.lastname != null)
			return false;
	} else if (!lastname.equals(other.lastname))
		return false;
	return true;
}
}
