package devmedia;

import java.util.Scanner;

public class quickSort {
	public static void main(String[] args) {

		Scanner leitura = new Scanner(System.in);
		// int quantidade = 10000;
		int[] vetor = new int[3];

		System.out.println("Digite 3 valores: ");

		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = leitura.nextInt();
			// vetor[i] = (int) (Math.random() * quantidade);
		}

		// long tempoInicial = System.currentTimeMillis();

		quickSort(vetor, 0, vetor.length - 1);

		// long tempoFinal = System.currentTimeMillis();

		// System.out.println("Executado em = " + (tempoFinal - tempoInicial) + " ms");

		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}

	}

	private static void quickSort(int[] vetor, int inicio, int fim) {
		if (inicio < fim) {
			int posicaoPivo = separar(vetor, inicio, fim);
			quickSort(vetor, inicio, posicaoPivo - 1);
			quickSort(vetor, posicaoPivo + 1, fim);
		}
	}

	private static int separar(int[] vetor, int inicio, int fim) {
		int pivo = vetor[inicio];
		int i = inicio + 1, f = fim;
		while (i <= f) {
			if (vetor[i] <= pivo)
				i++;
			else if (pivo < vetor[f])
				f--;
			else {
				int troca = vetor[i];
				vetor[i] = vetor[f];
				vetor[f] = troca;
				i++;
				f--;
			}
		}
		vetor[inicio] = vetor[f];
		vetor[f] = pivo;
		return f;
	}

}
