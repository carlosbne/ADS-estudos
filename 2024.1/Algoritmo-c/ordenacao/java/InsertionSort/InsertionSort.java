import java.util.Random;

 class Insert {
    public void insertionSort(int arr[]){
        long tempoInicial = System.currentTimeMillis(); 

        for(int i = 0; i < arr.length; i++){
            int verifica = i;                                         //define primeiro elemento a ser verificado como o incial
            while(verifica > 0 && arr[verifica] < arr[verifica - 1]){ //enquanto verif > 0 E o elemento na posiçao verificada < q posição verif-1
                int temp = arr[verifica];                             //caso seja menor efetua a troca de posição
                arr[verifica] = arr[verifica - 1];
                arr[verifica - 1] = temp;
                verifica -= 1;
            }
        }
        //calcula o tempo 
        long tempoFinal = System.currentTimeMillis();
        System.out.println();
        /* System.out.println(tempoFinal +"\n"); */
        long tempoTotal =  tempoFinal - tempoInicial;
        System.out.println("O método foi executado em " + (tempoTotal/* /1000 */) + " ms\n");

        System.out.println("Array Ordenada: ");
        imprimir(arr);                         //chamada para imprimir ordenado

    }

    //função para gerar conjunto de dados aleatórios
    void gerador(int tamanho, int limite){
        int[] arr = new int[tamanho];            //cria array definindo tamanho
  
        for(int i = 0; i < tamanho; i++){        //laço para preencher array com números gerados
            Random rand = new Random();
            int number = rand.nextInt(limite);
            arr[i] = number;
        } 
        System.out.println("Array gerada: ");
        imprimir(arr);                          //chamada imprimir dados aleatórios
        insertionSort(arr);                        //chamada para ordenar
    }

    //funcao para imprimir o array
    public void imprimir(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
    public class InsertionSort{
        public static void main(String args[]) {
          Insert obj = new Insert();
          obj.gerador(10, 100);        //chama função geradora passando o temanho e limite do arr
        }
    }

