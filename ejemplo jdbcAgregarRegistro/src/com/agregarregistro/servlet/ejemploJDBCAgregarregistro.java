package com.agregarregistro.servlet;

import java.io.IOException;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

/**
 * Servlet implementation class ejemploJDBCAgregarregistro
 */
@WebServlet("/ejemploJDBCAgregarregistro")
public class ejemploJDBCAgregarregistro extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ejemploJDBCAgregarregistro() {
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
	String sUser = "root";
	String sPass ="cheny123";
	String sSQL = "SELECT * FROM usuarios";
			
			Connection conn;
			Statement st;
			ResultSet rsDatos;
	
			try
			{
				Class.forName("com.mysql.jdbc.Driver").newInstance();
				conn = (Connection) DriverManager.getConnection(sUrl, sUser, sPass);
				st = (Statement) conn.createStatement();
				rsDatos= st.executeQuery(sSQL);
				while(rsDatos.next())
				{
					response.getWriter().append((char) rsDatos.getInt("idusuarios")+"</br>");
					response.getWriter().append(rsDatos.getString("username")+"</br>");
					response.getWriter().append(rsDatos.getString("email")+"</br>");
					response.getWriter().append(rsDatos.getString("password")+"</br>");
				}
			}
			catch(Exception e)
			{
				response.getWriter().append("El Error que ocurrió fue: " +e);
			}
	}

}
