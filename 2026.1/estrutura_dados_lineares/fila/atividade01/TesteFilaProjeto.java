public class TesteFilaProjeto {

    public static void main(String[] args) {

        FilaProjeto fila = new FilaProjeto(4);

        System.out.println("iniciando testes\n");

        
        // 1. ENQUEUE NORMAL
        System.out.println("1. Inserindo elementos (enqueue normal):");

        fila.enqueue(10);
        fila.mostrar();

        fila.enqueue(20);
        fila.enqueue(30);
        fila.enqueue(40);
        fila.mostrar();

        // força crescimento
        fila.enqueue(50);
        fila.mostrar();

        
        // 2. DEQUEUE NORMA
        System.out.println("2. Removendo elementos (dequeue normal):");

        System.out.println("Dequeue: " + fila.dequeue());
        System.out.println("Dequeue: " + fila.dequeue());
        fila.mostrar();

        
        // 3. REVERSÃO

        System.out.println("3. Aplicando reverse():");

        fila.reverse();
        fila.mostrar();

        
        // 4. DEQUEUE APÓS REVERSÃO
        
        System.out.println("4. Removendo após reverse (deve sair do antigo fim):");

        System.out.println("Dequeue: " + fila.dequeue());
        fila.mostrar();

        
        // 5. ENQUEUE APÓS REVERSÃO
        
        System.out.println("5. Inserindo após reverse (entra no novo fim):");

        fila.enqueue(99);
        fila.enqueue(88);
        fila.mostrar();

        
        // 6. MAIS DEQUEUES     
        System.out.println("6. Mais remoções:");

        System.out.println("Dequeue: " + fila.dequeue());
        System.out.println("Dequeue: " + fila.dequeue());
        fila.mostrar();

        
        // 7. TESTE DE REDUÇÃO
        
        System.out.println("7. Testando redução do array:");

        fila.dequeue();
        fila.dequeue();
        fila.mostrar();

        
        // 8. REVERSÃO NOVAMENTE
        System.out.println("8. Revertendo novamente:");
        fila.reverse();
        fila.mostrar();

        fila.enqueue(111);
        fila.enqueue(222);
        fila.mostrar();

        System.out.println("Dequeue: " + fila.dequeue());
        fila.mostrar();
    }
}