package ProjectDAO;

import java.util.List;

import Beans.Invoice;

public interface InvoiceDAO {

	public List<Invoice> getEmployeeID();
	public Invoice submitReinbursement();
	public Invoice getReinbursement();
}
