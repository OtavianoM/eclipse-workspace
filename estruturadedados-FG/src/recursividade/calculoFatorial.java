package recursividade;

import java.util.Scanner;

public class calculoFatorial {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		calculoFatorial fatorial = new calculoFatorial();
		
		
		System.out.println("Digite o valor a ser fatorado: ");
		int numero = scan.nextInt();
		
		int fatorado = fatorial.mutiplicFatorial(numero);
		
		System.out.println("A fatoracao de " + numero + " eh " + fatorado);

		
		
	}
	public int mutiplicFatorial(int num) {
		if (num == 1) {
			return 1;
		}
		return num * mutiplicFatorial(num - 1);
	}

}

//public class recusivo {
//	/**
//		 * @param args
//		 */
//		public static void main(String[] args) {
//			// TODO Auto-generated method stub
//			System.out.println(fatorial(5));
//		}
//		private static int fatorial(int n){
//			if(n==1)
//				return n;
//			return fatorial(n-1)*n;
//		}
//	}
