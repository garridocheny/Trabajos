package progeneration2.semana2.ejercicio4;

public class CarAPP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car rayoMac= new Car("Mustang","Estándar",200);
		SportsCar carritu = new SportsCar("BMW","Automatico",400);
		System.out.println(rayoMac.getBrand());
		rayoMac.setBrand("BMW");
		System.out.println(rayoMac.getBrand());
		rayoMac.ibirthyear=10;
		System.out.println(rayoMac.iBirthYear);
		/*
		SportsCar carritu = new SportsCar();
		
		
		System.out.println(rayoMac.sBrand);
		System.out.println(rayoMac.sType);
		System.out.println(rayoMac.iVelocity);
		
		rayoMac.sBrand = "Mustang";
		rayoMac.sType = "Estandar";
		rayoMac.iVelocity = 200;
	
		
		
		
		System.out.println(rayoMac.sBrand);
		System.out.println(rayoMac.sType);
		System.out.println(rayoMac.iVelocity);
		
		System.out.println(carritu.sBrand);
		System.out.println(carritu.sType);
		System.out.println(carritu.iVelocity);
	
		carritu.sBrand="Masseratti";
		carritu.sType="Automatico";
		carritu.iVelocity=400;
		
		System.out.println(carritu.sBrand);
		System.out.println(carritu.sType);
		System.out.println(carritu.iVelocity);
		*/
	}

}
