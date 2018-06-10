package estruturadedados;
import java.util.Scanner;
public class fila {
		final int TAMANHO_FILA = 6;
		int indice = 0;
		String arrayFila[] = new String[TAMANHO_FILA];
		
		public void InserirNaFila(){
			if(indice == TAMANHO_FILA)
				System.out.println("fila cheia");
			else{
				System.out.print("Digite o elemento a ser inserido na Fila: ");
				arrayFila[indice] = new Scanner(System.in).next();
		}	
	}
		
		public void RemoverDaFila(){
			if(indice == 0){
				System.out.println("Fila vazia: ");
			}
			
			if(indice == 1){
				indice = 0;
			}
			
			if(indice > 1){
				for(int i = 0; i < (indice - 1); ++i ){
					arrayFila[i] = arrayFila[i + 1];
					
				}
				indice--;
			}
		}
		
		public void ExibirFila(){
			System.out.print("Fila: ");
			for(int i = 0; i < indice; ++i){
				System.out.print(arrayFila[i] + " ");
			}
			System.out.print("\n");
		}
		
		public void LimparFila(){
			System.out.print("Fila Limpa!");
			indice = 0;
		}
		
}


