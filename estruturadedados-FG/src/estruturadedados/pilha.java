package estruturadedados;

public class pilha {
		int[] vetor = new int[15];
    int topo = -1;

    public boolean isEmpty() {
        // mostra se a pilha ta vazia
        if (topo == -1) {
            return true;
        }
        return false;
    }

    public boolean isFull() {
        //mostra se a pilha ta cheia
        if (topo == vetor.length - 1) {
            return true;

        }

        return false;
    }

    public int top() {
        //mostra o ultimo valor inserido
        if (isEmpty() == true) {
            return - 1;
        }
        return vetor[topo];
    }

    public int pop() {
        //para retirar valores da pilha
        int valor;

        if (isEmpty()) {
            return -1;

        }
        valor = vetor[topo];
        topo = topo - 1;
        return valor;
    }

    public void push(int valor) {
        //para adicionar valores a pilha
        if (topo < vetor.length) {
            topo = topo + 1;
            vetor[topo] = valor;
        }

    }

		
	}


