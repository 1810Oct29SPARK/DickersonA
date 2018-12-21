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
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + invoiceid;
	result = prime * result + reimbursement;
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Invoice other = (Invoice) obj;
	if (invoiceid != other.invoiceid)
		return false;
	if (reimbursement != other.reimbursement)
		return false;
	return true;
}

}
