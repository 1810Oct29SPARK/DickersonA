package ProjectDAO;

import java.io.File;
import java.sql.Blob;
import java.util.List;

import Beans.Invoice;
import oracle.sql.BLOB;

public interface InvoiceDAO {

	public List<Invoice> getEmployeeID();
	public void submitReimbursement(double reimburse, File photo);
	public void getReimbursement(int empid);
}
