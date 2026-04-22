public class FilaProjeto {

    private Object[] array;
    private int capacidade;
    private int capacidadeMinima;

    private int inicio; // aponta para o início da fila
    private int tamanho; // quantidade de elementos

    private boolean invertida; // controle de reversão

    public FilaProjeto(int capacidadeInicial) {
        this.capacidade = capacidadeInicial;
        this.capacidadeMinima = capacidadeInicial;
        this.array = new Object[capacidadeInicial];
        this.inicio = 0;
        this.tamanho = 0;
        this.invertida = false;
    }

    // ENQUEUE
    public void enqueue(Object o) {
        if (tamanho == capacidade) {
            redimensionar(capacidade * 2);
        }

        int pos;

        if (!invertida) {
            pos = (inicio + tamanho) % capacidade;
        } else {
            pos = (inicio - 1 + capacidade) % capacidade;
            inicio = pos;
        }

        array[pos] = o;
        tamanho++;
    }


    // DEQUEUE

    public Object dequeue() {
        if (estaVazia()) {
            throw new RuntimeException("Fila vazia");
        }

        Object elemento;

        if (!invertida) {
            elemento = array[inicio];
            array[inicio] = null;
            inicio = (inicio + 1) % capacidade;
        } else {
            int fim = (inicio + tamanho - 1 + capacidade) % capacidade;
            elemento = array[fim];
            array[fim] = null;
        }

        tamanho--;

        verificarReducao();

        return elemento;
    }


    // REVERSE (O(1))

    public void reverse() {
        invertida = !invertida;
    }


    // AUXILIARES

    public boolean estaVazia() {
        return tamanho == 0;
    }

    private void redimensionar(int novaCapacidade) {
        Object[] novo = new Object[novaCapacidade];

        for (int i = 0; i < tamanho; i++) {
            novo[i] = array[(inicio + i) % capacidade];
        }

        array = novo;
        capacidade = novaCapacidade;
        inicio = 0;
    }

    private void verificarReducao() {
        if (capacidade > capacidadeMinima && tamanho <= capacidade / 3) {
            redimensionar(Math.max(capacidadeMinima, capacidade / 2));
        }
    }


    // DEBUG

    public void mostrar() {
        System.out.println("Capacidade: " + capacidade);
        System.out.println("Tamanho: " + tamanho);
        System.out.println("Invertida: " + invertida);

        System.out.print("Fila: [");

        for (int i = 0; i < tamanho; i++) {
            int idx;

            if (!invertida) {
                idx = (inicio + i) % capacidade;
            } else {
                idx = (inicio + tamanho - 1 - i + capacidade) % capacidade;
            }

            System.out.print(array[idx]);
            if (i < tamanho - 1) System.out.print(", ");
        }

        System.out.println("]");
        System.out.println("---");
    }
}