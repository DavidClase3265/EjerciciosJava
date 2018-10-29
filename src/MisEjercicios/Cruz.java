package MisEjercicios;

import java.util.Scanner;

public class Cruz {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		int fila;
		int columna;
		
		System.out.println("Pon el numero de filas");
		fila = in.nextInt();
		
		System.out.println("Pon el numero de columnas");
		columna = in.nextInt();
		
		
		for (int i=0; i<columna; i++) {
			for (int j=0; j<fila; j++) {
				if (i == columna/2 || j==fila/2) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	

	}

}