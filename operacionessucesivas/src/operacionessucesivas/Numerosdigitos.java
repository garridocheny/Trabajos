package operacionessucesivas;
import java.util.Scanner;


public class Numerosdigitos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int icuantasveces;
		int icifras;
		int icount=0;
		
		System.out.println("�Cu�ntos c�lculos quieres realizar, beep?");
		icuantasveces=sc.nextInt();
		
		int icuantas[] = new int [icuantasveces];
		for(int i=0; i< icuantas.length;i++)
		{
			System.out.println("\n Pon un n�mero y adivinar� cu�ntas cifras tiene");
			icifras=sc.nextInt();
			
			while(icifras > 0) 
			{
				icifras = icifras / 10;
				icount = icount + 1; 
			}
			System.out.format("El n�mero de d�gitos son "+ icount);
		}

	}
}
