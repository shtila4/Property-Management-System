package pro.dao;

import pro.pojo.User;

public interface UserDao {
	public User getUser(String account,String password,String identity);
	public User getcUser(String account);
	public int addUser(String account,String password,String identity);
}
