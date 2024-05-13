package lacosrepeticao;

import java.util.Scanner;

public class ExercicioFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner (System.in);
		
		int numero, contador, resultado = 0, impar = 0;
		
		 for (contador = 1; contador < 11; contador++) {
	            System.out.println("\nDigite o " + contador + "º número: ");
	            numero = leia.nextInt();
	            
	       if( numero % 2 == 0) {
	    	    for (resultado = 0; resultado <4;resultado++) {
	    	    }
	    	    }
	    	if( numero % 2 ==1) {
	    		for(impar =1; impar <6; impar++) {
	    			
	    		}
	    			
	    		
	    	}
	    	   
	    	   
	       
		 }
		 System.out.println(" Total de números pares: " + resultado);
		 
		 System.out.println(" Total de números ímpares: " + impar);
	}

}
