package ProjectDAO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Beans.Credentials;
import Beans.Invoice;
import Project1.util.ConnectionUtil;
import oracle.sql.BLOB;

public class InvoiceDAOImpl implements InvoiceDAO {

	public InvoiceDAOImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Invoice> getEmployeeID() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void submitReimbursement(double reimburse, File photo) {
		 
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
		String sql = "INSERT INTO INVOICE "+"VALUES (?,?,?,?)";
		
		try {
			 FileInputStream in = new FileInputStream(photo);
			pstmt = con.prepareStatement(sql);
			pstmt.setDouble(2,reimburse);
			pstmt.setBinaryStream(4, in);
			pstmt.executeUpdate();
			pstmt.close();
			con.close();
		} catch (SQLException | FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void getReimbursement(int empid) {
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
		String sql = "SELECT * FROM INVOICE WHERE EMPLOYEE_ID = ?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, empid);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
