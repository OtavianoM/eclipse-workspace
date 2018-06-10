package vetores;

import java.util.Scanner;

public class vetorIdade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		int[] vetor = new int[3];

		vetor[0] = 29;
		vetor[1] = 19;
		vetor[2] = 37;

		for (int i = 0; i < vetor.length; i++) {
			for (int j = i + 1; j < vetor.length; j++) {
				if (vetor[i] > vetor[j]) {
					int troca = vetor[i];
					vetor[i] = vetor[j];
					vetor[j] = troca;

				}

			}

		}
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}

	}

}
