public class ListaDuplamenteEncadeada implements ILista {
    private No inicio;
    private No fim;
    private int tamanho;

    private No getNo(int p) {
        if (p < 0 || p >= tamanho) throw new IndexOutOfBoundsException();
        No atual = inicio;
        for (int i = 0; i < p; i++) atual = atual.getProximo();
        return atual;
    }

    @Override
    public boolean isFirst(Object o) { return inicio != null && inicio.getElemento().equals(o); }

    @Override
    public boolean isLast(Object o) { return fim != null && fim.getElemento().equals(o); }

    @Override
    public Object first() { return inicio != null ? inicio.getElemento() : null; }

    @Override
    public Object last() { return fim != null ? fim.getElemento() : null; }

    @Override
    public Object before(int p) {
        No n = getNo(p);
        return (n.getAnterior() != null) ? n.getAnterior().getElemento() : null;
    }

    @Override
    public Object after(int p) {
        No n = getNo(p);
        return (n.getProximo() != null) ? n.getProximo().getElemento() : null;
    }

    @Override
    public Object replaceElement(int n, Object o) {
        No no = getNo(n);
        Object antigo = no.getElemento();
        no.setElemento(o);
        return antigo;
    }

    @Override
    public void swapElements(int n, int q) {
        No noN = getNo(n);
        No noQ = getNo(q);
        Object temp = noN.getElemento();
        noN.setElemento(noQ.getElemento());
        noQ.setElemento(temp);
    }

    @Override
    public Object insertFirst(Object o) {
        No novo = new No(o);
        if (isEmpty()) inicio = fim = novo;
        else {
            novo.setProximo(inicio);
            inicio.setAnterior(novo);
            inicio = novo;
        }
        tamanho++;
        return novo;
    }

    @Override
    public Object insertLast(Object o) {
        if (isEmpty()) return insertFirst(o);
        No novo = new No(o);
        fim.setProximo(novo);
        novo.setAnterior(fim);
        fim = novo;
        tamanho++;
        return novo;
    }

    @Override
    public Object insertBefore(int n, Object o) {
        if (n == 0) return insertFirst(o);
        No sucessor = getNo(n);
        No antecessor = sucessor.getAnterior();
        No novo = new No(o);
        novo.setProximo(sucessor);
        novo.setAnterior(antecessor);
        antecessor.setProximo(novo);
        sucessor.setAnterior(novo);
        tamanho++;
        return novo;
    }

    @Override
    public Object insertAfter(int n, Object o) {
        if (n == tamanho - 1) return insertLast(o);
        No antecessor = getNo(n);
        No sucessor = antecessor.getProximo();
        No novo = new No(o);
        novo.setAnterior(antecessor);
        novo.setProximo(sucessor);
        antecessor.setProximo(novo);
        sucessor.setAnterior(novo);
        tamanho++;
        return novo;
    }

    @Override
    public Object remove(int n) {
        No alvo = getNo(n);
        if (alvo == inicio) {
            inicio = inicio.getProximo();
            if (inicio != null) inicio.setAnterior(null);
            else fim = null;
        } else if (alvo == fim) {
            fim = fim.getAnterior();
            if (fim != null) fim.setProximo(null);
            else inicio = null;
        } else {
            alvo.getAnterior().setProximo(alvo.getProximo());
            alvo.getProximo().setAnterior(alvo.getAnterior());
        }
        tamanho--;
        return alvo.getElemento();
    }

    @Override
    public int size() { return tamanho; }

    @Override
    public boolean isEmpty() { return tamanho == 0; }

    private static class No {
        private Object elemento;
        private No anterior;
        private No proximo;

        No(Object elemento) {
            this.elemento = elemento;
            this.anterior = null;
            this.proximo = null;
        }

        Object getElemento() { return elemento; }
        void setElemento(Object elemento) { this.elemento = elemento; }

        No getAnterior() { return anterior; }
        void setAnterior(No anterior) { this.anterior = anterior; }

        No getProximo() { return proximo; }
        void setProximo(No proximo) { this.proximo = proximo; }
    }
}