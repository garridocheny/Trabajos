package com.easygarden.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.easygarden.dao.PersonDAO;
import com.easygarden.model.Person;
import com.google.gson.Gson;

/**
 * Servlet implementation class PersonServlet
 */
@WebServlet("/PersonServlet")
public class PersonServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private PersonDAO personDAO;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public PersonServlet() {
		super();
		// TODO Auto-generated constructor stub
		personDAO = new PersonDAO();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setCharacterEncoding("utf-8");
		if(request.getParameter("actionToDo").equals("getAllUsers"))
		{
			ArrayList<Person> persons = (ArrayList<Person>) personDAO.getAllUsers();
			String json = new Gson().toJson(persons);
			response.getWriter().append(json);
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		Person person = new Person();
		person.setPerid(0);
		person.setPernom(request.getParameter("txtnom"));
		person.setPerapp(request.getParameter("txtapp"));
		person.setPerapm(request.getParameter("txtapm"));
		person.setPertel(request.getParameter("txttel"));
		person.setPercel(request.getParameter("txtcel"));
		person.setStatus("01");
		try {
			personDAO.addPerson(person);
			response.getWriter().append("OK");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception: " + e);
		}

	}

}
