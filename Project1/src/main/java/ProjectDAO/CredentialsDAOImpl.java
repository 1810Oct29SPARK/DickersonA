package ProjectDAO;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Beans.Credentials;
import Project1.util.ConnectionUtil;

public class CredentialsDAOImpl implements CredentialsDAO {

	public CredentialsDAOImpl() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public List<Credentials> getEmployeeID() {
		List<Credentials> cd = new ArrayList<>();
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
		String sql = "SELECT ALL EMPLOYEE_ID "+"FROM EMPLOYEE"+
		"WHERE EMPLOYEE_ID =?";
		try {
			pstmt = con.prepareStatement(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {;
			rs = pstmt.executeQuery(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			while (rs.next()) {
				String empID = rs.getString(1);
				
				System.out.println(empID);
				cd.add(new Credentials(empID));
				
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
		return cd;
	}

	@Override
	public Credentials createUserName() {
		List<Credentials> cd = new ArrayList<>();
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
		return null;
	}

	@Override
	public Credentials deleteUserName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Credentials createUserPassword() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Credentials deleteUserPassword() {
		// TODO Auto-generated method stub
		return null;
	}

}
