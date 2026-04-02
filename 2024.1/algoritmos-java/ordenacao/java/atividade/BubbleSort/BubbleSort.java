import java.util.Random;

class Bubble {
    void bubbleSort(int arr[]) {
      long tempoInicial = System.currentTimeMillis(); 

      System.out.println(tempoInicial +"\n");
      int len = arr.length;                   //tamanho do array
      int temp;                               //variavel temporária para troca
      for (int i = 0; i < len - 1; i++) {     //loop para cada elemento
        for (int j = 0; j < len - i - 1; j++) {
          if (arr[j] > arr[j + 1]) {          //verifica se o elemento ao lado é maior
            temp = arr[j];                    //usa o temp para auxiliar na troca
            arr[j] = arr[j + 1];
            arr[j + 1] = temp;
          }
        }
      }

      //calcula o tempo 
      long tempoFinal = System.currentTimeMillis();
      System.out.println(tempoFinal +"\n");
      long tempoTotal =  tempoFinal - tempoInicial;
      System.out.println("O método foi executado em " + (tempoTotal/* /1000 */) + " m segundos\n");

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
      bubbleSort(arr);                        //chamada para ordenar
  }
  
    //função para imprimir o array
    void imprimir(int arr[]) {
      for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + " ");
      }
      System.out.println();
    }
  }
  
  public class BubbleSort{
    public static void main(String args[]) {
      Bubble obj = new Bubble();
      obj.gerador(10, 100);        //chama função geradora passando o temanho e limite do arr
    }
  }
  