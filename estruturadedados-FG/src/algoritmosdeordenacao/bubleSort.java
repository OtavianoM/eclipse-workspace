package algoritmosdeordenacao;

import java.util.Scanner;

public class bubleSort {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in); // para receber
		int[] vetor = new int[3]; // tamanho do vetor
		
		

		System.out.println("Digite 3 numeros: ");
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = scan.nextInt();     // valores nas posições de 0 a 2
			
		}
		for (int i = 0; i < vetor.length; i++) { 
			for (int j = i + 1; j < vetor.length; j++) {
				if (vetor[i] > vetor[j]) {
					int aux = vetor[i];
					vetor[i] = vetor[j];
					vetor[j] = aux;
					
					
				}
			}
		}
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}
	}

}
