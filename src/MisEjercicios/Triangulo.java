package MisEjercicios;

public class Triangulo {


	public static void main(String[] args) {
		for (int i=1; i<=10; i++) {
			int n = i % 10;
			int t =  0-1;
			int espacios = 10 - i;
			int digitos = i + i - 1;
			
			for (int j = 0; j < espacios; j++)
				System.out.print(" ");
			
			for (int h=0; h<digitos; h++) {
				
				
				if (h>=digitos/2) {
					if (n<0)
						n=9;
					
				System.out.print(n--);


				
				}
				
				else if (h<=digitos/2) {
					if (n>9) 
						n=0;
						System.out.print(n++);
					
					
					
				}
				
				
			}
			
			System.out.println();
		}
	}

}
