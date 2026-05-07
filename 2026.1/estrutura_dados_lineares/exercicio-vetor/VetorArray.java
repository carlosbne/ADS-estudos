
public class VetorArray implements IVetor {
    private Object[] dados;
    private int tamanho;
    private static final int CAPACIDADE_INICIAL = 10;

    public VetorArray() {
        this.dados = new Object[CAPACIDADE_INICIAL];
        this.tamanho = 0;
    }

    private void verificarIndice(int r, int limite) {
        if (r < 0 || r >= limite) {
            throw new IndexOutOfBoundsException("Rank inválido: " + r);
        }
    }

    private void garantirCapacidade() {
        if (tamanho == dados.length) {
            Object[] novoVetor = new Object[dados.length * 2];
            System.arraycopy(dados, 0, novoVetor, 0, dados.length);
            dados = novoVetor;
        }
    }

    @Override
    public Object elemAtRank(int r) {
        verificarIndice(r, tamanho);
        return dados[r];
    }

    @Override
    public Object replaceAtRank(int r, Object o) {
        verificarIndice(r, tamanho);
        Object antigo = dados[r];
        dados[r] = o;
        return antigo;
    }

    @Override
    public void insertAtRank(int r, Object o) {
        // No insert, o rank pode ser igual ao tamanho (inserir no fim)
        if (r < 0 || r > tamanho) throw new IndexOutOfBoundsException("Rank inválido");
        
        garantirCapacidade();
        
        // Desloca elementos para a direita
        for (int i = tamanho; i > r; i--) {
            dados[i] = dados[i - 1];
        }
        dados[r] = o;
        tamanho++;
    }

    @Override
    public Object removeAtRank(int r) {
        verificarIndice(r, tamanho);
        Object removido = dados[r];
        
        // Desloca elementos para a esquerda
        for (int i = r; i < tamanho - 1; i++) {
            dados[i] = dados[i + 1];
        }
        dados[tamanho - 1] = null; // Help GC
        tamanho--;
        return removido;
    }

    @Override
    public int size() { return tamanho; }

    @Override
    public boolean isEmpty() { return tamanho == 0; }
}