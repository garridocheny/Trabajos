package operacionessucesivas;
import java.util.*;

public class sumas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			
			int iusuario=0;
			
			System.out.println("Juguemos un juego macabro");
			iusuario=sc.nextInt();
			
			for (int i = 0; i <iusuario; i++)
			{
				System.out.print((i+1)+" + "+iusuario);
				
				if(i==(iusuario-1));
				{
					System.out.println("="+(iusuario+(i+1)));
				}
			}
			}
		}
