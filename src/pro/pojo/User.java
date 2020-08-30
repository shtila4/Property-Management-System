package pro.pojo;

public class User {

	private String  account;
	private String  password;
	private String  identity;
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getIdentity() {
		return identity;
	}
	public void setIdentity(String identity) {
		this.identity = identity;
	}
	public User() {
		super();
	}
	public User(String account, String password, String identity) {
		super();
		this.account = account;
		this.password = password;
		this.identity = identity;
	}

}
