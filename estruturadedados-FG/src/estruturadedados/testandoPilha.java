package estruturadedados;

import java.util.Scanner;

public class testaPilha {

public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int tamanho = 0;
        FG stack = new FG();

        for (int j = 0; j < stack.vetor.length; j++) {

            System.out.println("Digite o valor a ser inserido na pilha: ");
            stack.vetor[j] = scan.nextInt();
            stack.push(stack.vetor[j]);
            System.out.println("\n");

        }

        System.out.println("Ultimo elemento inserido: " + stack.top());
        System.out.println("\n");

        System.out.println("Pilha vazia: " + stack.isEmpty());

        for (int j = 0; j < stack.vetor.length; j++) {
            System.out.println("Valores da pilha: " + stack.vetor[j]);
            System.out.println("\n");
		}
	}
}
