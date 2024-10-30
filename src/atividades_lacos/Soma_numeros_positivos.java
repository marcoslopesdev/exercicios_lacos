package atividades_lacos;

import java.util.Scanner;

public class Soma_numeros_positivos {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numero = 0, somaPositivos = 0;
		
		System.out.println("--- SOMA APENAS NÚMEROS POSITIVOS ---\n");
		
		do{
			System.out.printf("Digite um número: ");
			numero = leia.nextInt();
			
			if(numero > 0) {
				somaPositivos = somaPositivos + numero;
			}
			
		} while (numero != 0);
		
		
		System.out.println("\nSomas dos números positivos: "+ somaPositivos);
		
		leia.close();


	}

}
