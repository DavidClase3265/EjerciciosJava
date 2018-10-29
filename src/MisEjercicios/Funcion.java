package MisEjercicios;

import java.util.Scanner;

public class Funcion {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		
		double funcion;
		float numero;
		int i;
		
		System.out.println("Pon el numero negativo que quieras: ");
		 numero=in.nextFloat();
		 
		 for (i=1;i<=11;i++) {
			 
			 numero++;
			 funcion=1/numero;
			 System.out.println("El numero es:" +numero);
			 System.out.println("La funcion es:" +funcion);
		 }
		 
		
	}

}
