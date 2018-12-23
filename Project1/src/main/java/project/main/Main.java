package project.main;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import Beans.Credentials;
import Beans.Employee;
import Project1.util.ConnectionUtil;
import ProjectDAO.CredentialsDAO;
import ProjectDAO.CredentialsDAOImpl;
import ProjectDAO.EmployeesDAO;
import ProjectDAO.EmployeesDAOImpl;
import Services.Authserv;

public class Main {

	public static void main(String[] args) {
		//CredentialsDAOImpl cd = new CredentialsDAOImpl();
	//	System.out.println(cd.getEmployeeByUsername("ANNIE"));
		//EmployeesDAOImpl e = new EmployeesDAOImpl();
		//System.out.println(e.getEmployeeByID(2));
		//EmployeesDAOImpl em = new EmployeesDAOImpl();
		CredentialsDAOImpl cred = new CredentialsDAOImpl();
		cred.createUserNameandPassWord("GREATEST","BOSS" , 8);
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
