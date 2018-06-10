package algoritmosdeordenacao;

import java.util.Scanner;

public class mergeSort {

	 int[] vetor = new int[3];
	 int[] temp;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		mergeSort merge = new mergeSort();
		merge.sort();

	}

	public void sort() {
		Scanner scan = new Scanner(System.in);
		
		temp = new int[vetor.length];
		
		for (int i = 0; i < temp.length; i++) {
			System.out.println("Digite um numero qualquer: ");
			vetor[i] = scan.nextInt();
		}
			scan.close();


		merge(0, vetor.length - 1);

		for (int i = 0; i < temp.length; i++) {
			System.out.println(vetor[i]);
		}

	}

	public void merge(int menor, int maior) {
		if (menor < maior) {
			int meio = menor + (maior - menor) / 2;
			merge(menor, meio);
			merge(meio + 1, maior);
			mergeSort(menor, meio, maior);
		}
	}

	public void mergeSort(int menor, int meio, int maior) {
		for (int i = menor; i <= maior; i++) {
			temp[i] = vetor[i];
		}
		int i = menor;
		int k = i;
		int j = meio + 1;

		while ((i <= meio) && (j <= maior)) {
			if (temp[i] <= temp[j]) {
				vetor[k] = temp[i];
				i++;
			} else {
				vetor[k] = temp[j];
				j++;
			}
			k++;
		}
		while (i <= meio) {
			vetor[k] = temp[i];
			i++;
			k++;
		}
	}
}
