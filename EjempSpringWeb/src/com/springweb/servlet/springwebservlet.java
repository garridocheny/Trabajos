package com.springweb.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.EjemploSpringWeb.Employees;

/**
 * Servlet implementation class springwebservlet
 */
@WebServlet("/springwebservlet")
public class springwebservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public springwebservlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		Employees empleado1 = new Employees();
		int idUsuario = Int.parseInt(request.getParameter("txtidUSuario"));
		String nombre=request.getParameter("txtidUsuario");
		empleado1.edad = 18; //Concretizar
		
		e1.setidEmployee(IntegerparseInt(requerst.getParameter("txtidUsuario"));
		
		PrintWriter salida = response.getWriter();
		
		salida.write("<html>");
		salida.write("<head></head>");
		salida.append("<body>");
		salida.append("<p>Usuario tiene id:"+empleado1.getidEmployee()+"</p>");
		salida.append("<p>Usuario tiene nombre:"+empleado1.getnameEmployee()+"</p>");
		salida.append("<p>Usuario se llama:"+empleado1.getaddressEmployee()+"</p>");
		salida.append("<p>Usuario tiene edad:"+empleado1.edad()+"</p>");
		salida.append("</body>");
		salida.write("</html>");
	}

}
