package com.ejemploJSF3.modelo;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

@ManagedBean(name ="ejemploJSF3", eager=true)
@RequestScoped
public class ejemploJSF3 {
	//Propiedad ManagedProperty
	@ManagedProperty (value="#{message}")
	
	
	//agregamos dos propiedades
	private message messageBean;
	private String message;
	
	//agregamos un constructor
	public ejemploJSF3()
	{
		System.out.println("Bien hecho");
	}
	
	//Agregamos los getters y setter de las propiedades.
	public String getmessage()
	{
		if(messageBean !=null)
		{
			message = messageBean.getmessage();
		}
		return message;
	}
	
	public void setmessage(message message)
	{
		this.messageBean = message;
	}
}
