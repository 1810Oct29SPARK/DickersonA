package Beans;

public class Credentials {

	public Credentials(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	public Credentials() {
		// TODO Auto-generated constructor stub
	}
	
	public Credentials(String empID) {
		super();
		this.empID = empID;
	}
	
private String username;
private String password;
private String empID;
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
@Override
public String toString() {
	return "Credentials [username=" + username + ", password=" + password + "]";
}

}
