import java.util.Scanner;

public class locurasgeometria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		//PArte 1: El numero primo.
		
			int inumero;
			int iprimo;
			
			boolean boolprimo=true;
			
			char ccontinuar;
			
		do 
		{	
			System.out.println("Dime un número y te diré si es primo o no");
			inumero=sc.nextInt();
			
			for(int x=2;x<=inumero/2;x++)
			{
		           iprimo=inumero%x;
			   if (iprimo==0)
			   {
			      boolprimo=false;
			   }
			}
			if(boolprimo)
				{
			   System.out.println(inumero+" Es Primo");
				}
			else
				{
			System.out.println(inumero+" No es Primo");
			
				}
			
			System.out.println("¿Continuar? S=sí,   N=no.");
			ccontinuar=sc.next().charAt(0);
			
			
	   } while (ccontinuar=='s');
	
	}
}
