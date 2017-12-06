package practica.testcollection;

public class LambdaInterfaz {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
			int width=10;
			
			//Lambda
			Drawable d2=()->
			{
				System.out.println("Drawing"+width);
			}; d2.draw();
	}

	}
