package vetores;

import java.util.Iterator;
import java.util.Scanner;
import java.util.concurrent.CopyOnWriteArrayList;

public class contaSalario {

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);

		

		int[] idade = new int[2];
		String[] nomes = new String[2];
		int maiorIdade = 0;

		for (int i = 0; i < nomes.length; i++) {

			System.out.println("Informe um nome: ");
			nomes[i] = leitura.nextLine();

			System.out.print("Informe uma idade: ");
			idade[i] = leitura.nextInt();

		}
		
		int menorIdade = idade[0];
		
		for (int i = 0; i < nomes.length; i++) {

			if (idade[i] > idade[i]) {
				System.out.println(idade[i]);

			} else {

				System.out.println(idade[i]);

			}

		}
	}
}