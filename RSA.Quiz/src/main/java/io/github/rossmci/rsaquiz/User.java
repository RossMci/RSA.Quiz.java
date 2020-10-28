package io.github.rossmci.rsaquiz;

/**
 *
 * @author Ross Mcinerney
 */
// user Login Extra feature 2  if time allows 
public class User
{
	// getters and setters for user for use in the log in 
	public User()
	{
		this.userData = new UserData();
	}
	public User(String userName)
	{
		this.userData = new UserData();
		this.userName = userName;
	}
	public User(String userName, String password)
	{
		this.userData = new UserData();
		this.userName = userName;
		this.password = password;
	}
	//
	//	Properties
	//
	public String getUserName()
	{
		return userName;
	}
	public void setUserName(String userName)
	{
		this.userName = userName;
	}
	public String getPassword()
	{
		return password;
	}
	public void setPassword(String Password)
	{
		this.password = Password;
	}
	public UserData getUserData()
	{
		return userData;
	}
	public void setUserData(UserData userData)
	{
		this.userData = userData;
	}
	//
	//	Fields
	//
	private String password;
	private String userName;
	private UserData userData;
}
