package project.main;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Beans.Credentials;
import Project1.util.ConnectionUtil;
import ProjectDAO.CredentialsDAO;
import ProjectDAO.CredentialsDAOImpl;

public class Main {

	public static void main(String[] args) {
	init();	
	CredentialsDAO cred = new CredentialsDAOImpl();
	cred.getEmployeeID();
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
