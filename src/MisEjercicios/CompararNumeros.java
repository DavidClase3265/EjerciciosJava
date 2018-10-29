package MisEjercicios;

import java.util.Scanner;

public class CompararNumeros {

	public static void main(String[] args) {

		int numero1;
		int numero2;
		
		Scanner in = new Scanner (System.in);
		
		System.out.println("Pon tu  numero 1: " );
		numero1=in.nextInt();
		
		System.out.println("Pon tu  numero 2: " );
		numero2=in.nextInt();
		
		if (numero1>numero2) {
			System.out.println(numero1 + " es mayor que " +numero2 );
			
		}
		
		else {
			System.out.println(numero1 + " es menor que " +numero2 );
		}
	}

}