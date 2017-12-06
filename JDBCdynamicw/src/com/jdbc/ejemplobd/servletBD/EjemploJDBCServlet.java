package com.jdbc.ejemplobd.servletBD;

import java.io.IOException;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

/**
 * Servlet implementation class EjemploJDBCServlet
 */
@WebServlet("/EjemploJDBCServlet")
public class EjemploJDBCServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EjemploJDBCServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("");
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		StringBuffer sb = new StringBuffer();
		String surl = "jdbc:mysql://localhost:3306/BananaGEST";
		String suser = "root";
		String spassword = "cheny123";
		//String dameUSuarios = "SELECT * FROM usuarios";
		
		String sformname;
		String sformpass;
		
		sformname = request.getParameter("txtUsername");
		sformpass = request.getParameter("txtPassword");
		
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			conn = (Connection) DriverManager.getConnection(surl, suser, spassword);
			st = (Statement) conn.createStatement();
			rs = st.executeQuery("SELECT * FROM usuarios WHERE username='"+ sformname + "' and password='" + sformpass +"';");
			
			
			if(rs==null)
			{
				//response.getWriter().append("Result está vacío");
				response.sendRedirect("errorlogin.jsp");
			}
			else
			{
				rs.next();
				response.getWriter().append("Esult no está vacío");
			response.getWriter().append("IDUsuario"+rs.getInt("idusuarios"));
			response.getWriter().append("Nombre Usuario"+rs.getString("username"));
			}
			conn.close();
		}
		catch (Exception e)
		{
			response.getWriter().append("Hubo un error tipo: " +e);
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
