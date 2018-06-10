package vetores;

import java.util.Scanner;

public class mediaAritmetica {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite quantos numeros deseja inserir: ");
		int tamanho = scan.nextInt();

		int[] vetor = new int[tamanho];

		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Informe o " + (i + 1) + "º numero: ");
			vetor[i] = scan.nextInt();
		}

		double soma = 0;

		int cont = 0;

		for (int i = 0; i < vetor.length; i++) {
			soma += vetor[i];
			cont++;

		}
		System.out.println(soma / cont);

	}

}
