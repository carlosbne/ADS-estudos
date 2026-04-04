public class PilhasDuplas implements Pilha{
    private int capacidade;
    private int capacidadeMinima;
    private Object[] array;
    private int temporariaVermelho; //temporaria topo da pilha vermelha
    private int temporariaPreto; //temporaria topo pilha preta

    //construtor
    public PilhasDuplas(int capacidade){
        this.capacidade = capacidade;
        array = new Object[capacidade];
        temporariaVermelho = -1; //pilha vermelha começa no inicio
        temporariaPreto = capacidade; //pilha preta começa no final
    }

    //metodos para verificar se as pilhas estão vazias
    public boolean vermelhaVazia(){
        return temporariaVermelho == -1;
    }
    public boolean pretaVazia(){
        return temporariaPreto == capacidade;
    }

    //metodos pra verificar se estão cheias
    private boolean estaCheio(){
        return temporariaVermelho +1 == temporariaPreto;
    }

    //metodo pra atualizar o tamanho do array 
    public void atualizarTamanhoArray(){
        int novaCapacidade = capacidade * 2;
        Object b[] = new Object[novaCapacidade];

        //copia pilha vermelha a partir do inicio
        for(int f = 0; f <= temporariaVermelho; f++)
            b[f]=array[f];


        int qtdPretos = capacidade - temporariaPreto; //confere a quantidade de items pretos no array original
        int novoTP = novaCapacidade - qtdPretos; //define a nota variavel temporaria da pilha preta
        //copa a pilha preta alocando ao final do array
        for(int i = 0; i < qtdPretos; i++){
            b[novoTP + i] = array[temporariaPreto + i];
        }

        this.array = b;
        this.temporariaPreto = novoTP;
        this.capacidade = novaCapacidade;
    }

    public void pushPilhaVermelha(Object o){
        // confere se a pilha vermelha bate na preta
        if(estaCheio()){
            //atualizar tamanho array
            atualizarTamanhoArray();
        }
        array[++temporariaVermelho] = o;
    }

    public void pushPilhaPreta(Object o){
        //confere se a pilha preta bate na vermelha
        if(estaCheio()){
           //atualiza tamanho array
           atualizarTamanhoArray();
        }
        array[--temporariaPreto] = o;
    }
    
    
    private void reduzirArray() {
        int novaCapacidade = Math.max(capacidadeMinima, capacidade / 2);
        
        // Só reduz se a nova capacidade for menor que a atual
        if (novaCapacidade >= capacidade) {
            return;
        }
        
        Object[] novoArray = new Object[novaCapacidade];
        
        // Copia pilha vermelha
        for (int i = 0; i <= temporariaVermelho; i++) {
            novoArray[i] = array[i];
        }
        
        // Copia pilha preta
        int qtdPretos = capacidade - temporariaPreto;
        int novoTopoPreto = novaCapacidade - qtdPretos;
        
        for (int i = 0; i < qtdPretos; i++) {
            novoArray[novoTopoPreto + i] = array[temporariaPreto + i];
        }
        
        this.array = novoArray;
        this.temporariaPreto = novoTopoPreto;
        this.capacidade = novaCapacidade;
        
        System.out.println("Array REDUZIDO para capacidade: " + capacidade);
    }

    // verifica se precisa reduzir
    private void verificarReducao() {
        int totalElementos = getTotalElementos();
        
        // Se a utilização for ≤ 1/3 da capacidade, reduz
        if (capacidade > capacidadeMinima && totalElementos <= capacidade / 3) {
            reduzirArray();
        }
    }

    //pop da pilha vermelha
    public Object popPilhaVermelha() {
        if (vermelhaVazia()) {
            throw new PilhaVaziaExcecao("A Pilha vermelha está vazia");
        }
        Object elemento = array[temporariaVermelho];
        array[temporariaVermelho] = null; // libera referência
        temporariaVermelho--;
        
        verificarReducao(); // verifica se precisa reduzir dps de remover
        
        return elemento;
    }

    // pop da pilha preta
    public Object popPilhaPreta() {
        if (pretaVazia()) {
            throw new PilhaVaziaExcecao("A Pilha preta está vazia");
        }
        Object elemento = array[temporariaPreto];
        array[temporariaPreto] = null; // libera referência
        temporariaPreto++;
        
        verificarReducao(); // verficia se precisa reduzir
        
        return elemento;
    }


    // metodos getters para testar
     public int getCapacidade() {
        return capacidade;
    }
    
    public int getTamanhoVermelha() {
        return temporariaVermelho + 1;
    }
    
    public int getTamanhoPreta() {
        return capacidade - temporariaPreto;
    }

    // verifica a quantidade de elementos na pilha
    private int getTotalElementos() {
        return (temporariaVermelho + 1) + (capacidade - temporariaPreto);
    }


    // Metodos para testar e ver arrays
    public void mostrar(){
        System.out.println("=== Estado das Pilhas ===");
        System.out.println("Capacidade: " + capacidade);
        System.out.println("Total elementos: " + getTotalElementos());
        System.out.println("Pilha Vermelha (topo → base): " + toStringVermelha());
        System.out.println("Pilha Preta (topo → base): " + toStringPreta());
        System.out.println("Array completo: " + java.util.Arrays.toString(array));
        System.out.println("---");
    } 

    // Converte a pilha vermelha para string
    public String toStringVermelha() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i <= temporariaVermelho; i++) {
            if (i > 0) sb.append(", ");
            sb.append(array[i]);
        }
        sb.append("]");
        return sb.toString();
    }
    
    // Converte a pilha preta para string
    public String toStringPreta() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = capacidade - 1; i >= temporariaPreto; i--) {
            if (i < capacidade - 1) sb.append(", ");
            sb.append(array[i]);
        }
        sb.append("]");
        return sb.toString();
    }

} 