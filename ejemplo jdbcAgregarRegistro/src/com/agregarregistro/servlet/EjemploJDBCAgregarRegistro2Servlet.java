package com.agregarregistro.servlet;

import java.io.IOException;
import java.sql.DriverManager;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

/**
 * Servlet implementation class EjemploJDBCAgregarRegistro2Servlet
 */
@WebServlet("/EjemploJDBCAgregarRegistro2Servlet")
public class EjemploJDBCAgregarRegistro2Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EjemploJDBCAgregarRegistro2Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		String sUrl="jdbc:mysql://localhost:3306/bananagest";
		String sUser="root";
		String sPass="cheny123";
		
		String txtIdGar=request.getParameter("txtIdGar");
		int iIdGar = Integer.parseInt(txtIdGar);
		String txtnameGar=request.getParameter("txtnameGar");
		String txtpass=request.getParameter("txtpass");
		String txtemail=request.getParameter("txtemail");
		
		
		Connection conn;
		Statement st;
		int iResultado= 0;
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			conn = (Connection) DriverManager.getConnection(sUrl, sUser, sPass);
			st =  (Statement) conn.createStatement();
			iResultado = st.executeUpdate("Insert INTO usuarios (idusuarios,username,password,email) values ("+iIdGar+",'"+txtnameGar+"','"+txtpass+"','"+txtemail+"')");
		
			if(iResultado==1)
			{
				response.getWriter().append("Has registrado un usuario");
			}
			conn.close();
		
			st.close();
		}
		catch(Exception e)
		{
			response.getWriter().append("El error fue: "+e);
		}
		
		
		}
}

