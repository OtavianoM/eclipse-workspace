package recursividade;

import java.util.Scanner;

public class calculoExponencial {

	
		public static void main(String[] args) {
			int numero = 2;
			int expoente = 3;
			int resultado = calcula(numero, expoente);
			System.out.println(resultado);
		}
		public static int calcula(int num, int exp) {
			if (exp != 0) {
				return num * calcula(num, exp - 1);
			} else {
				return 1;
			}
		}
	}
