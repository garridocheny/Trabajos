package com.bdconnectionstring.servlet;

import java.io.IOException;
import java.sql.ResultSet;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

/**
 * Servlet implementation class BDConnectionStringServlet
 */
@WebServlet("/BDConnectionStringServlet")
public class BDConnectionStringServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private DataSource dataSource;  
    private Connection conn;
    private Statement st;
    
    /**
     * @see HttpServlet#HttpServle6t()
     */
    public BDConnectionStringServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		try
		{
		//Obtener conexión
		Context initContext = new InitialContext();
		Context envContext = (Context) initContext.lookup("java:/comp/env");
		dataSource = (DataSource) envContext.lookup("jdbc/bababagest");
		}
		catch(Exception e)
		{
			System.out.println("Ha sucedido la siguiente excepción: " + e);
		}
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());

		try
		{
		// Obtenemos la conexión y la sentencia SQL.
			conn = (Connection) dataSource.getConnection();
			st = (Statement) conn.createStatement();
			String consulta = "SELECT * FROM usuarios";
			ResultSet rsDatos = st.executeQuery(consulta);
			
			while(rsDatos.next())
			{
				System.out.println(rsDatos.getInt("idusuarios"));
				System.out.println(rsDatos.getString("usuername"));
				System.out.println(rsDatos.getString("password"));
				System.out.println(rsDatos.getString("email"));
			}
		}
		catch(Exception e)
		{
			
		}
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
