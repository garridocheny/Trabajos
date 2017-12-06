package com.easygarden.dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import com.easygarden.model.Person;
import com.easygarden.util.DBConnector;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class PersonDAO {

	private Connection connection;

	public PersonDAO() {
		
	}

	public void addPerson(Person person) {
		try {
			connection = DBConnector.connectToDB("localhost", "EasyGardenDB", "root", "");
			System.out.println("Entrando al método de guardado");
			PreparedStatement stmt = (PreparedStatement) connection
					.prepareStatement("INSERT INTO persona (perid,pernom,perapp,perapm,pertel,percel,status_staid)"
							+ "values (?,?,?,?,?,?,?)");
			// Parámetros comienzan en 1
			stmt.setInt(1, person.getPerid());
			stmt.setString(2, person.getPernom());
			stmt.setString(3, person.getPerapp());
			stmt.setString(4, person.getPerapm());
			stmt.setString(5, person.getPertel());
			stmt.setString(6, person.getPercel());
			stmt.setString(7, person.getStatus());
			stmt.executeUpdate();
			connection.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception: " + e);
		}
	}

	public List<Person> getAllUsers() {
		List<Person> persons = new ArrayList<>();
		try {
			connection = DBConnector.connectToDB("localhost", "EasyGardenDB", "root", "");
			PreparedStatement stmt = (PreparedStatement) connection.prepareStatement("SELECT * FROM persona");
			ResultSet rs;
			rs = stmt.executeQuery();
			while (rs.next()) {
				
				Person person = new Person();
				person.setPerid(rs.getInt("perid"));
				person.setPernom(rs.getString("pernom"));
				person.setPerapp(rs.getString("perapp"));
				person.setPerapm(rs.getString("perapm"));
				person.setPercel(rs.getString("percel"));
				person.setPertel(rs.getString("pertel"));
				person.setStatus(rs.getString("status_staid"));
				persons.add(person);
			}
			connection.close();
		} catch (Exception e) {
			System.out.println("Exception: " + e);
		}

		return persons;
	}
}
