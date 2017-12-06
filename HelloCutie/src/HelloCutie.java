import java.util.Scanner;
public class HelloCutie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int edad=30;
		Scanner sc = new Scanner(System.in);
		int n;
		byte bCalificaciones;
		float fpeso;
		String snombre;
		
		System.out.println("Ingresa tu nombre: ");
		snombre=sc.nextLine();
		System.out.println("Ingresa tu peso: ");
		fpeso=sc.nextFloat();
		System.out.println("Ingresa Calificación ");
		bCalificaciones=sc.nextByte();
		
		System.out.println("Bienvenido "+snombre+"!!!");
		
		if (fpeso<50)
		{
			System.out.println("You are beautiful!");
			
		}
		if (fpeso>=50&&fpeso<=80)
		{
			System.out.println("You are so hot!");
		}
		if (fpeso>80)
		{
			System.out.println("Damn you are sexy");
		}
		
		if (bCalificaciones<50)
		{
			System.out.println("¡Sigue luchando! No te rindas.");
		}
		if (bCalificaciones>=50&&bCalificaciones<=85)
		{
			System.out.println("¡Bien! Estudia un poco más y llegarás a la excelencia.");
		}
		if (bCalificaciones>85)
		{
			System.out.println("Ya eres excelente, pero ¿Eres un excelente ser humano?");
		}
		
		System.out.println("Suma loca de ambas: "+fpeso+bCalificaciones);
		
		final int EDAD=10;
		//Aquí e utiliza la variable Edad
		System.out.println("Hello Cutie"); 
		System.out.println(edad);
		edad+=10;
		System.out.println(edad);
		
		
		//Aquí se utiliza la constante edad
		System.out.println(EDAD);
		//EDAD+=10; este es error porque es constante.
		System.out.println(EDAD);
		
		
		//Ejercicio diapositiva 59.
		int x=3;
		int y=4;
		int z=x+y;
		
		System.out.println(z);
		
		float peso =56.8f;
		float pesoDos = 67.8f;
		float sumaPesos = peso+pesoDos;
				
		System.out.println(sumaPesos);
		
		double dUno = 450.4d;
		double dDos = 987.2d;
		double drespuesta = dUno+dDos;
		
		System.out.println(drespuesta);
		
		//Arrays
		String[] meses = {"Enero ", "Febrero ", "Marzo ", "Abril ", "Mayo ", "junio ", "julio ", "Agosto ", "Septiembre ", "Octubre ", "noviembre ", "Diciembre "};
		
		String[] dias = {"Lunes ", "Martes ", "Miercoles ", "Jueves ", "Viernes "};
		
		System.out.println("Meses elegidos: " + meses[0]+meses[10]+meses[6]+meses[11]+meses[2]);
		System.out.println("Dias elegidos: "+dias[0]+dias[4]+dias[1]);
	
		
		System.out.println("Ingresa un número: ");
		n=sc.nextInt();
		System.out.println("El número ingresado es: "+n);
	}

}

