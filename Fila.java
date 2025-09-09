public class Fila {
    private No inicio, fim;

    Fila() {
        inicio = null;
        fim = null;
    }

    void insere(int v) {
        No novo = new No(v);
        if (fim != null) {
            fim.prox = novo;
        }
        fim = novo;
        if (inicio == null) {
            inicio = novo;
        }
    }

    int remove() {
        if (inicio == null) {
            System.out.println("Fila vazia!");
            return -1;
        }
        int valor = inicio.valor;
        inicio = inicio.prox;
        if (inicio == null) {
            fim = null;
        }
        System.out.println("Removido da fila: " + valor);
        return valor;
    }

    void imprime() {
        if (inicio == null) {
            System.out.println("Fila vazia!");
            return;
        }
        No atual = inicio;
        System.out.print("Fila: ");
        while (atual != null) {
            System.out.print(atual.valor + " ");
            atual = atual.prox;
        }
        System.out.println();
    }
}
