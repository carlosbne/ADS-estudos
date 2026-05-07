public class ListaArray implements ILista {
    private Object[] array;
    private int tamanho;
    private static final int CAPACIDADE_INICIAL = 10;

    public ListaArray() {
        this.array = new Object[CAPACIDADE_INICIAL];
        this.tamanho = 0;
    }

    private void garantirCapacidade() {
        if (tamanho == array.length) {
            Object[] novoArray = new Object[array.length * 2];
            System.arraycopy(array, 0, novoArray, 0, array.length);
            array = novoArray;
        }
    }

    @Override
    public boolean isFirst(Object o) { return !isEmpty() && array[0].equals(o); }

    @Override
    public boolean isLast(Object o) { return !isEmpty() && array[tamanho - 1].equals(o); }

    @Override
    public Object first() { return isEmpty() ? null : array[0]; }

    @Override
    public Object last() { return isEmpty() ? null : array[tamanho - 1]; }

    @Override
    public Object before(int p) {
        if (p <= 0 || p >= tamanho) return null;
        return array[p - 1];
    }

    @Override
    public Object after(int p) {
        if (p < 0 || p >= tamanho - 1) return null;
        return array[p + 1];
    }

    @Override
    public Object replaceElement(int n, Object o) {
        Object antigo = array[n];
        array[n] = o;
        return antigo;
    }

    @Override
    public void swapElements(int n, int q) {
        Object temp = array[n];
        array[n] = array[q];
        array[q] = temp;
    }

    @Override
    public Object insertBefore(int n, Object o) {
        garantirCapacidade();
        for (int i = tamanho; i > n; i--) array[i] = array[i - 1];
        array[n] = o;
        tamanho++;
        return o;
    }

    @Override
    public Object insertAfter(int n, Object o) {
        return insertBefore(n + 1, o);
    }

    @Override
    public Object insertFirst(Object o) { return insertBefore(0, o); }

    @Override
    public Object insertLast(Object o) {
        garantirCapacidade();
        array[tamanho++] = o;
        return o;
    }

    @Override
    public Object remove(int n) {
        Object removido = array[n];
        for (int i = n; i < tamanho - 1; i++) array[i] = array[i + 1];
        array[--tamanho] = null;
        return removido;
    }

    @Override
    public int size() { return tamanho; }

    @Override
    public boolean isEmpty() { return tamanho == 0; }
}
