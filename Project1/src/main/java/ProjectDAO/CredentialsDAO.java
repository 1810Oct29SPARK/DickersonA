package ProjectDAO;

import java.util.List;
import Beans.Credentials;


public interface CredentialsDAO {
public List<Credentials> getEmployeeID();
public Credentials createUserName();
public Credentials deleteUserName();
public Credentials createUserPassword();
public Credentials deleteUserPassword();

}
