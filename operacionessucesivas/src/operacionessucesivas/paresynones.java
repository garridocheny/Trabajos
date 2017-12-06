package operacionessucesivas;
import java.util.Scanner;
public class paresynones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner (System.in);
		
		int icuantasveces=0;
		boolean par=true;
		
		System.out.println("Cuántos números quieres calcular?");
		icuantasveces=sc.nextInt();
		
		int icuantas[] = new int [icuantasveces]; 
		for (int i = 0; i < icuantas.length; i++) 
		{
			System.out.println("Escribe un número y te diré si es par o impar");
			int iusuario=sc.nextInt();
			
				if (iusuario%2==0)
				{
					par=true;
					System.out.println("Es Par");
				}else {
						System.out.println("No es Par");
					}
		}
	}
}

