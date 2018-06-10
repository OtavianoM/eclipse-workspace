package devmedia;

import java.util.Scanner;

public class selectionSort {

	public static void main(String[] args) {

		Scanner leitura = new Scanner(System.in);

		//int quantidade = 10000;
		int[] vetor = new int[3];
		
		
		System.out.println("Digite 3 valores");
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = leitura.nextInt();
			//vetor[i] = (int) (Math.random() * quantidade);
		}

		//long tempoInicial = System.currentTimeMillis();

		selectionSort(vetor);

		//long tempoFinal = System.currentTimeMillis();

		//System.out.println("Executado em = " + (tempoFinal - tempoInicial) + " ms");
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}

	}

	public static void selectionSort(int[] array) {
		for (int fixo = 0; fixo < array.length - 1; fixo++) {
			int menor = fixo;

			for (int i = menor + 1; i < array.length; i++) {
				if (array[i] < array[menor]) {
					menor = i;
				}
			}
			if (menor != fixo) {
				int t = array[fixo];
				array[fixo] = array[menor];
				array[menor] = t;
			}
		}
	}

}