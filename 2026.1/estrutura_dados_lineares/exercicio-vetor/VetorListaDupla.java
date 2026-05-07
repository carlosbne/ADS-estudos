public class VetorListaDupla implements IVetor {
    private No inicio;
    private No fim;
    private int tamanho;

    public VetorListaDupla() {
        this.inicio = null;
        this.fim = null;
        this.tamanho = 0;
    }

    // Método auxiliar para encontrar o Nó em um determinado rank
    private No getNo(int r) {
        No atual;
        // Otimização: se o rank estiver na metade final, começa do fim
        if (r < tamanho / 2) {
            atual = inicio;
            for (int i = 0; i < r; i++) atual = atual.getProximo();
        } else {
            atual = fim;
            for (int i = tamanho - 1; i > r; i--) atual = atual.getAnterior();
        }
        return atual;
    }

    @Override
    public Object elemAtRank(int r) {
        if (r < 0 || r >= tamanho) throw new IndexOutOfBoundsException();
        return getNo(r).getElemento();
    }

    @Override
    public Object replaceAtRank(int r, Object o) {
        if (r < 0 || r >= tamanho) throw new IndexOutOfBoundsException();
        No no = getNo(r);
        Object antigo = no.getElemento();
        no.setElemento(o);
        return antigo;
    }

    @Override
    public void insertAtRank(int r, Object o) {
        if (r < 0 || r > tamanho) throw new IndexOutOfBoundsException();

        No novo = new No(o);

        if (tamanho == 0) { // Lista vazia
            inicio = fim = novo;
        } else if (r == 0) { // Inserir no início
            novo.setProximo(inicio);
            inicio.setAnterior(novo);
            inicio = novo;
        } else if (r == tamanho) { // Inserir no fim
            novo.setAnterior(fim);
            fim.setProximo(novo);
            fim = novo;
        } else { // Inserir no meio
            No sucessor = getNo(r);
            No antecessor = sucessor.getAnterior();
            
            novo.setAnterior(antecessor);
            novo.setProximo(sucessor);
            antecessor.setProximo(novo);
            sucessor.setAnterior(novo);
        }
        tamanho++;
    }

    @Override
    public Object removeAtRank(int r) {
        if (r < 0 || r >= tamanho) throw new IndexOutOfBoundsException();

        No removido = getNo(r);

        if (tamanho == 1) {
            inicio = fim = null;
        } else if (removido == inicio) {
            inicio = inicio.getProximo();
            inicio.setAnterior(null);
        } else if (removido == fim) {
            fim = fim.getAnterior();
            fim.setProximo(null);
        } else {
            removido.getAnterior().setProximo(removido.getProximo());
            removido.getProximo().setAnterior(removido.getAnterior());
        }

        tamanho--;
        return removido.getElemento();
    }

    @Override
    public int size() { return tamanho; }

    @Override
    public boolean isEmpty() { return tamanho == 0; }

    // Classe interna nóduplamente encadeada
    private static class No {
        private Object elemento;
        private No anterior;
        private No proximo;

        public No(Object elemento) {
            this.elemento = elemento;
            this.anterior = null;
            this.proximo = null;
        }

        public Object getElemento() { return elemento; }
        public void setElemento(Object elemento) { this.elemento = elemento; }

        public No getAnterior() { return anterior; }
        public void setAnterior(No anterior) { this.anterior = anterior; }

        public No getProximo() { return proximo; }
        public void setProximo(No proximo) { this.proximo = proximo; }
    }
}