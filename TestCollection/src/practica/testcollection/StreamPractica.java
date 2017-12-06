package practica.testcollection;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class StreamPractica {

	public static void main(String[] args)  throws IOException {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader( 
				new 	FileReader("c:\\a\\b.jpg")); 
		String s= new String(); 
		while( (s = in.readLine()) != null) 
		{
			System.out.println(s);
		
	}
		in.close();

		BufferedWriter bw = new BufferedWriter(
				new FileWriter("c:\\a\\c.html"));
			bw.write("<html><head></header><body></body>");
			for (int i = 0; i < 10; i++) 
			{
			bw.write("<h1>Clico "+i+"</h1>, <h2>lol<h2>, <h3>fu</h3>	");
			}
			
			bw.close();
	}
}
