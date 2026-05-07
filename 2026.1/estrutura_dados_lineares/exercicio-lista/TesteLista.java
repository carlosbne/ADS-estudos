public class TesteLista {
    public static void main(String[] args) {
        System.out.println("--- Testando Lista Array ---");
        testar(new ListaArray());

        System.out.println("\n--- Testando Lista Encadeada ---");
        testar(new ListaDuplamenteEncadeada());
    }

    public static void testar(ILista lista) {
        lista.insertFirst("B");
        lista.insertFirst("A");
        lista.insertLast("C"); // Lista: A, B, C
        
        System.out.println("Tamanho: " + lista.size()); // 3
        System.out.println("Primeiro: " + lista.first()); // A
        System.out.println("Último: " + lista.last()); // C
        
        lista.swapElements(0, 2); // Lista: C, B, A
        System.out.println("Após swap (0,2), primeiro é: " + lista.first()); // C
        
        lista.insertBefore(1, "X"); // Lista: C, X, B, A
        System.out.println("Elemento após índice 1 (X): " + lista.after(1)); // B
        
        Object removido = lista.remove(2); // Remove B
        System.out.println("Removido: " + removido + " | Novo tamanho: " + lista.size());
    }
}