package MisEjercicios;

import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
			
		Scanner in = new Scanner (System.in);
		System.out.println("Pont u numero 1: ");
			int numero1;
			numero1=in.nextInt();
			System.out.println("pon tu numero2: ");
			int numero2;
			numero2=in.nextInt();

			if (numero1%2==0) {
				
						System.out.println("El numero1 es par");
						
			}
			else {
					System.out.println("El numero1o es impar");
			}
			
			if (numero2%2==0) {
				
				System.out.println("El numero2 es par");
				
	}
	else {
			System.out.println("El numero2 es impar");
	}
			
	}

}
