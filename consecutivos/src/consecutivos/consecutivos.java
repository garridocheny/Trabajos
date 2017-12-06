package consecutivos;
import java.util.Scanner;

public class consecutivos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		    int isuma=0;
	        
		    System.out.println("Ingresa un número y te diré la sumatoria de sus consecutivos: ");
	        int iusuario=sc.nextInt(); 
	        for(int i=0;i<=iusuario;i++)
	        {
	            isuma=isuma+i;
	            if(i<iusuario);
	            System.out.print((i+1)+"+");
	        }         
	        System.out.print("="+isuma);     
	}
	}

