package nivelbasico;

import java.util.Scanner;

public class areaCirculo {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		double Raio = in.nextDouble();
		double Area = 3.14159 * Math.pow(Raio, 2);
		System.out.println(String.format("A=%.4f", Area));

		// Scanner scan = new Scanner(System.in);
		//
		// double raio, area;
		// double r = 3.14159;
		//
		// raio = scan.nextDouble();
		//
		// area = r * (raio * raio);
		//
		// System.out.println("A = " + area);
	}

}
