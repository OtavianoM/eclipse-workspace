package estruturadedados;
public class lista{
public static void main(String[] args) {

}
public class Nodo{
	private int info;
	private Nodo prox;
	
	public int getInfo(){
		return info;
	}
	
	public void setInfo(int info){
		this.info = info;
		
	}
	public Nodo getProx(){
		return prox;
	}
	public void setProx(Nodo prox){
		this.prox = prox;
	}
	
}

public class Lista{

		private Nodo prim;
		
		public void criaLista(){
			prim = null;
		}
		
		/*
			insercao inicio
		*/
		
		public void add(int i){
			Nodo novo = new Nodo();
			novo.setInfo(i);
			novo.setProx(prim);
			prim = novo;
			
		}
	}
}
