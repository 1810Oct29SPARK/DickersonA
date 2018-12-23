package ProjectDAO;

import java.util.ArrayList;
import java.util.List;

import Beans.Credentials;

public class CredsUt {
	public boolean isEmployee(String username, String password) {
	CredentialsDAO cred = new CredentialsDAOImpl();
	List<Credentials> credlist = new ArrayList<Credentials>();
	credlist = cred.getEmployeeInfo();
	for(Credentials c:credlist) {
		if(c.getUsername().equals(username)&&c.getPassword().equals(password)) {
			return true;
		}
		
	}
	return false;
}
}