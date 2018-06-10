package nivelbasico;

import java.util.Scanner;

public class somaBasica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leitura = new Scanner(System.in);

		int A, B, SOMA;

		A = leitura.nextInt();
		B = leitura.nextInt();

		SOMA = A + B;

		System.out.println("SOMA = " + SOMA);

	}

}
