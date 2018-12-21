package ProjectDAO;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Beans.Credentials;
import Beans.Employee;
import Project1.util.ConnectionUtil;

public class EmployeesDAOImpl implements EmployeesDAO {

	public EmployeesDAOImpl() {
	
	}

	
	public List<Employee> getEmployee() {
		List<Employee> em = new ArrayList<>();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con = ConnectionUtil.getConnection("connections.properties");
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		String sql = "SELECT * "+"FROM EMPLOYEE";
		try {
			pstmt = con.prepareStatement(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			rs = pstmt.executeQuery(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			while (rs.next()) {
				int empID = rs.getInt(1);
				String firstname = rs.getString(2);
				String lastname = rs.getString(3);
				String companyposition = rs.getString(4);
				String empmanager = rs.getString(5);
				int expenseid = rs.getInt(6);
				System.out.println(empID);
				em.add(new Employee(empID,firstname,lastname,companyposition,empmanager));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			rs.close();
			pstmt.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return em;
	}


	@Override
	public void createEmployee(int employeeid, String firstname, String lastname, String companyposition, String empmanager
			 ) {
		List<Employee> em = new ArrayList<>();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con = ConnectionUtil.getConnection("connections.properties");
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	String sql = "INSERT INTO Employee "+ "VALUES(?,?,?,?,?,?)";
	try {
		pstmt= con.prepareStatement(sql);
		pstmt.setInt(1, employeeid);
		pstmt.setString(2, firstname);
		pstmt.setString(3, lastname);
		pstmt.setString(4, companyposition);
		pstmt.setString(5, empmanager);
		pstmt.executeUpdate();
		pstmt.close();
		con.close();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
				
	}


	@Override
	public void deleteEmployee(int employeeid)
			  {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "DELETE FROM EMPLOYEE "+ "WHERE EMPLOYEE_ID = ?";
		
		try {
			try {
				con = ConnectionUtil.getConnection("connections.properties");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			pstmt= con.prepareStatement(sql);
			pstmt.setInt(1, employeeid);
			
			pstmt.executeUpdate();
			pstmt.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	@Override
	public void updateEmployeeName(String orgfirst, String orgsecond, String newfirst, String newsecond, int empid) 
	{
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con = ConnectionUtil.getConnection("connections.properties");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String sql = "UPDATE EMPLOYEE "+ "SET FIRST_NAME = ? "+ "LAST_NAME = ? "+"WHERE EMPLOYEE_ID = ?";
		
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, orgsecond);
			pstmt.setString(2, newsecond);
			pstmt.setInt(3, empid);
			pstmt.executeUpdate();
			pstmt.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

	