public class Pilha {
    private No topo;

    Pilha() {
        topo = null;
    }

    void insere(int v) {
        No novo = new No(v);
        novo.prox = topo;
        topo = novo;
    }

    int remove() {
        if (topo == null) {
            System.out.println("Pilha vazia!");
            return -1;
        }
        int valor = topo.valor;
        topo = topo.prox;
        System.out.println("Removido da pilha: " + valor);
        return valor;
    }

    void imprime() {
        if (topo == null) {
            System.out.println("Pilha vazia!");
            return;
        }
        No atual = topo;
        System.out.print("Pilha: ");
        while (atual != null) {
            System.out.print(atual.valor + " ");
            atual = atual.prox;
        }
        System.out.println();
    }
}
