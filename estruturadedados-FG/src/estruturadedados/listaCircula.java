package estruturadedados;

public class listaCircula {

	public static void main(String[] args) {
		ListaCircular circular = new ListaCircular();

		for (int i = 0; i < 15; i++) {
			No node = new No();
			node.setId(i);
			circular.add(node);
		}

		while (true) {
			System.out.println(circular.getNo().getId());
			circular.proximoNo();
		}

	}

	public class No {
		private No proximo;
		private Integer id;

		public void setId(Integer id) {
			this.id = id;
		}

		public Integer getId() {
			return id;
		}

		public No getProximo() {
			return proximo;
		}

		public void setProximo(No node) {
			proximo = node;
		}

	}

	public class ListaCircular {

		private No no;
		private int contador;

		/** Creates a new instance of CircleList */
		public ListaCircular() {
			this.no = null;
			contador = 0;
		}

		public int quantDeNo() {
			return contador;
		}

		public No getNo() {
			return no;
		}

		public void proximoNo() {
			no = no.getProximo();
		}

		public void add(No node) {
			if (this.no == null) {
				node.setProximo(node);
				this.no = node;
			} else {
				node.setProximo(this.no.getProximo());
				this.no.setProximo(node);
			}
			contador++;
		}

	}

}