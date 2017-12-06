package operacionessucesivas;
import java.util.Scanner;


public class Numerosdigitos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int icuantasveces;
		int icifras;
		int icount=0;
		
		System.out.println("¿Cuántos cálculos quieres realizar, beep?");
		icuantasveces=sc.nextInt();
		
		int icuantas[] = new int [icuantasveces];
		for(int i=0; i< icuantas.length;i++)
		{
			System.out.println("\n Pon un número y adivinaré cuántas cifras tiene");
			icifras=sc.nextInt();
			
			while(icifras > 0) 
			{
				icifras = icifras / 10;
				icount = icount + 1; 
			}
			System.out.format("El número de dígitos son "+ icount);
		}

	}
}
