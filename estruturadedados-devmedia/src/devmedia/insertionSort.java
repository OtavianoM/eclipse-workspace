package devmedia;

import java.util.Scanner;

public class insertionSort {
	public static void main(String[] args) {
		
		//INSERTION SORT COM METODO
		
		Scanner scan = new Scanner(System.in);
		// int quantidade = 10000;
		int[] vetor = new int[3];

		System.out.println("Digite 3 valores: ");
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = scan.nextInt();
			// vetor[i] = (int) (Math.random() * quantidade);
		}

		// long tempoInicial = System.currentTimeMillis();

		insertionSort(vetor);

		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}

		// long tempoFinal = System.currentTimeMillis();

		// System.out.println("Executado em = " + (tempoFinal - tempoInicial) + " ms");

	}

	public static void insertionSort(int[] vetor) {
		int j;
		int key;
		int i;

		for (j = 1; j < vetor.length; j++) {
			key = vetor[j];
			for (i = j - 1; (i >= 0) && (vetor[i] > key); i--) {
				vetor[i + 1] = vetor[i];
			}
			vetor[i + 1] = key;
		}
	}

}
