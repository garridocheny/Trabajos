package operacionessucesivas;

import java.util.Scanner;

public class restas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	    int iresta=0;
        
	    System.out.println("Ingresa un número y te diré la resta de sus consecutivos: ");
        int iusuario=sc.nextInt(); 
        for(int i=iusuario;i>0;i--)
        {
            iresta=iresta-(i);
            if(i<iusuario);
            System.out.print((i)+"-");
        }         
        System.out.print("="+iresta);     
}
}

