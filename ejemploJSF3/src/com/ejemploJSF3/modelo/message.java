package com.ejemploJSF3.modelo;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name="message", eager=true)
@RequestScoped
public class message {
	private String smessage = "ejemploJSF3ljnln";
	
	public String getmessage()
	{
		return smessage;
	}
	
	public void setmessage(String message)
	{
		smessage = message;
	}
	
}
