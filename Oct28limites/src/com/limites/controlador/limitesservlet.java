package com.limites.controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.limites.modelo.*;
/**
 * Servlet implementation class limitesservlet
 */
@WebServlet("/limitesservlet")
public class limitesservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public limitesservlet() {
        super();
        // TODO Auto-generated constructor stub
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
		//doGet(request, response);
	
	String snumero1;
	String snumero2;
	int inumero1;
	int inumero2;
	
	snumero1 = request.getParameter("txtNumber1");
	snumero2 = request.getParameter("txtNumber2");
	
	inumero1 = Integer.parseInt(snumero1);
	inumero2 = Integer.parseInt(snumero2);
	
	response.getWriter().append("El límite entre "+inumero1+"y"+inumero2+"es:");

	//for(int i=inumero2; i<=inumero1; i++)
				//{
					//response.getWriter().append("i");
				//}
	//for (int i=inumero1; i<=inumero2; i--)
	//{
		//response.getWriter().append("i");
	//}
	
	////////////////////////////////////////////////////////////////////////para el while
	
	int i=inumero1;
	
	while (i<=inumero2)
	{
		i++;
		response.getWriter().append("\n"+i);
	}
	while (i>=inumero2)
	{
		i--;
		response.getWriter().append("\n"+i);
	}
	
	
	}
}
