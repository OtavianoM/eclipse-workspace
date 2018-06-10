package algoritmosdeordenacao;

import java.util.Scanner;

public class insertionSort {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetor = new int [3];
		
		// Pega o dado e organiza, organizacao sincronizada
		
		System.out.println("Informe 3 numeros: "); 
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = scan.nextInt(); // pegar o valor digitado pelo usuario e armazena
			
			
		}
		
		for (int i = 0; i < vetor.length; i++) {
			int j = i - 1; 
			int key = vetor[i]; // Key pega o primeiro valor digitado para compara
			
			while ((j >= 0 ) && (vetor[j] >= key)) { 
				vetor[j + 1] = vetor[j]; // antes de fazer a troca, os valores ficam iguais e se tem uma subtracao 
				j--;
			
			// vai fazendo a troca
			}
			vetor[j + 1] = key;
			
			
		}
		
		for (int k = 0; k < vetor.length; k++) {
			System.out.println(vetor[k]);
		}
		
	}

}
