package MisEjercicios;

import java.util.Scanner;

public class EjercicioIVA {

	public static void main(String[] args) {

			int precio;
			int iva;
			float factor=0;
			double pvp;
		
		System.out.println("Pon el precio:   ");
		Scanner in = new Scanner (System.in);
		precio = in.nextInt();
		
		System.out.println("Pon el iva: 4% 7%  16%   ");
		
		iva = in.nextInt();
		
		if (iva==4) {
			factor = 0.4f;
		}
		
		else 
		
		
		if (iva==7) {
			factor = 0.7f;
		}
		else
		
		if (iva==16) {
			factor = 0.16f;
		}
		
		pvp=precio + precio * factor;
				System.out.println("El pvp es  " +pvp);
	}

}
