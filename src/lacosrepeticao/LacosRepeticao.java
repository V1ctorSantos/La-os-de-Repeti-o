package lacosrepeticao;

import java.util.Scanner;

public class LacosRepeticao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for( int num = 1; num < 5;num++) {
			System.out.println("agora o num vale: ");
		}
		System.out.println("bom dia!");
		
		System.out.println("*****************************");
		
		
		int numero;
		System.out.println("Digite um numero:");
		
		Scanner leia = new Scanner (System.in);
		numero = leia.nextInt();
		
		for(int contador=1; contador <=10;contador++ ) {
			System.out.println(numero + " x " + contador + " = " + numero * contador);
			
		}
	}

}
