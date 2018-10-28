package MisEjercicios;

import java.util.Scanner;

public class Divisibles {

	

		public static void main(String[] args) {

			int numero1;
			int numero2;
			
			Scanner in = new Scanner (System.in);
			
			System.out.println("Pon tu puto numero1: " );
			numero1=in.nextInt();
			
			System.out.println("Pon tu puto numero2: " );
			numero2=in.nextInt();
			
			if (numero1%numero2==0) {
				System.out.println(numero1 + "es divisible entre" +numero2 );
				
			}
			
			else {
				System.out.println(numero1 + "no es divisible entre" +numero2 );
			}
		}

	


	}

