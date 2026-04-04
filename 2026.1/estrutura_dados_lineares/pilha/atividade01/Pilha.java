public interface Pilha{
    public void pushPilhaVermelha(Object o);
    public void pushPilhaPreta(Object o);
    public void atualizarTamanhoArray();
    public Object popPilhaPreta() throws PilhaVaziaExcecao;
    public Object popPilhaVermelha() throws PilhaVaziaExcecao;
}