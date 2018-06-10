package devmedia;

import java.util.Scanner;

public class bubleSort {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		//int quantidade = 10000;
		int[] vetor = new int[3];

		System.out.println("Digite 3 valores");
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = scan.nextInt();
			//vetor[i] = (int) (Math.random() * quantidade);
		}

		//long tempoInicial = System.currentTimeMillis();

		bubbleSort(vetor);

		//long tempoFinal = System.currentTimeMillis();

		//System.out.println("Executado em = " + (tempoFinal - tempoInicial) + " ms");

		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}
		
		
	}

	private static void bubbleSort(int vetor[]) {
		boolean troca = true;
		int aux;
		while (troca) {
			troca = false;
			for (int i = 0; i < vetor.length - 1; i++) {
				if (vetor[i] > vetor[i + 1]) {
					aux = vetor[i];
					vetor[i] = vetor[i + 1];
					vetor[i + 1] = aux;
					troca = true;
				}
			}

		}

	}
}
