package project.main;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import Project1.util.ConnectionUtil;
import ProjectDAO.CredentialsDAO;
import ProjectDAO.CredentialsDAOImpl;
import ProjectDAO.EmployeesDAO;
import ProjectDAO.EmployeesDAOImpl;

public class Main {

	public static void main(String[] args) {
	init();	
	CredentialsDAO cred = new CredentialsDAOImpl();
	//cred.getEmployeeID();
	//cred.deleteUserName("ANNIE");
	//cred.createUserNameandPassWord("ANNIE", "NOOT",2);
	cred.updateUserPassword("BOB","ANNIE");
	EmployeesDAO emp = new EmployeesDAOImpl();
	System.out.println(emp.getEmployee());
	}
	static void init() {
		try {
			Connection con = ConnectionUtil.getConnection("connections.properties");
			System.out.println(con);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
