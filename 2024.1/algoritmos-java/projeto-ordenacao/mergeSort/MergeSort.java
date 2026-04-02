package mergeSort;

import java.util.Random;

class Merge {
    public void mergeSort(int arr[]){ 
        int tam = arr.length;
        if(tam < 2){
            return;
        }

        //define o tamnho e cria duas arrays
        int meio = tam/2;
        int[] ladoA = new int[meio];
        int[] ladoB = new int[tam - meio];

        //copia os dados da array principal para as duas temporarias
        for(int i = 0; i < meio; i++){
            ladoA[i] = arr[i];
        }
        for(int i = meio; i < tam; i++){
            ladoB[i - meio] = arr[i];
        }
        mergeSort(ladoA);
        mergeSort(ladoB);

        //chamada função merge passando as array temporarias
        merge(arr, ladoA, ladoB);
    }

    public void merge(int arr[], int ladoA[], int ladoB[]){
        int tamA = ladoA.length;
        int tamB = ladoB.length;

        int i = 0, j = 0, k = 0;        //variaveis para interar as array i = tamA, j = tamB, k = arr

        while(i < tamA && j < tamB){
            if(ladoA[i] <= ladoB[j]){
                arr[k] = ladoA[i];
                i++;
            } else {
                arr[k] = ladoB[j];
                j++;
            }
            k++;
        }
        while(i < tamA){
            arr[k] = ladoA[i];
            i++;
            k++;
        }
        while(j < tamB){
            arr[k] = ladoB[j];
            j++;
            k++;
        }
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
        long inicio = System.currentTimeMillis();     //inicio tempo
        mergeSort(arr);                               //chamada para ordenar
        //calcula o tempo 
        long fim = System.currentTimeMillis();        //fim tempo
        System.out.println("Array ordenada: ");
        long tempo =  fim - inicio;
        System.out.println("O método foi executado em " + (tempo/* /1000 */) + " ms\n"); //imprime total tempo
        System.out.println();
    }

    //funcao para imprimir o array
    public void imprimir(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}


public class MergeSort{
    public static void main(String args[]) {
    Merge obj = new Merge();
    obj.gerador(10, 100);        //chama função geradora passando o temanho e limite do arr
    }
}
