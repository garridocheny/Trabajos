package com.practicaloginbien.model;

public class LoginBean {
	private String email;
	private String password;
	
	public String getemail()
	{
		return email;
	}
	
	public void setemail(String _email)
	{
		email=_email;
	}
	public String getpasswrod()
	{
		return password;
	}
	public void setpassword(String _password)
	{
		password=_password;
	}
	
	public boolean validatelogin(String _email, String _password) 
	{
		//boolean isvalid=false;
		
		if (_email.equals("admin@admin.com") && _password.equals("admin"))
		{
			return true;
		}
		else
		{
			return false;
		}
		
		//return isvalid
	}
}
