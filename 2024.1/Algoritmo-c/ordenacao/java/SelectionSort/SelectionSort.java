import java.util.Random;

class Selection {
    //funcao selectionsort 
    public void selectionSort(int arr[]){
        long tempoInicial = System.currentTimeMillis(); 

        for(int i = 0; i < arr.length - 1; i++){ 
            int menor = i;                              //define o menor como primeiro elemento
            for(int j = i + 1; j < arr.length; j++){
                if(arr[j] < arr[menor]){                //procura menor elemento a partir do i+1 até o último elemento
                    menor = j;                          
                }
            }
            if(menor != i){                             //se houver, troca o menor elemento encontrado com a posiçao inicial
                int temp = arr[i];
                arr[i] = arr[menor];
                arr[menor] = temp; 
            }
        }

        //calcula o tempo 
        long tempoFinal = System.currentTimeMillis();
        System.out.println();
        long tempoTotal =  tempoFinal - tempoInicial;
        System.out.println("O método foi executado em " + (tempoTotal/* /1000 */) + " ms\n"); 

        System.out.println("Array Ordenada: ");
        /* imprimir(arr); */                         //chamada para imprimir ordenado
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
        /* imprimir(arr); */                          //chamada imprimir dados aleatórios
        selectionSort(arr);                        //chamada para ordenar
    }

    //funcao para imprimir o array
    public void imprimir(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
    public class SelectionSort{
        public static void main(String args[]) {
          Selection obj = new Selection();
          obj.gerador(100000, 100);        //chama função geradora passando o temanho e limite do arr
        }

    }