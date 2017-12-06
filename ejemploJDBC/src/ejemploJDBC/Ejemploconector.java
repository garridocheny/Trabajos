package ejemploJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Statement;

public class Ejemploconector {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		String surl = "jdbc:mysql://localhost:3306/prueba";
		String susername= "root";
		String spassword= "cheny123";
		
		//String databaseURL = "jdbc:mysql://localhost:3306/prueba?user=root&password=cheny123";
		
		Connection conn = DriverManager.getConnection
				(surl, susername, spassword);
		
		Statement stmntSentenciaSQL = (Statement) conn.createStatement();
		/*String insertaRegistro = "INSERT INTO Usuarios (IdUsuarios, nombreUsuario, passwordUsuario, email) values (10, \"Usuarios\",\"usuario5\", \"usr@htomail.com\")"; 
		
		
		int registrosAfectados=stmntSentenciaSQL.executeUpdate(insertaRegistro);
		
		if (registrosAfectados!=0)
		{
			System.out.println("Se insertó bien");
		}*/
		
		ResultSet rsDatos = stmntSentenciaSQL.executeQuery("SELECT idProyectos, nombreproyecto, Descripcion FROM Proyectos");
		
		System.out.println("-----------------------------------------------------");
		System.out.println("idProyecto \t nombreproyecto");
		System.out.println("-----------------------------------------------------");
		
		while(rsDatos.next())
		{
			//System.out.println("id Proyectos :"+rsDatos.getInt("idProyectos"));
			//System.out.println("Nombre Proyecto :"+rsDatos.getString("nombreProyecto"));
			System.out.println("|"+rsDatos.getInt("idProyectos"));
			System.out.println("| \t"+rsDatos.getString("nombreProyecto"));
			System.out.println("| \t"+rsDatos.getString("Descripcion"));
			
		}
		//Connection conn2 = DriverManager.getConnection
				//(databaseURL);
		try
		{
		//Iniciar una instancia o un objeto de este controllador "Class.forName"
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			System.out.println("Testo bien");
			conn = DriverManager.getConnection
					(surl, susername, spassword);
			
			conn.setAutoCommit(false);
			
			String insertaRegistro2 = "INSERT INTO Usuarios (IdUsuarios, nombreUsuario, passwordUsuario, email) values (11, \"Usuarios\",\"usuario10\", \"usr20@htomail.com\")"; 
			String insertaRegistro3 = "INSERT INTO Usuarios (IdUsuarios, nombreUsuario, passwordUsuario, email) values (12, \"Usuarios\",\"usuario11\", \"usr3@htomail.com\")"; 
			
			stmntSentenciaSQL.executeUpdate(insertaRegistro2);
			stmntSentenciaSQL.executeUpdate(insertaRegistro3);
			conn.commit();

			//conn2 = DriverManager.getConnection
					//(databaseURL);
			
			if(conn !=null)
			{
				System.out.println("Conexión exitosa");
			}
			//if(conn2 !=null)
			{
				//System.out.println("Conexión exitosa");
			}
			stmntSentenciaSQL.close();
		}catch(Exception pepe) {
				System.out.println("Hubo el siguiente error "+pepe);
				conn.rollback();
				System.out.println("Hubo un rollback");
				
	}
		finally
		{
			
			conn.close();
			//conn2.close();
		}
	}
}
