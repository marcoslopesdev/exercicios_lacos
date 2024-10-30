package atividades_lacos;

import java.util.Scanner;

public class Idades {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int idade = 0, menorQue21 = 0, maiorQue50 = 0;
		
		System.out.println("--- VERIFICA A QUANTIDADE DE PESSOAS COM MENOS DE 21 ANOS E MAIS DE 50 ANOS ---\n");
		
		while(idade >= 0) {
			System.out.printf("Digite a idade: ");
			idade = leia.nextInt();
			
			if(idade <= 21) {
				menorQue21++;
			}
			else if(idade > 50){
				maiorQue50++;
			}
			else {
				
			}
			
		}
		
		menorQue21--;
		
		System.out.println("\nTotal de pessoas com menos de 21 anos: "+ menorQue21);
		System.out.println("Total de pessoas com mais de 50 anos: "+ maiorQue50);
		
		leia.close();


	}

}
