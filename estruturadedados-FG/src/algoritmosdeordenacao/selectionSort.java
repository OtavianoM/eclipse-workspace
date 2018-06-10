package algoritmosdeordenacao;

import java.util.Scanner;

public class selectionSort {

	public static void main(String[] args) {
		int[] vetor = new int[3];
		int indice = 0;
		int menorNumero = 0;
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite 3 valores qualquer: ");
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = scan.nextInt();
		}
		for (int i = 0; i < vetor.length; i++) {
			indice = i;

			for (int j = i + 1; j < vetor.length; j++) {
				if (vetor[j] < vetor[indice]) {
					indice = j;
				}
			}
			menorNumero = vetor[indice];
			vetor[indice] = vetor[i];
			vetor[i] = menorNumero;
		}
		
		
		System.out.println("Lista Ordenada");
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}
		scan.close(); //bloqueia o scanner
	}

}
