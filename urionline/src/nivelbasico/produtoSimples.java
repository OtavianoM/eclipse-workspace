package nivelbasico;

import java.util.Scanner;

public class produtoSimples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		int a, b, prod;

		a = scan.nextInt();
		b = scan.nextInt();

		prod = a * b;

		System.out.println("PROD = " + prod);

	}

}
