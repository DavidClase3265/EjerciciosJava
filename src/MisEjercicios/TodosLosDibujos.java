package MisEjercicios;

public class DibujosConAsteriscos {

    
    static void volcan (int h) {    

        int asteriscos=2;
        int espacios;
        int total = (int)Math.pow(2,h)/2; 
            for (int i=0; i<h; i++){
                espacios = total - asteriscos/2;
                for (int j=0; j<espacios; j++)        
                    System.out.print(" ");
                for (int j=0; j<asteriscos; j++)     
                	System.out.print("*");
            asteriscos += asteriscos;    
            System.out.println();
        }
    }


    static void mosaico (int f, int c) {

        for (int i=0; i<f; i++){
            for (int j=0; j<c; j++) {

             
            	System.out.print((i % 2 == 0 && j % 2 != 0) || (i % 2 != 0 && j % 2 == 0)?'*':' ');
            }
            System.out.println();
        }
    }

   
            	
static void tableros (int f, int c) { 
		
		for (int i=0; i<f; i++) {
			for (int v=0; v<3; v++) {
			
				for(int j=0; j<c; j++) {
				
					for (int d=0; d<3; d++) {



						if ((i % 2 == 0 && j % 2 != 0) || (i % 2 != 0 && j % 2 == 0))
				
							System.out.print("*");
								else
										System.out.print(" ");
				
							}
				
				}
				System.out.println();
				
				}
				
				}
				
				
				
				}


            	
    public static void main(String[] args) {

        volcan (6);
        System.out.println();
        mosaico (8,8);
        System.out.println();
        tableros (8,8);
    }

}

