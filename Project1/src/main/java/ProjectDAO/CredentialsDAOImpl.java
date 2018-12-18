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
		String sql = "SELECT EMPLOYEE_ID "+"FROM EMPLOYEE";
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
	public void createUserNameandPassWord(String username1,String pass, int emplid) {
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
	String sql = "INSERT INTO CREDENTIALS "+ "VALUES(?,?,?)";
	try {
		pstmt= con.prepareStatement(sql);
		pstmt.setString(1, username1);
		pstmt.setString(2, pass);
		pstmt.setInt(3, emplid);
		pstmt.executeUpdate();
		pstmt.close();
		con.close();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	}

	@Override
	public void deleteUserName(String username) {
		List<Credentials> cd = new ArrayList<>();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "DELETE FROM CREDENTIALS "+ "WHERE USER_NAME = ?";
		
		try {
			try {
				con = ConnectionUtil.getConnection("connections.properties");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, username);
			pstmt.executeUpdate();
			pstmt.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}


	@Override
	public void updateUserPassword(String password, String username) {
		List<Credentials> cd = new ArrayList<>();
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
		String sql = "UPDATE CREDENTIALS "+ "SET PASSCODE = ? "+ "WHERE USER_NAME = ?";
		
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, password);
			pstmt.setString(2, username);
			pstmt.executeUpdate();
			pstmt.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		
	}

}
