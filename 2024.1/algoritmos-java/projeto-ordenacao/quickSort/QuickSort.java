import java.util.Random;

public class QuickSort {

     static void quicksort(int[] array) {
        quicksort(array, 0, array.length - 1);
      }

    static void quicksort(int arr[], int inicio, int fim){
        if(inicio >= fim){
            return;
        }

        int pivor = arr[fim];
        int ladoA = particao(arr, inicio, fim, pivor);

        quicksort(arr, inicio, ladoA - 1);
        quicksort(arr, ladoA + 1, fim);

    }

    static int particao(int arr[], int inicio, int fim, int pivor){
        int ladoA = inicio;
        int ladoB = fim -1;

        while(ladoA < ladoB){

            while (arr[ladoA] <= pivor && ladoA < ladoB) {
                ladoA++;
            }

            while(arr[ladoB] >= pivor && ladoA < ladoB){
                ladoB--;
            }

            troca(arr, ladoA, ladoB);
        }

        if(arr[ladoA] > arr[fim]){
            troca(arr, ladoA, fim);
        } else {
            ladoA = fim;
        }

        return ladoA;
    }

    static void troca(int arr[], int indexA, int indexB){
        int temp = arr[indexA];
        arr[indexA] = arr[indexB];
        arr[indexB] = temp;
    }

    void gerador(int tamanho, int limite){
        int[] arr = new int[tamanho];            //cria array definindo tamanho
  
        for(int i = 0; i < tamanho; i++){        //laço para preencher array com números gerados
            Random rand = new Random();
            int number = rand.nextInt(limite);
            arr[i] = number;
        } 
        System.out.println("Array gerada: ");
        imprimir(arr); 
        long inicio = System.currentTimeMillis(); // inicio tempo
        quicksort(arr); // chamada para ordenar
        // calcula o tempo
        long fim = System.currentTimeMillis(); // fim tempo
        System.out.println("\nArray ordenada: ");
        imprimir(arr);
        long tempo = fim - inicio;
        System.out.println("\nO método foi executado em " + (tempo) + " ms\n"); // imprime total tempo
    }

    //funcao para imprimir o array
    public void imprimir(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        QuickSort obj = new QuickSort();
        obj.gerador(1000, 100);        //chama função geradora passando o temanho e limite do arr
    }
}
