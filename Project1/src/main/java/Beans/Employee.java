package Beans;

public class Employee {

	public Employee(int employeeid, String firstname, String lastname, String companyposition, String empmanager,
			String datehired, int expenseid) {
		super();
		this.employeeid = employeeid;
		this.firstname = firstname;
		this.lastname = lastname;
		this.companyposition = companyposition;
		this.empmanager = empmanager;
		this.datehired = datehired;
		this.expenseid = expenseid;
	}
	public Employee() {
	}
private int employeeid;
private String firstname;
private String lastname;
private String companyposition;
private String empmanager;
private String datehired;
private int expenseid;
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
public String getDatehired() {
	return datehired;
}
public void setDatehired(String datehired) {
	this.datehired = datehired;
}
public int getExpenseid() {
	return expenseid;
}
public void setExpenseid(int expenseid) {
	this.expenseid = expenseid;
}
@Override
public String toString() {
	return "Employee [employeeid=" + employeeid + ", firstname=" + firstname + ", lastname=" + lastname
			+ ", companyposition=" + companyposition + ", empmanager=" + empmanager + ", datehired=" + datehired
			+ ", expenseid=" + expenseid + "]";
}
}
