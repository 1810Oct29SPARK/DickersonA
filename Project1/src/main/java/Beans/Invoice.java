package Beans;

public class Invoice {

	public Invoice(int invoiceid, int reimbursement) {
		super();
		this.invoiceid = invoiceid;
		this.reimbursement = reimbursement;
	}
	public Invoice() {
	
	}
private int invoiceid;
private int reimbursement;
public int getInvoiceid() {
	return invoiceid;
}
public void setInvoiceid(int invoiceid) {
	this.invoiceid = invoiceid;
}
public int getReimbursement() {
	return reimbursement;
}
public void setReimbursement(int reimbursement) {
	this.reimbursement = reimbursement;
}
@Override
public String toString() {
	return "Invoice [invoiceid=" + invoiceid + ", reimbursement=" + reimbursement + "]";
}

}
