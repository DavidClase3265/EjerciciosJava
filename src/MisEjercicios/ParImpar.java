package MisEjercicios;

import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
			
		Scanner in = new Scanner (System.in);
		System.out.println("Pon tu numero : ");
			int numero1;
			numero1=in.nextInt();


			if (numero1%2==0) {
				
						System.out.println("El numero es par");
						
			}
			else {
					System.out.println("El numero es impar");
			}
			
			
			
	}

}
