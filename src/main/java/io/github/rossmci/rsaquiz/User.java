/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.rossmci.rsaquiz;

/**
 *
 * @author Ross Mcinerney
 */
public class User
{
	String userName;
	String Password;
	UserData userData;

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
		return Password;
	}

	public void setPassword(String Password)
	{
		this.Password = Password;
	}

	public UserData getUserData()
	{
		return userData;
	}

	public void setUserData(UserData userData)
	{
		this.userData = userData;
	}

	public User(){
		this.userData = new UserData();
	}
	public User(String userName, String Password)
	{
		this.userData = new UserData();
		this.userName = userName;
		this.Password = Password;
	}
	
}
