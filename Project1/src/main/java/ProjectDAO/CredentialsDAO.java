package ProjectDAO;

import java.util.List;
import Beans.Credentials;


public interface CredentialsDAO {
public List<Credentials> getEmployeeID();
public void createUserNameandPassWord(String username, String password, int emplid);
public void deleteUserName(String username);
public void updateUserPassword(String password, String username);

}
