package lacosrepeticao;

import java.util.Scanner;

public class ExercicioWhile {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

        int idade, totalMenoresDe21 = 0, totalMaioresDe50 = 0;

        System.out.println("Digite uma idade (digite uma idade negativa para sair): ");
        idade = leia.nextInt();

        while (idade >= 0) {
            if (idade < 21) {
            	//Contador do laço FOR
                totalMenoresDe21++;
            } else if (idade > 50) {
                totalMaioresDe50++;
            }

            System.out.println("Digite uma idade (digite uma idade negativa para sair): ");
            idade = leia.nextInt();
        }

        System.out.println("Total de pessoas menores de 21 anos: " + totalMenoresDe21);
        System.out.println("Total de pessoas maiores de 50 anos: " + totalMaioresDe50);

	}

}
