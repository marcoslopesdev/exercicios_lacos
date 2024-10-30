package atividades_lacos;

import java.util.Scanner;

public class For_conta_par_impar {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numero, i, contaPar = 0, contaImpar = 0;
		
		System.out.println("--- CONTA A QUANTIDADE DE NÚMEROS PARES E ÍMPARES ---\n");
		
		for(i = 1; i <= 10; i++) {
			System.out.printf("Digite o %dº número: ", i);
			numero = leia.nextInt();
			
			if(numero % 2 == 0) {
				contaPar++;
			}
			else {
				contaImpar++;
			}
		}
		
		System.out.println("\nTotal de números pares: "+ contaPar);
		System.out.println("Total de números ímpares: "+ contaImpar);
		
		leia.close();


	}

}
