public class duasPilhasUmArray {
    
    public static void main(String[] args){
        /* Integer[] b = new Integer[1]; */
   PilhasDuplas pp = new PilhasDuplas(4); // Capacidade inicial maior
        System.out.println("=== Teste das Pilhas Duplas ===\n");
        
        System.out.println("1. Inserindo na pilha VERMELHA:");
        pp.pushPilhaVermelha(62);
        pp.mostrar();
        
        pp.pushPilhaVermelha(61);
        pp.pushPilhaVermelha(63);
        pp.pushPilhaVermelha(60);
        pp.mostrar();
        
        System.out.println("2. Inserindo na pilha PRETA:");
        pp.pushPilhaPreta(5);
        pp.mostrar();
        
        pp.pushPilhaPreta(4);
        pp.pushPilhaPreta(3);
        pp.mostrar();
        
        pp.pushPilhaPreta(2);
        pp.pushPilhaPreta(1);
        pp.mostrar();
        
        System.out.println("3. Testando POPs:");
        System.out.println("Pop Vermelha: " + pp.popPilhaVermelha());
        System.out.println("Pop Vermelha: " + pp.popPilhaVermelha());
        System.out.println("Pop Preta: " + pp.popPilhaPreta());
        pp.mostrar();
       
    } 
}