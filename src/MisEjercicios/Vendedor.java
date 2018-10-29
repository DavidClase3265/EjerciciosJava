package MisEjercicios;

import java.util.Scanner;

public class Vendedor {

	public static void main(String[] args) {
		//variables
		int sueldo;
		//sueldo base
		System.out.println("El sueldo base es de: ");
		Scanner in = new Scanner (System.in);
		sueldo=in.nextInt();

		//comision de las tres ventas
		int venta;
		int comision;
			//primera venta
			System.out.println("¿Por cuanto vendiste por la primera venta?: ");
			 venta=in.nextInt();
			
					//comision primera venta
						 comision=venta*10/100;
						
			//segunda venta
			System.out.println("¿Por cuanto vendiste por la segunda venta?: ");
			venta=in.nextInt();
			
					//comision primera venta
					 comision=venta*10/100;
					
			//tercera venta
			
			System.out.println("¿Por cuanto vendiste por la tercera venta?: ");
			venta=in.nextInt();
					//comision primera venta
					comision=venta*10/100;
		//total
		
		int total= sueldo + (comision);
		System.out.println("El total es de:  " +total);
		
	}

}